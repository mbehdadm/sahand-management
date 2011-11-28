package com.sahand.management.web;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;

import com.sahand.management.config.ManagementConfigLoader;
import com.sahand.management.proxy.service.administration.User;
import com.sahand.management.proxy.service.administration.UserAdministrationImpl;
import com.sahand.management.proxy.service.administration.UserAdministrationRq;
import com.sahand.management.proxy.service.administration.UserAdministrationRs;
import com.sahand.management.proxy.service.primary.AdministrationProccessor;

@Named
public class UserManagementAction implements Serializable {

	private List<User> users = new ArrayList<User>();

	public List<User> getUsers() {
		
		String connectionUrl = ManagementConfigLoader.getValue("administration-wsdl");
		
		UserAdministrationImpl service = AdministrationProccessor.getService(connectionUrl);
		UserAdministrationRq request = (UserAdministrationRq)Authentication.getRequestBase(UserAdministrationRq.class); 
		UserAdministrationRs response = service.getUserList(request);
				

		System.out.println(response.toString());
		users = response.getUserLists();		
		
		
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	


	

	
	
	
}
