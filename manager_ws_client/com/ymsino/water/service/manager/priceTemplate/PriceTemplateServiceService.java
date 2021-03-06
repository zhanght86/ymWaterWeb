package com.ymsino.water.service.manager.priceTemplate;

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
 * PriceTemplateServiceService service = new PriceTemplateServiceService();
 * PriceTemplateService portType = service.getPriceTemplateServicePort();
 * portType.getListpager(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "PriceTemplateServiceService", targetNamespace = "http://api.service.manager.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/priceTemplateService?wsdl")
public class PriceTemplateServiceService extends Service {

	private final static URL PRICETEMPLATESERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.manager.priceTemplate.PriceTemplateServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.manager.priceTemplate.PriceTemplateServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/priceTemplateService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/priceTemplateService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		PRICETEMPLATESERVICESERVICE_WSDL_LOCATION = url;
	}

	public PriceTemplateServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public PriceTemplateServiceService() {
		super(PRICETEMPLATESERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.manager.esb.ymsino.com/", "PriceTemplateServiceService"));
	}

	/**
	 * 
	 * @return returns PriceTemplateService
	 */
	@WebEndpoint(name = "PriceTemplateServicePort")
	public PriceTemplateService getPriceTemplateServicePort() {
		return super.getPort(new QName("http://api.service.manager.esb.ymsino.com/", "PriceTemplateServicePort"), PriceTemplateService.class);
	}

}
