package com.soap.ws.client;

import com.soap.ws.wsimport.HelloWorld;
import com.soap.ws.wsimport.HelloWorldImplService;

/**Client class for wsimport stub endpoint service.
 * @author RAJASHEKHAR
 *
 */
public class HelloWorldWsImportClient{
	
	public static void main(String[] args) {
	   
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
	
		System.out.println(hello.getHelloWorld("Rajashekhar"));
		
    }

}
