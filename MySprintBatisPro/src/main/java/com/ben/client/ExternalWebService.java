
package com.ben.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ExternalWebService", targetNamespace = "http://ws.hello.ben.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ExternalWebService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.ben.client.LotteryResult>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLotteryResultList", targetNamespace = "http://ws.hello.ben.com/", className = "com.ben.client.GetLotteryResultList")
    @ResponseWrapper(localName = "getLotteryResultListResponse", targetNamespace = "http://ws.hello.ben.com/", className = "com.ben.client.GetLotteryResultListResponse")
    @Action(input = "http://ws.hello.ben.com/ExternalWebService/getLotteryResultListRequest", output = "http://ws.hello.ben.com/ExternalWebService/getLotteryResultListResponse")
    public List<LotteryResult> getLotteryResultList(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}