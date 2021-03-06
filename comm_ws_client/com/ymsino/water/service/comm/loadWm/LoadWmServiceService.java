package com.ymsino.water.service.comm.loadWm;

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
 * LoadWmServiceService service = new LoadWmServiceService();
 * LoadWmService portType = service.getLoadWmServicePort();
 * portType.loadWm(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "LoadWmServiceService", targetNamespace = "http://api.service.comm.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/loadWmService?wsdl")
public class LoadWmServiceService extends Service {

	private final static URL LOADWMSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.comm.loadWm.LoadWmServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.comm.loadWm.LoadWmServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/loadWmService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/loadWmService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		LOADWMSERVICESERVICE_WSDL_LOCATION = url;
	}

	public LoadWmServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public LoadWmServiceService() {
		super(LOADWMSERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.comm.esb.ymsino.com/", "LoadWmServiceService"));
	}

	/**
	 * 
	 * @return returns LoadWmService
	 */
	@WebEndpoint(name = "LoadWmServicePort")
	public LoadWmService getLoadWmServicePort() {
		return super.getPort(new QName("http://api.service.comm.esb.ymsino.com/", "LoadWmServicePort"), LoadWmService.class);
	}

}
