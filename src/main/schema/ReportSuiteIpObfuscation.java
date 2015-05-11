//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 11:03:57 AM CEST 
//


package com.adobe.analytics.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for report_suite_ip_obfuscation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="report_suite_ip_obfuscation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rsid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="site_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ip_obfuscation" type="{http://marketing.adobe.com/analytics/2015/04/16}ip_obfuscation_enum"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "report_suite_ip_obfuscation", propOrder = {

})
public class ReportSuiteIpObfuscation {

    @XmlElement(required = true)
    protected String rsid;
    @XmlElement(name = "site_title", required = true)
    protected String siteTitle;
    @XmlElement(name = "ip_obfuscation", required = true)
    protected IpObfuscationEnum ipObfuscation;

    /**
     * Gets the value of the rsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsid() {
        return rsid;
    }

    /**
     * Sets the value of the rsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsid(String value) {
        this.rsid = value;
    }

    /**
     * Gets the value of the siteTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteTitle() {
        return siteTitle;
    }

    /**
     * Sets the value of the siteTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteTitle(String value) {
        this.siteTitle = value;
    }

    /**
     * Gets the value of the ipObfuscation property.
     * 
     * @return
     *     possible object is
     *     {@link IpObfuscationEnum }
     *     
     */
    public IpObfuscationEnum getIpObfuscation() {
        return ipObfuscation;
    }

    /**
     * Sets the value of the ipObfuscation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IpObfuscationEnum }
     *     
     */
    public void setIpObfuscation(IpObfuscationEnum value) {
        this.ipObfuscation = value;
    }

}
