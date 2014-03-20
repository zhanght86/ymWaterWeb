package com.ymsino.water.service.comm.deleteData;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390- Generated source version: 2.0
 * 
 */
@WebService(name = "DeleteDataService", targetNamespace = "http://api.service.comm.esb.ymsino.com/")
public interface DeleteDataService {

	/**
	 * 删除集中器历史数据
	 * 
	 * @param concHardwareId
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "deleteData", targetNamespace = "http://api.service.comm.esb.ymsino.com/", className = "com.ymsino.water.service.comm.deleteData.DeleteData")
	@ResponseWrapper(localName = "deleteDataResponse", targetNamespace = "http://api.service.comm.esb.ymsino.com/", className = "com.ymsino.water.service.comm.deleteData.DeleteDataResponse")
	public String deleteData(@WebParam(name = "concHardwareId", targetNamespace = "") String concHardwareId);

}
