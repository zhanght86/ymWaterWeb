package com.ymsino.water.service.manager.chargingUnit;

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
@WebService(name = "ChargingUnitService", targetNamespace = "http://api.service.manager.esb.ymsino.com/")
public interface ChargingUnitService {

	/**
	 * 根据id获取收费单位实体
	 * 
	 * @param unitId
	 * @return returns com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getByUnitId", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.GetByUnitId")
	@ResponseWrapper(localName = "getByUnitIdResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.GetByUnitIdResponse")
	public ChargingUnitReturn getByUnitId(@WebParam(name = "unitId", targetNamespace = "") String unitId);

	/**
	 * 保存收费单位
	 * 
	 * @param chargingUnitSaveParam
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "save", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.Save")
	@ResponseWrapper(localName = "saveResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.SaveResponse")
	public Boolean save(@WebParam(name = "chargingUnitSaveParam", targetNamespace = "") ChargingUnitSaveParam chargingUnitSaveParam);

	/**
	 * 根据查询参数获取收费单位分页列表
	 * 
	 * @param queryParam
	 * @param startRow
	 * @param pageSize
	 * @return returns java.util.List<com.ymsino.water.service.manager.chargingUnit.ChargingUnitReturn>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getListpager", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.GetListpager")
	@ResponseWrapper(localName = "getListpagerResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.GetListpagerResponse")
	public List<ChargingUnitReturn> getListpager(@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam, @WebParam(name = "startRow", targetNamespace = "") Integer startRow, @WebParam(name = "pageSize", targetNamespace = "") Integer pageSize);

	/**
	 * 删除（有下级单位的不可删除）
	 * 
	 * @param unitId
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "closeStatus", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.CloseStatus")
	@ResponseWrapper(localName = "closeStatusResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.CloseStatusResponse")
	public Boolean closeStatus(@WebParam(name = "unitId", targetNamespace = "") String unitId);

	/**
	 * 修改收费单位
	 * 
	 * @param chargingUnitModifyParam
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "modify", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.Modify")
	@ResponseWrapper(localName = "modifyResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.ModifyResponse")
	public Boolean modify(@WebParam(name = "chargingUnitModifyParam", targetNamespace = "") ChargingUnitModifyParam chargingUnitModifyParam);

	/**
	 * 根据查询参数获取收费单位记录数
	 * 
	 * @param queryParam
	 * @return returns java.lang.Integer
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getCount", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.GetCount")
	@ResponseWrapper(localName = "getCountResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.GetCountResponse")
	public Integer getCount(@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam);

	/**
	 * 启用或删除之后恢复
	 * 
	 * @param unitId
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "openStatus", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.OpenStatus")
	@ResponseWrapper(localName = "openStatusResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.OpenStatusResponse")
	public Boolean openStatus(@WebParam(name = "unitId", targetNamespace = "") String unitId);

	/**
	 * 删除（真实删除，只有新建状态的收费单位可删除）
	 * 
	 * @param unitId
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "delete", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.Delete")
	@ResponseWrapper(localName = "deleteResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.chargingUnit.DeleteResponse")
	public Boolean delete(@WebParam(name = "unitId", targetNamespace = "") String unitId);

}
