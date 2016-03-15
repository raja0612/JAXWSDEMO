package com.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**This interface acts as Service Endpoint interface.
 * @author RAJASHEKHAR
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	
	@WebMethod
	public String getHelloWorld(String message);

}
