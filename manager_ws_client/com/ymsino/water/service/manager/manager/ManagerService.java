package com.ymsino.water.service.manager.manager;

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
@WebService(name = "ManagerService", targetNamespace = "http://api.service.manager.esb.ymsino.com/")
public interface ManagerService {

	/**
	 * 登录(密码为明文密码,只有状态为开通的管理员才能登录)
	 * 
	 * @param mangerId
	 * @param password
	 * @return returns com.ymsino.water.service.manager.manager.ManagerReturn
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "login", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.Login")
	@ResponseWrapper(localName = "loginResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.LoginResponse")
	public ManagerReturn login(@WebParam(name = "mangerId", targetNamespace = "") String mangerId, @WebParam(name = "password", targetNamespace = "") String password);

	/**
	 * 保存管理员
	 * 
	 * @param managerSaveParam
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "save", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.Save")
	@ResponseWrapper(localName = "saveResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.SaveResponse")
	public Boolean save(@WebParam(name = "managerSaveParam", targetNamespace = "") ManagerSaveParam managerSaveParam);

	/**
	 * 根据查询参数获取管理员分页列表
	 * 
	 * @param queryParam
	 * @param startRow
	 * @param pageSize
	 * @return returns java.util.List<com.ymsino.water.service.manager.manager.ManagerReturn>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getListpager", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.GetListpager")
	@ResponseWrapper(localName = "getListpagerResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.GetListpagerResponse")
	public List<ManagerReturn> getListpager(@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam, @WebParam(name = "startRow", targetNamespace = "") Integer startRow, @WebParam(name = "pageSize", targetNamespace = "") Integer pageSize);

	/**
	 * 停用帐号(审核不通过)
	 * 
	 * @param mangerId
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "closeStatus", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.CloseStatus")
	@ResponseWrapper(localName = "closeStatusResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.CloseStatusResponse")
	public Boolean closeStatus(@WebParam(name = "mangerId", targetNamespace = "") String mangerId);

	/**
	 * 修改管理员
	 * 
	 * @param managerModifyParam
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "modify", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.Modify")
	@ResponseWrapper(localName = "modifyResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.ModifyResponse")
	public Boolean modify(@WebParam(name = "managerModifyParam", targetNamespace = "") ManagerModifyParam managerModifyParam);

	/**
	 * 根据查询参数获取管理员记录数
	 * 
	 * @param queryParam
	 * @return returns java.lang.Integer
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getCount", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.GetCount")
	@ResponseWrapper(localName = "getCountResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.GetCountResponse")
	public Integer getCount(@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam);

	/**
	 * 启用帐号(审核通过)
	 * 
	 * @param managerId
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "openStatus", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.OpenStatus")
	@ResponseWrapper(localName = "openStatusResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.OpenStatusResponse")
	public Boolean openStatus(@WebParam(name = "managerId", targetNamespace = "") String managerId);

	/**
	 * 根据管理员id获取管理员实体
	 * 
	 * @param mangerId
	 * @return returns com.ymsino.water.service.manager.manager.ManagerReturn
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getByManagerId", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.GetByManagerId")
	@ResponseWrapper(localName = "getByManagerIdResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.manager.GetByManagerIdResponse")
	public ManagerReturn getByManagerId(@WebParam(name = "mangerId", targetNamespace = "") String mangerId);

}
