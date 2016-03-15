package com.soap.ws.client;

import java.net.MalformedURLException;
import java.net.URL;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.soap.ws.HelloWorld;

/**This WebService client is used to call the endpoint service url.
 * @author RAJASHEKHAR
 *
 */
public class HelloWorldClient {
	public static void main(String args[]) throws MalformedURLException{
	
	URL url = new URL("http://localhost:9999/ws/hello?wsdl");
	
	QName qname = new QName("http://ws.soap.com/", "HelloWorldImplService");
	
	Service service = Service.create(url,qname);
	
	  HelloWorld helloWorld = service.getPort(HelloWorld.class);
	  
	   System.out.println(helloWorld.getHelloWorld("Raja"));
	}
}
