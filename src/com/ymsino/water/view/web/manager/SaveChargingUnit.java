package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitSaveParam;
import com.ymsino.water.service.manager.chargingUnit.ChargingUnitService;

public class SaveChargingUnit extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	
	private String unitId;
	private String name;
	private String parentUnitId;
	private String linkMan;
	private String linkTel;
	private String linkAddr;
	private String remark;
	private String message;
	private ChargingUnitService chargingUnitService;
	private ChargingUnitSaveParam chargingUnit = new ChargingUnitSaveParam();
	
	
	@Override
	public String execute() throws Exception {
		try {
			if(StringUtil.isEmpty(unitId)){
				return SUCCESS;
			}
			if(chargingUnitService.getByUnitId(unitId) != null){
				message = "收费单位编号已存在！";
				return SUCCESS;
			}
			chargingUnit.setCreaterId("system");
			chargingUnit.setLinkAddr(linkAddr);
			chargingUnit.setLinkMan(linkMan);
			chargingUnit.setLinkTel(linkTel);
			chargingUnit.setName(name);
			chargingUnit.setUnitId(unitId);
			chargingUnit.setParentUnitId(parentUnitId);
			chargingUnit.setRemark(remark);
			chargingUnitService.save(chargingUnit);
			message = "添加成功！";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return SUCCESS;
	}


	public String getUnitId() {
		return unitId;
	}


	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getParentUnitId() {
		return parentUnitId;
	}


	public void setParentUnitId(String parentUnitId) {
		this.parentUnitId = parentUnitId;
	}


	public String getLinkMan() {
		return linkMan;
	}


	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}


	public String getLinkTel() {
		return linkTel;
	}


	public void setLinkTel(String linkTel) {
		this.linkTel = linkTel;
	}


	public String getLinkAddr() {
		return linkAddr;
	}


	public void setLinkAddr(String linkAddr) {
		this.linkAddr = linkAddr;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String getMessage() {
		if(!StringUtil.isEmpty(message)){
			try {
				message = URLEncoder.encode(message, "utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				message = "";
			}
		}
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public ChargingUnitSaveParam getChargingUnit() {
		return chargingUnit;
	}


	public void setChargingUnit(ChargingUnitSaveParam chargingUnit) {
		this.chargingUnit = chargingUnit;
	}


	public void setChargingUnitService(ChargingUnitService chargingUnitService) {
		this.chargingUnitService = chargingUnitService;
	}
	
}
