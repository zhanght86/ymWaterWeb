package com.ymsino.water.view.web.manager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.gmail.xcjava.base.date.DateUtil;
import com.opensymphony.oscache.util.StringUtil;
import com.opensymphony.xwork2.ActionSupport;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateSaveParam;
import com.ymsino.water.service.manager.priceTemplate.PriceTemplateService;
import com.ymsino.water.view.web.common.Arith;
import com.ymsino.water.view.web.common.PriceTool;

public class SavePriceTemplate extends ActionSupport {
	
	private static final long serialVersionUID = 189016617485872535L;
	private Long id;
	private String name;
	private String type;
	private Float level1Num;//1阶最大值
	private String level1Cost;//1阶价格，单位元（保存毫）
	private Float level2Num;//1阶最大值
	private String level2Cost;//1阶价格，单位元
	private Float level3Num;//1阶最大值
	private String level3Cost;//1阶价格，单位元
	private Float level4Num;//1阶最大值
	private String level4Cost;//1阶价格，单位元
	private String billingPeriod;//结算周期
	private String startDate;//开始日期
	private String endDate;//结束日期
	private String remark;
	private String chargingUnitId;
	private PriceTemplateService priceTemplateService;
	private String message;
	
	@Override
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String currentChargingUnitId = (String)session.getAttribute("sessionUnitId");
		try {
			PriceTemplateSaveParam priceTemplateSaveParam = new PriceTemplateSaveParam();
			priceTemplateSaveParam.setName(name);
			priceTemplateSaveParam.setType(type);
			priceTemplateSaveParam.setLevel1Num(level1Num);
			if(!StringUtil.isEmpty(level1Cost)){
				priceTemplateSaveParam.setLevel1Cost(Long.valueOf(PriceTool.subZeroAndDot(Arith.mul(level1Cost,"10000"))));
			}else{
				priceTemplateSaveParam.setLevel1Cost(null);
			}
			priceTemplateSaveParam.setLevel2Num(level2Num);
			if(!StringUtil.isEmpty(level2Cost)){
				priceTemplateSaveParam.setLevel2Cost(Long.valueOf(PriceTool.subZeroAndDot(Arith.mul(level2Cost,"10000"))));
			}else{
				priceTemplateSaveParam.setLevel2Cost(null);
			}
			priceTemplateSaveParam.setLevel3Num(level3Num);
			if(!StringUtil.isEmpty(level3Cost)){
				priceTemplateSaveParam.setLevel3Cost(Long.valueOf(PriceTool.subZeroAndDot(Arith.mul(level3Cost,"10000"))));
			}else{
				priceTemplateSaveParam.setLevel3Cost(null);
			}
			priceTemplateSaveParam.setLevel4Num(level4Num);
			if(!StringUtil.isEmpty(level4Cost)){
				priceTemplateSaveParam.setLevel4Cost(Long.valueOf(PriceTool.subZeroAndDot(Arith.mul(level4Cost,"10000"))));
			}else{
				priceTemplateSaveParam.setLevel4Cost(null);
			}
			priceTemplateSaveParam.setBillingPeriod(billingPeriod);
			if(!StringUtil.isEmpty(startDate)){
				priceTemplateSaveParam.setStartTimestamp(DateUtil.parseDate(startDate, "yyyy-MM-dd").getTime());
			}
			if(!StringUtil.isEmpty(endDate)){
				priceTemplateSaveParam.setEndTimestamp(DateUtil.parseDate(endDate, "yyyy-MM-dd").getTime());
			}
			priceTemplateSaveParam.setChargingUnitId(currentChargingUnitId);//保存管理员所在收费单位编号
			priceTemplateSaveParam.setRemark(remark);
			id = priceTemplateService.save(priceTemplateSaveParam);
			message = "添加成功！";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return SUCCESS;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getLevel1Num() {
		return level1Num;
	}

	public void setLevel1Num(Float level1Num) {
		this.level1Num = level1Num;
	}

	public Float getLevel2Num() {
		return level2Num;
	}

	public void setLevel2Num(Float level2Num) {
		this.level2Num = level2Num;
	}

	public Float getLevel3Num() {
		return level3Num;
	}

	public void setLevel3Num(Float level3Num) {
		this.level3Num = level3Num;
	}

	public Float getLevel4Num() {
		return level4Num;
	}

	public void setLevel4Num(Float level4Num) {
		this.level4Num = level4Num;
	}

	public String getBillingPeriod() {
		return billingPeriod;
	}

	public void setBillingPeriod(String billingPeriod) {
		this.billingPeriod = billingPeriod;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getChargingUnitId() {
		return chargingUnitId;
	}

	public void setChargingUnitId(String chargingUnitId) {
		this.chargingUnitId = chargingUnitId;
	}

	public void setPriceTemplateService(PriceTemplateService priceTemplateService) {
		this.priceTemplateService = priceTemplateService;
	}

	public Long getId() {
		return id;
	}

	public String getLevel1Cost() {
		return level1Cost;
	}

	public void setLevel1Cost(String level1Cost) {
		this.level1Cost = level1Cost;
	}

	public String getLevel2Cost() {
		return level2Cost;
	}

	public void setLevel2Cost(String level2Cost) {
		this.level2Cost = level2Cost;
	}

	public String getLevel3Cost() {
		return level3Cost;
	}

	public void setLevel3Cost(String level3Cost) {
		this.level3Cost = level3Cost;
	}

	public String getLevel4Cost() {
		return level4Cost;
	}

	public void setLevel4Cost(String level4Cost) {
		this.level4Cost = level4Cost;
	}

}
