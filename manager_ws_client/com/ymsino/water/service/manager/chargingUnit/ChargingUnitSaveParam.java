package com.ymsino.water.service.manager.chargingUnit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for chargingUnitSaveParam complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chargingUnitSaveParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkMan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chargingUnitSaveParam", propOrder = { "createrId", "linkAddr", "linkMan", "linkTel", "name", "parentUnitId", "remark", "unitId" })
public class ChargingUnitSaveParam {

	protected String createrId;
	protected String linkAddr;
	protected String linkMan;
	protected String linkTel;
	protected String name;
	protected String parentUnitId;
	protected String remark;
	protected String unitId;

	/**
	 * Gets the value of the createrId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCreaterId() {
		return createrId;
	}

	/**
	 * Sets the value of the createrId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setCreaterId(String value) {
		this.createrId = value;
	}

	/**
	 * Gets the value of the linkAddr property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLinkAddr() {
		return linkAddr;
	}

	/**
	 * Sets the value of the linkAddr property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLinkAddr(String value) {
		this.linkAddr = value;
	}

	/**
	 * Gets the value of the linkMan property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLinkMan() {
		return linkMan;
	}

	/**
	 * Sets the value of the linkMan property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLinkMan(String value) {
		this.linkMan = value;
	}

	/**
	 * Gets the value of the linkTel property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLinkTel() {
		return linkTel;
	}

	/**
	 * Sets the value of the linkTel property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLinkTel(String value) {
		this.linkTel = value;
	}

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the parentUnitId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParentUnitId() {
		return parentUnitId;
	}

	/**
	 * Sets the value of the parentUnitId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParentUnitId(String value) {
		this.parentUnitId = value;
	}

	/**
	 * Gets the value of the remark property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * Sets the value of the remark property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRemark(String value) {
		this.remark = value;
	}

	/**
	 * Gets the value of the unitId property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnitId() {
		return unitId;
	}

	/**
	 * Sets the value of the unitId property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUnitId(String value) {
		this.unitId = value;
	}

}
