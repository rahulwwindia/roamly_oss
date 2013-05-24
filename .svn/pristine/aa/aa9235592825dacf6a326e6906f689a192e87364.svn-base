<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title><spring:message code="label.title" /></title>
<link href="<%=request.getContextPath()%>/resources/styles/style.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=request.getContextPath()%>/resources/styles/style_user.css"
	rel="stylesheet" type="text/css" />
	
	<link href="<%=request.getContextPath()%>/resources/styles/main.css"
	rel="stylesheet" type="text/css" />
	
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 0px;
}
</style>

</head>

<body>
<div id="contentBox">
	<div id="header" class="full-width clear" style="width: 958px;">
          <div id="header-inner" class="inner-width clear">  
              <div class="header-top clear">
                  <div class="left"><img src="<%=request.getContextPath()%>/resources/images/logo.png" alt="Roamly - Roam Like Home" title="Roamly - Roam Like Home" /></div>
                  <div class="right">  
                     </div>     
              </div> 
              <div class="clear"></div>
              <div class="header-bottom clear">
                  <div class="left">
                  </div> 
                  <%-- <div class="right">
                      <a href="?lang=en" title="USA" class="country usa"><spring:message code="label.USA"/></a>
                      <a href="?lang=de" title="Russia" class="country russia"><spring:message code="label.Russia"/></a>
                  </div> --%>
              </div>
          </div> 
          <div class="clear"></div> 
          <div id="nav-top" class="clear">
              <div id="nav-top-inner" class="inner-width clear" style="text-align:right">
              </div>
          </div>
        </div> 
		
			<div id="accountContent2" class="full-wid" style="min-height: 500px;">
				<div id="contentTitle">
					<span class="title"><spring:message code="label.login" /></span>
				</div>

				<div id="login">
					<div class="body-text">
					<ul class="makelist">
						<table border="0" align="center">
							<tr>
							<td><!-- Login --> <c:if test="${not empty error}">
										<div class="errorblock">
											<spring:message code="label.loginErrorMessage" />
											<br />  
											${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
										</div>
									</c:if></td></tr>
							<tr>
								<td>
									
									
										<form name='f' action="<c:url value='j_spring_security_check' />"
											method="post">
											<li><label><spring:message code="label.userName" /></label>
												<input name='j_username' value='' required="required"
												type="text" class="textfield" /></li>
											<li><label><spring:message code="label.password" /></label>
												<input type='password' name='j_password' required="required"
									 			class="textfield" /></li>
											<li><span class="fl"> <a href="#" 
					 onclick="document.f.submit();" hidefocus="true" title="submit" hidefocus="true" id="ctl00_ContentPlaceHolder1_ib_autorefill"
				    class="r-button orange header-button" style="margin-left: 0px;">Login</a>&nbsp;&nbsp;&nbsp; 
											</span> <span class="fr"><a href="#"><spring:message
															code="label.forgotPassword" /></a></span></li>
										</form>
										<%-- <a href="./registration.htm"><spring:message
												code="label.signUp" /></a> --%>
								
									<div class="clr"></div>
								</td>
							</tr>
						</table>  
							</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
