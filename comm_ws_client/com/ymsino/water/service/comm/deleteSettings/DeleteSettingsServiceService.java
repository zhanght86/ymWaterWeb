package com.ymsino.water.service.comm.deleteSettings;

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
 * DeleteSettingsServiceService service = new DeleteSettingsServiceService();
 * DeleteSettingsService portType = service.getDeleteSettingsServicePort();
 * portType.deleteSettings(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "DeleteSettingsServiceService", targetNamespace = "http://api.service.comm.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/deleteSettingsService?wsdl")
public class DeleteSettingsServiceService extends Service {

	private final static URL DELETESETTINGSSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.comm.deleteSettings.DeleteSettingsServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.comm.deleteSettings.DeleteSettingsServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/deleteSettingsService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/deleteSettingsService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		DELETESETTINGSSERVICESERVICE_WSDL_LOCATION = url;
	}

	public DeleteSettingsServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public DeleteSettingsServiceService() {
		super(DELETESETTINGSSERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.comm.esb.ymsino.com/", "DeleteSettingsServiceService"));
	}

	/**
	 * 
	 * @return returns DeleteSettingsService
	 */
	@WebEndpoint(name = "DeleteSettingsServicePort")
	public DeleteSettingsService getDeleteSettingsServicePort() {
		return super.getPort(new QName("http://api.service.comm.esb.ymsino.com/", "DeleteSettingsServicePort"), DeleteSettingsService.class);
	}

}
