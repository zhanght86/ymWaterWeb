package com.ymsino.water.service.comm.testMeterCode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for testMeterCodeResponse complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testMeterCodeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://api.service.comm.esb.ymsino.com/}meterDataVo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testMeterCodeResponse", propOrder = { "_return" })
public class TestMeterCodeResponse {

	@XmlElement(name = "return")
	protected MeterDataVo _return;

	/**
	 * Gets the value of the return property.
	 * 
	 * @return possible object is {@link MeterDataVo }
	 * 
	 */
	public MeterDataVo getReturn() {
		return _return;
	}

	/**
	 * Sets the value of the return property.
	 * 
	 * @param value
	 *            allowed object is {@link MeterDataVo }
	 * 
	 */
	public void setReturn(MeterDataVo value) {
		this._return = value;
	}

}
