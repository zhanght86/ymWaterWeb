package com.ymsino.water.service.manager.department;

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
@WebService(name = "DepartmentService", targetNamespace = "http://api.service.manager.esb.ymsino.com/")
public interface DepartmentService {

	/**
	 * 保存部门
	 * 
	 * @param departmentSaveParam
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "save", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.Save")
	@ResponseWrapper(localName = "saveResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.SaveResponse")
	public Boolean save(@WebParam(name = "departmentSaveParam", targetNamespace = "") DepartmentSaveParam departmentSaveParam);

	/**
	 * 根据查询参数获取部门分页列表
	 * 
	 * @param queryParam
	 * @param startRow
	 * @param pageSize
	 * @return returns java.util.List<com.ymsino.water.service.manager.department.DepartmentReturn>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getListpager", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.GetListpager")
	@ResponseWrapper(localName = "getListpagerResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.GetListpagerResponse")
	public List<DepartmentReturn> getListpager(@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam, @WebParam(name = "startRow", targetNamespace = "") Integer startRow, @WebParam(name = "pageSize", targetNamespace = "") Integer pageSize);

	/**
	 * 删除（有下级单位的不可删除）
	 * 
	 * @param deptId
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "closeStatus", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.CloseStatus")
	@ResponseWrapper(localName = "closeStatusResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.CloseStatusResponse")
	public Boolean closeStatus(@WebParam(name = "deptId", targetNamespace = "") String deptId);

	/**
	 * 根据id获取部门实体
	 * 
	 * @param deptId
	 * @return returns com.ymsino.water.service.manager.department.DepartmentReturn
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getByDeptId", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.GetByDeptId")
	@ResponseWrapper(localName = "getByDeptIdResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.GetByDeptIdResponse")
	public DepartmentReturn getByDeptId(@WebParam(name = "deptId", targetNamespace = "") String deptId);

	/**
	 * 修改部门
	 * 
	 * @param departmentModifyParam
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "modify", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.Modify")
	@ResponseWrapper(localName = "modifyResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.ModifyResponse")
	public Boolean modify(@WebParam(name = "departmentModifyParam", targetNamespace = "") DepartmentModifyParam departmentModifyParam);

	/**
	 * 根据查询参数获取部门记录数
	 * 
	 * @param queryParam
	 * @return returns java.lang.Integer
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getCount", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.GetCount")
	@ResponseWrapper(localName = "getCountResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.GetCountResponse")
	public Integer getCount(@WebParam(name = "queryParam", targetNamespace = "") QueryParam queryParam);

	/**
	 * 启用或删除之后恢复
	 * 
	 * @param deptId
	 * @return returns java.lang.Boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "openStatus", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.OpenStatus")
	@ResponseWrapper(localName = "openStatusResponse", targetNamespace = "http://api.service.manager.esb.ymsino.com/", className = "com.ymsino.water.service.manager.department.OpenStatusResponse")
	public Boolean openStatus(@WebParam(name = "deptId", targetNamespace = "") String deptId);

}
