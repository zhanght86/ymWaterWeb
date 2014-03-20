package com.ymsino.water.service.freesettle.waterMonthCost;

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
@WebService(name = "WaterMonthCostService", targetNamespace = "http://api.service.freesettle.esb.ymsino.com/")
public interface WaterMonthCostService {

	/**
	 * 根据id获取水表月费用对象
	 * 
	 * @param id
	 * @return returns com.ymsino.water.service.freesettle.waterMonthCost.WaterMonthCostReturn
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getById", targetNamespace = "http://api.service.freesettle.esb.ymsino.com/", className = "com.ymsino.water.service.freesettle.waterMonthCost.GetById")
	@ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://api.service.freesettle.esb.ymsino.com/", className = "com.ymsino.water.service.freesettle.waterMonthCost.GetByIdResponse")
	public WaterMonthCostReturn getById(@WebParam(name = "id", targetNamespace = "") Long id);

	/**
	 * 根据查询参数获取水表月费用分页列表
	 * 
	 * @param queryParam
	 * @param startRow
	 * @param pageSize
	 * @return returns java.util.List<com.ymsino.water.service.freesettle.waterMonthCost.WaterMonthCostReturn>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getListpager", targetNamespace = "http://api.service.freesettle.esb.ymsino.com/", className = "com.ymsino.water.service.freesettle.waterMonthCost.GetListpager")
	@ResponseWrapper(localName = "getListpagerResponse", targetNamespace = "http://api.service.freesettle.esb.ymsino.com/", className = "com.ymsino.water.service.freesettle.waterMonthCost.GetListpagerResponse")
	public List<WaterMonthCostReturn> getListpager(@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam, @WebParam(name = "startRow", targetNamespace = "") Integer startRow, @WebParam(name = "pageSize", targetNamespace = "") Integer pageSize);

	/**
	 * 根据查询参数获取水表月费用总记录数
	 * 
	 * @param queryParam
	 * @return returns java.lang.Integer
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getCount", targetNamespace = "http://api.service.freesettle.esb.ymsino.com/", className = "com.ymsino.water.service.freesettle.waterMonthCost.GetCount")
	@ResponseWrapper(localName = "getCountResponse", targetNamespace = "http://api.service.freesettle.esb.ymsino.com/", className = "com.ymsino.water.service.freesettle.waterMonthCost.GetCountResponse")
	public Integer getCount(@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam);

}
