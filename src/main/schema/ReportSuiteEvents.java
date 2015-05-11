//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 11:03:57 AM CEST 
//


package com.adobe.analytics.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for report_suite_events complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="report_suite_events">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="rsid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="site_title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ecommerce_level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="events" type="{http://marketing.adobe.com/analytics/2015/04/16}event" maxOccurs="unbounded"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "report_suite_events", propOrder = {

})
public class ReportSuiteEvents {

    @XmlElement(required = true)
    protected String rsid;
    @XmlElement(name = "site_title", required = true)
    protected String siteTitle;
    @XmlElement(name = "ecommerce_level", required = true)
    protected String ecommerceLevel;
    @XmlElement(required = true)
    protected List<Event> events;

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
     * Gets the value of the ecommerceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEcommerceLevel() {
        return ecommerceLevel;
    }

    /**
     * Sets the value of the ecommerceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEcommerceLevel(String value) {
        this.ecommerceLevel = value;
    }

    /**
     * Gets the value of the events property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the events property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvents() {
        if (events == null) {
            events = new ArrayList<Event>();
        }
        return this.events;
    }

}
