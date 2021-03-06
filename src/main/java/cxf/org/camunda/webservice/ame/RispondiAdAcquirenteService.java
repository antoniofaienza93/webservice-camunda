package cxf.org.camunda.webservice.ame;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2017-07-10T17:04:36.362+02:00
 * Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "RispondiAdAcquirenteService", 
                  wsdlLocation = "file:/C:/Users/afaie/workspace/soseng/src/main/resources/RispondiAdAcquirenteService.wsdl",
                  targetNamespace = "http://ame.webservice.camunda.org/") 
public class RispondiAdAcquirenteService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ame.webservice.camunda.org/", "RispondiAdAcquirenteService");
    public final static QName RispondiAdAcquirentePort = new QName("http://ame.webservice.camunda.org/", "RispondiAdAcquirentePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/afaie/workspace/soseng/src/main/resources/RispondiAdAcquirenteService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(RispondiAdAcquirenteService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/afaie/workspace/soseng/src/main/resources/RispondiAdAcquirenteService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public RispondiAdAcquirenteService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public RispondiAdAcquirenteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RispondiAdAcquirenteService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RispondiAdAcquirenteService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RispondiAdAcquirenteService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public RispondiAdAcquirenteService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns RispondiAdAcquirente
     */
    @WebEndpoint(name = "RispondiAdAcquirentePort")
    public RispondiAdAcquirente getRispondiAdAcquirentePort() {
        return super.getPort(RispondiAdAcquirentePort, RispondiAdAcquirente.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RispondiAdAcquirente
     */
    @WebEndpoint(name = "RispondiAdAcquirentePort")
    public RispondiAdAcquirente getRispondiAdAcquirentePort(WebServiceFeature... features) {
        return super.getPort(RispondiAdAcquirentePort, RispondiAdAcquirente.class, features);
    }

}
