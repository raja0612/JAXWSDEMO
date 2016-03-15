
package com.soap.ws.wsimport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/** This  class stub generated by wsimport command.
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
/**
 * @author RAJASHEKHAR
 *
 */
@WebService(name = "HelloWorld", targetNamespace = "http://ws.soap.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ws.soap.com/HelloWorld/getHelloWorldRequest", output = "http://ws.soap.com/HelloWorld/getHelloWorldResponse")
    public String getHelloWorld(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}