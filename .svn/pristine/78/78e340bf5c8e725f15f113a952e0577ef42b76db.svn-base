package com.roamly.oss.ws;

import java.util.Map;

import com.roamly.oss.model.login.UserFullDetailsByUserName;

/**
 * Object having url and parameters to consume web service  
 * @document UserDetailsByUserNameWebService.java
 * @author Rahul Mahajan
 * @version 1.0
 * @date 18/11/2012
 */
public class UserDetailsByUserNameWebService extends WebService<WsModel> {

	public UserDetailsByUserNameWebService(Map<String, String> params)
	{ 
		super(params);  
	} 
	@Override    
	protected String getURL() {  
		    return getWsUrl("ws.passHashByLogin");      
	}         
      
	@Override
	protected Class<?> getMapperClass() {
		  
		return UserFullDetailsByUserName.class;   
	}

	
}
