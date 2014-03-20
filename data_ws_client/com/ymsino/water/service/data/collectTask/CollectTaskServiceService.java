package com.ymsino.water.service.data.collectTask;

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
 * CollectTaskServiceService service = new CollectTaskServiceService();
 * CollectTaskService portType = service.getCollectTaskServicePort();
 * portType.getListpager(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "CollectTaskServiceService", targetNamespace = "http://api.service.data.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/collectTaskService?wsdl")
public class CollectTaskServiceService extends Service {

	private final static URL COLLECTTASKSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.data.collectTask.CollectTaskServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.data.collectTask.CollectTaskServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/collectTaskService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/collectTaskService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		COLLECTTASKSERVICESERVICE_WSDL_LOCATION = url;
	}

	public CollectTaskServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public CollectTaskServiceService() {
		super(COLLECTTASKSERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.data.esb.ymsino.com/", "CollectTaskServiceService"));
	}

	/**
	 * 
	 * @return returns CollectTaskService
	 */
	@WebEndpoint(name = "CollectTaskServicePort")
	public CollectTaskService getCollectTaskServicePort() {
		return super.getPort(new QName("http://api.service.data.esb.ymsino.com/", "CollectTaskServicePort"), CollectTaskService.class);
	}

}
