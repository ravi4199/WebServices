package com.delta.sample.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorld {
	
	@WebMethod
	public String getMessage(String name) {
		return "Hello: "+name;
	}
	
	
}
