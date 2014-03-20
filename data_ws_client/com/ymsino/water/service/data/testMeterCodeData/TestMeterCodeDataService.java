package com.ymsino.water.service.data.testMeterCodeData;

import java.util.List;
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
@WebService(name = "TestMeterCodeDataService", targetNamespace = "http://api.service.data.esb.ymsino.com/")
public interface TestMeterCodeDataService {

	/**
	 * 根据查询参数获取集中器实时召测表码总记录数
	 * 
	 * @param queryParam
	 * @return returns java.lang.Integer
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getCount", targetNamespace = "http://api.service.data.esb.ymsino.com/", className = "com.ymsino.water.service.data.testMeterCodeData.GetCount")
	@ResponseWrapper(localName = "getCountResponse", targetNamespace = "http://api.service.data.esb.ymsino.com/", className = "com.ymsino.water.service.data.testMeterCodeData.GetCountResponse")
	public Integer getCount(@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam);

	/**
	 * 根据查询参数获取集中器实时召测表码分页列表
	 * 
	 * @param queryParam
	 * @param startRow
	 * @param pageSize
	 * @return returns java.util.List<com.ymsino.water.service.data.testMeterCodeData.TestMeterCodeDataReturn>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getListpager", targetNamespace = "http://api.service.data.esb.ymsino.com/", className = "com.ymsino.water.service.data.testMeterCodeData.GetListpager")
	@ResponseWrapper(localName = "getListpagerResponse", targetNamespace = "http://api.service.data.esb.ymsino.com/", className = "com.ymsino.water.service.data.testMeterCodeData.GetListpagerResponse")
	public List<TestMeterCodeDataReturn> getListpager(@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam, @WebParam(name = "startRow", targetNamespace = "") Integer startRow, @WebParam(name = "pageSize", targetNamespace = "") Integer pageSize);

	/**
	 * 根据id获取集中器实时召测表码
	 * 
	 * @param id
	 * @return returns com.ymsino.water.service.data.testMeterCodeData.TestMeterCodeDataReturn
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getById", targetNamespace = "http://api.service.data.esb.ymsino.com/", className = "com.ymsino.water.service.data.testMeterCodeData.GetById")
	@ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://api.service.data.esb.ymsino.com/", className = "com.ymsino.water.service.data.testMeterCodeData.GetByIdResponse")
	public TestMeterCodeDataReturn getById(@WebParam(name = "id", targetNamespace = "") Long id);

}
