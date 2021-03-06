package com.ymsino.water.service.data.waterMonthUsageAmount;

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
 * WaterMonthUsageAmountServiceService service = new WaterMonthUsageAmountServiceService();
 * WaterMonthUsageAmountService portType = service.getWaterMonthUsageAmountServicePort();
 * portType.getCount(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "WaterMonthUsageAmountServiceService", targetNamespace = "http://api.service.data.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/waterMonthUsageAmountService?wsdl")
public class WaterMonthUsageAmountServiceService extends Service {

	private final static URL WATERMONTHUSAGEAMOUNTSERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.data.waterMonthUsageAmount.WaterMonthUsageAmountServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.data.waterMonthUsageAmount.WaterMonthUsageAmountServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/waterMonthUsageAmountService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/waterMonthUsageAmountService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		WATERMONTHUSAGEAMOUNTSERVICESERVICE_WSDL_LOCATION = url;
	}

	public WaterMonthUsageAmountServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public WaterMonthUsageAmountServiceService() {
		super(WATERMONTHUSAGEAMOUNTSERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.data.esb.ymsino.com/", "WaterMonthUsageAmountServiceService"));
	}

	/**
	 * 
	 * @return returns WaterMonthUsageAmountService
	 */
	@WebEndpoint(name = "WaterMonthUsageAmountServicePort")
	public WaterMonthUsageAmountService getWaterMonthUsageAmountServicePort() {
		return super.getPort(new QName("http://api.service.data.esb.ymsino.com/", "WaterMonthUsageAmountServicePort"), WaterMonthUsageAmountService.class);
	}

}
