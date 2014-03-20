package com.ymsino.water.service.comm.testData;

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
 * TestDataServiceService service = new TestDataServiceService();
 * TestDataService portType = service.getTestDataServicePort();
 * portType.testData(...);
 * </pre>
 * 
 * </p>
 * 
 */
@WebServiceClient(name = "TestDataServiceService", targetNamespace = "http://api.service.comm.esb.ymsino.com/", wsdlLocation = "http://127.0.0.1:8882/ws/testDataService?wsdl")
public class TestDataServiceService extends Service {

	private final static URL TESTDATASERVICESERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger.getLogger(com.ymsino.water.service.comm.testData.TestDataServiceService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = com.ymsino.water.service.comm.testData.TestDataServiceService.class.getResource(".");
			url = new URL(baseUrl, "http://127.0.0.1:8882/ws/testDataService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://127.0.0.1:8882/ws/testDataService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		TESTDATASERVICESERVICE_WSDL_LOCATION = url;
	}

	public TestDataServiceService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public TestDataServiceService() {
		super(TESTDATASERVICESERVICE_WSDL_LOCATION, new QName("http://api.service.comm.esb.ymsino.com/", "TestDataServiceService"));
	}

	/**
	 * 
	 * @return returns TestDataService
	 */
	@WebEndpoint(name = "TestDataServicePort")
	public TestDataService getTestDataServicePort() {
		return super.getPort(new QName("http://api.service.comm.esb.ymsino.com/", "TestDataServicePort"), TestDataService.class);
	}

}
