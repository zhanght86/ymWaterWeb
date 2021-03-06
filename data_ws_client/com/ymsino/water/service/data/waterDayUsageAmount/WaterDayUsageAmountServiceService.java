package com.ymsino.water.service.data.waterDayUsageAmount;

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
 * WaterDayUsageAmountServiceService service = new WaterDayUsageAmountServiceService();
 * WaterDayUsageAmountService portType = service.getWaterDayUsageAmountServicePort();
 * portType.getCount(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "WaterDayUsageAmountServiceService", targetNamespace = "http://api.service.data.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/waterDayUsageAmountService?wsdl")
public class WaterDayUsageAmountServiceService extends Service {

	private final static URL WATERDAYUSAGEAMOUNTSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.data.waterDayUsageAmount.WaterDayUsageAmountServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.data.waterDayUsageAmount.WaterDayUsageAmountServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/waterDayUsageAmountService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/waterDayUsageAmountService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		WATERDAYUSAGEAMOUNTSERVICESERVICE_WSDL_LOCATION = url;
	}

	public WaterDayUsageAmountServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public WaterDayUsageAmountServiceService() {
		super(WATERDAYUSAGEAMOUNTSERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.data.esb.ymsino.com/", "WaterDayUsageAmountServiceService"));
	}

	/**
	 * 
	 * @return returns WaterDayUsageAmountService
	 */
	@WebEndpoint(name = "WaterDayUsageAmountServicePort")
	public WaterDayUsageAmountService getWaterDayUsageAmountServicePort() {
		return super.getPort(new QName("http://api.service.data.esb.ymsino.com/", "WaterDayUsageAmountServicePort"), WaterDayUsageAmountService.class);
	}

}
