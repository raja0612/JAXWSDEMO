package com.soap.ws.endpoint;

import javax.xml.ws.Endpoint;

import com.soap.ws.HelloWorldImpl;

/**This is end point publisher.
 * @author RAJASHEKHAR
 *
 */
public class HelloWorldPublisher {
	public static void main(String args[]){
		//This endpoint publish webservice  at below url with ?wsdl extension
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}

}
