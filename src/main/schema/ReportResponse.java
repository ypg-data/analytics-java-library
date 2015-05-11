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
 * <p>Java class for reportResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="waitSeconds" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="runSeconds" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="report" type="{http://marketing.adobe.com/analytics/2015/04/16}report"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportResponse", propOrder = {

})
public class ReportResponse {

    protected float waitSeconds;
    protected float runSeconds;
    @XmlElement(required = true)
    protected Report report;

    /**
     * Gets the value of the waitSeconds property.
     * 
     */
    public float getWaitSeconds() {
        return waitSeconds;
    }

    /**
     * Sets the value of the waitSeconds property.
     * 
     */
    public void setWaitSeconds(float value) {
        this.waitSeconds = value;
    }

    /**
     * Gets the value of the runSeconds property.
     * 
     */
    public float getRunSeconds() {
        return runSeconds;
    }

    /**
     * Sets the value of the runSeconds property.
     * 
     */
    public void setRunSeconds(float value) {
        this.runSeconds = value;
    }

    /**
     * Gets the value of the report property.
     * 
     * @return
     *     possible object is
     *     {@link Report }
     *     
     */
    public Report getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     * @param value
     *     allowed object is
     *     {@link Report }
     *     
     */
    public void setReport(Report value) {
        this.report = value;
    }

}
