package com.sahand.management.web;

import java.io.Serializable;
import java.util.Date;

import javax.enterprise.context.SessionScoped;

import com.sahand.management.config.ManagementConfigLoader;
import com.sahand.management.proxy.service.administration.Credential;
import com.sahand.management.proxy.service.administration.CredentialTypeEnum;
import com.sahand.management.proxy.service.administration.RequestBase;
import com.sahand.management.proxy.service.administration.UserAdministrationRq;



@SessionScoped
public class Authentication implements Serializable {

	
	
	private static RequestBase requestBase;

	public Authentication() {
		super();
		requestBase = new RequestBase();
		requestBase.setMac("123");
		requestBase.setClientIpAddress("127.0.0.1");
		requestBase.setRequstDate(new Date());
		requestBase.setSessionId(ManagementConfigLoader.getValue("sessionId"));
		requestBase.setUserName(ManagementConfigLoader.getValue("username"));
		Credential  credential = new Credential();
		credential.setTicket(ManagementConfigLoader.getValue("sessionId"));
		credential.setType(CredentialTypeEnum.PASSWORD);
		requestBase.setCredential(new Credential());
	}

	public Authentication(Class request) {
		
	}
	
	public static  RequestBase getRequestBase(
			Class Clazz) {
		try{
			requestBase = (RequestBase)Clazz.newInstance();
			requestBase.setMac("123");
			requestBase.setClientIpAddress("127.0.0.1");
			requestBase.setRequstDate(new Date());
			requestBase.setSessionId(ManagementConfigLoader.getValue("sessionId"));
			requestBase.setUserName(ManagementConfigLoader.getValue("username"));

			Credential  credential = new Credential();
			credential.setTicket(ManagementConfigLoader.getValue("sessionId"));
			credential.setType(CredentialTypeEnum.PASSWORD);
			requestBase.setCredential(credential);
			}catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println(requestBase.toString());
		return requestBase;
	}
	
	
	
	
	
}
