package com.soap.ws;

import javax.jws.WebService;

/** Service Endpoint Implementation
 * @author RAJASHEKHAR
 *
 */
@WebService(endpointInterface="com.soap.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorld(String message) {
		
		return " Welcome to JAX-WS "+message;
	}

}
