package com.ymsino.water.service.freesettle.waterDayCost;

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
 * WaterDayCostServiceService service = new WaterDayCostServiceService();
 * WaterDayCostService portType = service.getWaterDayCostServicePort();
 * portType.getById(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "WaterDayCostServiceService", targetNamespace = "http://api.service.freesettle.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/waterDayCostService?wsdl")
public class WaterDayCostServiceService extends Service {

	private final static URL WATERDAYCOSTSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.freesettle.waterDayCost.WaterDayCostServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.freesettle.waterDayCost.WaterDayCostServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/waterDayCostService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/waterDayCostService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		WATERDAYCOSTSERVICESERVICE_WSDL_LOCATION = url;
	}

	public WaterDayCostServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public WaterDayCostServiceService() {
		super(WATERDAYCOSTSERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.freesettle.esb.ymsino.com/", "WaterDayCostServiceService"));
	}

	/**
	 * 
	 * @return returns WaterDayCostService
	 */
	@WebEndpoint(name = "WaterDayCostServicePort")
	public WaterDayCostService getWaterDayCostServicePort() {
		return super.getPort(new QName("http://api.service.freesettle.esb.ymsino.com/", "WaterDayCostServicePort"), WaterDayCostService.class);
	}

}
