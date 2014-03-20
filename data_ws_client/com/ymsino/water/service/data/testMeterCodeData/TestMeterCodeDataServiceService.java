package com.ymsino.water.service.data.testMeterCodeData;

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
 * TestMeterCodeDataServiceService service = new TestMeterCodeDataServiceService();
 * TestMeterCodeDataService portType = service.getTestMeterCodeDataServicePort();
 * portType.getCount(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "TestMeterCodeDataServiceService", targetNamespace = "http://api.service.data.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/testMeterCodeDataService?wsdl")
public class TestMeterCodeDataServiceService extends Service {

	private final static URL TESTMETERCODEDATASERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.data.testMeterCodeData.TestMeterCodeDataServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.data.testMeterCodeData.TestMeterCodeDataServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/testMeterCodeDataService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/testMeterCodeDataService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		TESTMETERCODEDATASERVICESERVICE_WSDL_LOCATION = url;
	}

	public TestMeterCodeDataServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public TestMeterCodeDataServiceService() {
		super(TESTMETERCODEDATASERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.data.esb.ymsino.com/", "TestMeterCodeDataServiceService"));
	}

	/**
	 * 
	 * @return returns TestMeterCodeDataService
	 */
	@WebEndpoint(name = "TestMeterCodeDataServicePort")
	public TestMeterCodeDataService getTestMeterCodeDataServicePort() {
		return super.getPort(new QName("http://api.service.data.esb.ymsino.com/", "TestMeterCodeDataServicePort"), TestMeterCodeDataService.class);
	}

}
