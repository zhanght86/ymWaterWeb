package com.ymsino.water.service.comm.conDebug;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390- Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 * 
 * <pre>
 * ConDebugServiceService service = new ConDebugServiceService();
 * ConDebugService portType = service.getConDebugServicePort();
 * portType.debug(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "ConDebugServiceService", targetNamespace = "http://api.service.comm.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/conDebugService?wsdl")
public class ConDebugServiceService extends Service {

	private final static URL CONDEBUGSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.comm.conDebug.ConDebugServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.comm.conDebug.ConDebugServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/conDebugService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/conDebugService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		CONDEBUGSERVICESERVICE_WSDL_LOCATION = url;
	}

	public ConDebugServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ConDebugServiceService() {
		super(CONDEBUGSERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.comm.esb.ymsino.com/", "ConDebugServiceService"));
	}

	/**
	 * 
	 * @return returns ConDebugService
	 */
	@WebEndpoint(name = "ConDebugServicePort")
	public ConDebugService getConDebugServicePort() {
		return super.getPort(new QName("http://api.service.comm.esb.ymsino.com/", "ConDebugServicePort"), ConDebugService.class);
	}

}
