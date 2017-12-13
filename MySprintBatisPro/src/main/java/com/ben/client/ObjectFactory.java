
package com.ben.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ben.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetLotteryResultList_QNAME = new QName("http://ws.hello.ben.com/", "getLotteryResultList");
    private final static QName _GetLotteryResultListResponse_QNAME = new QName("http://ws.hello.ben.com/", "getLotteryResultListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ben.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLotteryResultList }
     * 
     */
    public GetLotteryResultList createGetLotteryResultList() {
        return new GetLotteryResultList();
    }

    /**
     * Create an instance of {@link GetLotteryResultListResponse }
     * 
     */
    public GetLotteryResultListResponse createGetLotteryResultListResponse() {
        return new GetLotteryResultListResponse();
    }

    /**
     * Create an instance of {@link LotteryResult }
     * 
     */
    public LotteryResult createLotteryResult() {
        return new LotteryResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLotteryResultList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hello.ben.com/", name = "getLotteryResultList")
    public JAXBElement<GetLotteryResultList> createGetLotteryResultList(GetLotteryResultList value) {
        return new JAXBElement<GetLotteryResultList>(_GetLotteryResultList_QNAME, GetLotteryResultList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLotteryResultListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hello.ben.com/", name = "getLotteryResultListResponse")
    public JAXBElement<GetLotteryResultListResponse> createGetLotteryResultListResponse(GetLotteryResultListResponse value) {
        return new JAXBElement<GetLotteryResultListResponse>(_GetLotteryResultListResponse_QNAME, GetLotteryResultListResponse.class, null, value);
    }

}
