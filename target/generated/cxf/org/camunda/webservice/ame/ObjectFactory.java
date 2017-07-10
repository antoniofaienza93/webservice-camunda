
package org.camunda.webservice.ame;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.camunda.webservice.ame package. 
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

    private final static QName _Prova5_QNAME = new QName("http://ame.webservice.camunda.org/", "prova5");
    private final static QName _Prova3Response_QNAME = new QName("http://ame.webservice.camunda.org/", "prova3Response");
    private final static QName _Prova4_QNAME = new QName("http://ame.webservice.camunda.org/", "prova4");
    private final static QName _SOAPException_QNAME = new QName("http://ame.webservice.camunda.org/", "SOAPException");
    private final static QName _Prova3_QNAME = new QName("http://ame.webservice.camunda.org/", "prova3");
    private final static QName _Prova2_QNAME = new QName("http://ame.webservice.camunda.org/", "prova2");
    private final static QName _Prova4Response_QNAME = new QName("http://ame.webservice.camunda.org/", "prova4Response");
    private final static QName _Prova5Response_QNAME = new QName("http://ame.webservice.camunda.org/", "prova5Response");
    private final static QName _InvokeProcessCallback_QNAME = new QName("http://ame.webservice.camunda.org/", "invokeProcessCallback");
    private final static QName _Prova2Response_QNAME = new QName("http://ame.webservice.camunda.org/", "prova2Response");
    private final static QName _InvokeProcessCallbackResponse_QNAME = new QName("http://ame.webservice.camunda.org/", "invokeProcessCallbackResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.camunda.webservice.ame
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Prova5Response }
     * 
     */
    public Prova5Response createProva5Response() {
        return new Prova5Response();
    }

    /**
     * Create an instance of {@link Prova3 }
     * 
     */
    public Prova3 createProva3() {
        return new Prova3();
    }

    /**
     * Create an instance of {@link Prova2Response }
     * 
     */
    public Prova2Response createProva2Response() {
        return new Prova2Response();
    }

    /**
     * Create an instance of {@link Prova3Response }
     * 
     */
    public Prova3Response createProva3Response() {
        return new Prova3Response();
    }

    /**
     * Create an instance of {@link Prova4 }
     * 
     */
    public Prova4 createProva4() {
        return new Prova4();
    }

    /**
     * Create an instance of {@link Prova2 }
     * 
     */
    public Prova2 createProva2() {
        return new Prova2();
    }

    /**
     * Create an instance of {@link Prova4Response }
     * 
     */
    public Prova4Response createProva4Response() {
        return new Prova4Response();
    }

    /**
     * Create an instance of {@link InvokeProcessCallback }
     * 
     */
    public InvokeProcessCallback createInvokeProcessCallback() {
        return new InvokeProcessCallback();
    }

    /**
     * Create an instance of {@link Prova5 }
     * 
     */
    public Prova5 createProva5() {
        return new Prova5();
    }

    /**
     * Create an instance of {@link SOAPException }
     * 
     */
    public SOAPException createSOAPException() {
        return new SOAPException();
    }

    /**
     * Create an instance of {@link InvokeProcessCallbackResponse }
     * 
     */
    public InvokeProcessCallbackResponse createInvokeProcessCallbackResponse() {
        return new InvokeProcessCallbackResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prova5 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "prova5")
    public JAXBElement<Prova5> createProva5(Prova5 value) {
        return new JAXBElement<Prova5>(_Prova5_QNAME, Prova5 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prova3Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "prova3Response")
    public JAXBElement<Prova3Response> createProva3Response(Prova3Response value) {
        return new JAXBElement<Prova3Response>(_Prova3Response_QNAME, Prova3Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prova4 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "prova4")
    public JAXBElement<Prova4> createProva4(Prova4 value) {
        return new JAXBElement<Prova4>(_Prova4_QNAME, Prova4 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SOAPException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "SOAPException")
    public JAXBElement<SOAPException> createSOAPException(SOAPException value) {
        return new JAXBElement<SOAPException>(_SOAPException_QNAME, SOAPException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prova3 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "prova3")
    public JAXBElement<Prova3> createProva3(Prova3 value) {
        return new JAXBElement<Prova3>(_Prova3_QNAME, Prova3 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prova2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "prova2")
    public JAXBElement<Prova2> createProva2(Prova2 value) {
        return new JAXBElement<Prova2>(_Prova2_QNAME, Prova2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prova4Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "prova4Response")
    public JAXBElement<Prova4Response> createProva4Response(Prova4Response value) {
        return new JAXBElement<Prova4Response>(_Prova4Response_QNAME, Prova4Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prova5Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "prova5Response")
    public JAXBElement<Prova5Response> createProva5Response(Prova5Response value) {
        return new JAXBElement<Prova5Response>(_Prova5Response_QNAME, Prova5Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeProcessCallback }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "invokeProcessCallback")
    public JAXBElement<InvokeProcessCallback> createInvokeProcessCallback(InvokeProcessCallback value) {
        return new JAXBElement<InvokeProcessCallback>(_InvokeProcessCallback_QNAME, InvokeProcessCallback.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prova2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "prova2Response")
    public JAXBElement<Prova2Response> createProva2Response(Prova2Response value) {
        return new JAXBElement<Prova2Response>(_Prova2Response_QNAME, Prova2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvokeProcessCallbackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ame.webservice.camunda.org/", name = "invokeProcessCallbackResponse")
    public JAXBElement<InvokeProcessCallbackResponse> createInvokeProcessCallbackResponse(InvokeProcessCallbackResponse value) {
        return new JAXBElement<InvokeProcessCallbackResponse>(_InvokeProcessCallbackResponse_QNAME, InvokeProcessCallbackResponse.class, null, value);
    }

}
