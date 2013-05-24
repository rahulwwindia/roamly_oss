package com.roamly.oss.model.login;

import com.google.gson.annotations.SerializedName;
import com.roamly.oss.ws.WsModel;

public class UserFullDetailsByUserName implements WsModel {
	
	@SerializedName("passHash") 
	private String userDetails; 
	     
	public String getUserDetails(){
		return userDetails;  
	} 

} 
