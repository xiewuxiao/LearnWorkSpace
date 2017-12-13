
package com.ben.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ExternalWebService", targetNamespace = "http://ws.hello.ben.com/", wsdlLocation = "http://localhost:8081/services/ExternalWebService?wsdl")
public class ExternalWebService_Service
    extends Service
{

    private final static URL EXTERNALWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException EXTERNALWEBSERVICE_EXCEPTION;
    private final static QName EXTERNALWEBSERVICE_QNAME = new QName("http://ws.hello.ben.com/", "ExternalWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/services/ExternalWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXTERNALWEBSERVICE_WSDL_LOCATION = url;
        EXTERNALWEBSERVICE_EXCEPTION = e;
    }

    public ExternalWebService_Service() {
        super(__getWsdlLocation(), EXTERNALWEBSERVICE_QNAME);
    }

    public ExternalWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXTERNALWEBSERVICE_QNAME, features);
    }

    public ExternalWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, EXTERNALWEBSERVICE_QNAME);
    }

    public ExternalWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXTERNALWEBSERVICE_QNAME, features);
    }

    public ExternalWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExternalWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExternalWebService
     */
    @WebEndpoint(name = "ExternalWebServicePort")
    public ExternalWebService getExternalWebServicePort() {
        return super.getPort(new QName("http://ws.hello.ben.com/", "ExternalWebServicePort"), ExternalWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExternalWebService
     */
    @WebEndpoint(name = "ExternalWebServicePort")
    public ExternalWebService getExternalWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.hello.ben.com/", "ExternalWebServicePort"), ExternalWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXTERNALWEBSERVICE_EXCEPTION!= null) {
            throw EXTERNALWEBSERVICE_EXCEPTION;
        }
        return EXTERNALWEBSERVICE_WSDL_LOCATION;
    }

}
