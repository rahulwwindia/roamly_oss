package com.roamly.oss.controllers.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.roamly.oss.model.login.UserFullDetail;
import com.roamly.oss.model.login.UserFullDetailsByUserName;
import com.roamly.oss.model.login.UserFullDetailsRs;
import com.roamly.oss.ws.UserDetailsByUserNameWebService;
import com.roamly.oss.ws.UserDetailsWebService;

/**
 * 
 * Authenticate user on the basic of there role.
 * 
 * @document CustomAuthenticationProvider.java
 * @author Rahul Mahajan
 * @version 1.0
 * @date 05/10/2012
 */

public class CustomAuthenticationProvider implements AuthenticationProvider {

	static final List<GrantedAuthority> AUTHORITIES = new ArrayList<GrantedAuthority>();
	private static Logger logger = Logger.getLogger(CustomAuthenticationProvider.class);

	/**
	 * authenticate user by login name and password, for unauthorised user
	 * BadCredentialsException will be thrown
	 * 
	 * @param authentication
	 * @throws org.springframework.security.core.AuthenticationException
	 * @return Authentication object
	 */
	public Authentication authenticate(Authentication authentication)
			throws org.springframework.security.core.AuthenticationException {
		UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
		String username = String.valueOf(auth.getPrincipal());
		String password = String.valueOf(auth.getCredentials());
		if (username.trim().length() < 1) {
			throw new BadCredentialsException("User name is required ");
		}
		
		if (password.trim().length() < 1) {
			throw new BadCredentialsException("Password is required ");
		}

		
		UserFullDetail user = null;
		
		logger.info("username:" + username);
		logger.info("password:" + password); // Don't log passwords in real

		Map<String, String> params = new HashMap<String, String>();

			params.put("login", username.trim());
			UserDetailsByUserNameWebService detailsByUserNameWebService = new UserDetailsByUserNameWebService(
					params);
			try { 
				UserFullDetailsByUserName userDetailsByUserName = (UserFullDetailsByUserName) detailsByUserNameWebService
						.getResponseObject();
				String dataFrmDB = userDetailsByUserName.getUserDetails();
				String pwdNSaltFrmDb[] = dataFrmDB.split(":");

				String hashedPwdFrmDb = pwdNSaltFrmDb[0];
				logger.info("hashedPwdFrmDb :" + hashedPwdFrmDb);
				String salt = pwdNSaltFrmDb[1];
				String hashedPwd = Hash.genHash(password.trim(), salt.trim());
				logger.info("Salt -             :" + salt.trim());
				logger.info("hashedPwd (gen) + Salt   :" +  hashedPwd.trim() + ":" + salt);
				if (hashedPwd.trim().equalsIgnoreCase(hashedPwdFrmDb.trim())) {
					params.put("username", username.trim());
					params.put("password", hashedPwd.trim() + ":" + salt);

					UserDetailsWebService userDetailsWebService = new UserDetailsWebService(
							params);

					UserFullDetailsRs userDetailsRs = (UserFullDetailsRs) userDetailsWebService
							.getResponseObject();
					List<UserFullDetail> userDetails = userDetailsRs.getUserDetails();
					logger.info("User Details List  " + userDetails);
					user = userDetails.get(0);
					logger.info("User ROLE  " + user.getRole()); 
					AUTHORITIES.add(new GrantedAuthorityImpl(user.getRole()));
					CustomAuthenticationProvider.session().setAttribute("userObj", user);
					CustomAuthenticationProvider.session().setAttribute("userRole", user.getRole());
					
				} else {
					throw new BadCredentialsException(
							"Username/Password does not match for "
									+ auth.getPrincipal());
				}
 
			} catch (Exception e) {

				logger.info("Exception: " + e);
				throw new BadCredentialsException(
						"Username/Password does not match for "
								+ auth.getPrincipal());
			}


		return new UsernamePasswordAuthenticationToken(user.getUsername(),
				user.getPassword(), AUTHORITIES);

	}

	/**
	 * Method use to get httpsession object
	 * 
	 * @return session
	 */
	public static HttpSession session() {
		ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder
				.currentRequestAttributes();
		return attr.getRequest().getSession(true);
	}

	public boolean supports(Class<? extends Object> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}

}
