package com.sahand.management.proxy.service.primary;

import java.io.Serializable;
import java.net.URL;

import javax.xml.namespace.QName;

import org.slf4j.Logger;

import com.sahand.common.util.logger.SahandLogger;
import com.sahand.management.config.ManagementConfigLoader;
import com.sahand.management.proxy.service.administration.UserAdministrationImpl;
import com.sahand.management.proxy.service.administration.UserAdministrationImplService;

/**
 * @author Bmoodi
 *
 * 22 May 2011
 *
 */
public class AdministrationProccessor implements Serializable{
	
	private final  static Logger logger = SahandLogger.getSahandLogger(AdministrationProccessor.class);
	
	static UserAdministrationImpl service;
	
	static UserAdministrationImplService administrationImpl;
	
	
	public static boolean initService(String connectionUrl){
		try {
			String urlPath  = connectionUrl;
			if(urlPath == null)
				urlPath = ManagementConfigLoader.getValue("administration-wsdl");
			URL url = new URL(urlPath);
			logger.info("Administration Service URL : "+url);
			QName qname = new QName("http://service.administration.industrial.sahand.com/", "UserAdministrationImplService");

			administrationImpl = new UserAdministrationImplService(url,qname);
			service = administrationImpl.getPort(UserAdministrationImpl.class);
			if(service == null){
				return false;
			}
			logger.debug(":::::::::"+service+":::::::::");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	public static UserAdministrationImpl getService(){
		if(initService(null))
			return service;
		return null;
	}
	
	public static UserAdministrationImpl getService(String connectionUrl){
		if(initService(connectionUrl))
			return service;
		return null;
	}
	
	
}
