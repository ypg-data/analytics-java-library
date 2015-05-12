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
 * <p>Java class for data_source_settings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="data_source_settings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="injectionType" type="{http://marketing.adobe.com/analytics/2015/04/16}data_source_injection_types"/>
 *         &lt;element name="allowOutOfOrderHits" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="stopOnWarning" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="metricNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="metricEvents" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="dimensionNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="dimensionVariables" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="dataScope" type="{http://marketing.adobe.com/analytics/2015/04/16}data_source_data_scopes"/>
 *         &lt;element name="standardBreakdowns" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="metricList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="customBreakdownNames" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="customBreakdownValues" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="logFormat" type="{http://marketing.adobe.com/analytics/2015/04/16}data_source_weblog_formats"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "data_source_settings", propOrder = {

})
public class DataSourceSettings {

    @XmlElement(required = true)
    protected DataSourceInjectionTypes injectionType;
    protected boolean allowOutOfOrderHits;
    protected boolean stopOnWarning;
    @XmlElement(required = true)
    protected List<String> metricNames;
    @XmlElement(required = true)
    protected List<String> metricEvents;
    @XmlElement(required = true)
    protected List<String> dimensionNames;
    @XmlElement(required = true)
    protected List<String> dimensionVariables;
    @XmlElement(required = true)
    protected DataSourceDataScopes dataScope;
    @XmlElement(required = true)
    protected List<String> standardBreakdowns;
    @XmlElement(required = true)
    protected List<String> metricList;
    @XmlElement(required = true)
    protected List<String> customBreakdownNames;
    @XmlElement(required = true)
    protected List<String> customBreakdownValues;
    @XmlElement(required = true)
    protected DataSourceWeblogFormats logFormat;

    /**
     * Gets the value of the injectionType property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceInjectionTypes }
     *     
     */
    public DataSourceInjectionTypes getInjectionType() {
        return injectionType;
    }

    /**
     * Sets the value of the injectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceInjectionTypes }
     *     
     */
    public void setInjectionType(DataSourceInjectionTypes value) {
        this.injectionType = value;
    }

    /**
     * Gets the value of the allowOutOfOrderHits property.
     * 
     */
    public boolean isAllowOutOfOrderHits() {
        return allowOutOfOrderHits;
    }

    /**
     * Sets the value of the allowOutOfOrderHits property.
     * 
     */
    public void setAllowOutOfOrderHits(boolean value) {
        this.allowOutOfOrderHits = value;
    }

    /**
     * Gets the value of the stopOnWarning property.
     * 
     */
    public boolean isStopOnWarning() {
        return stopOnWarning;
    }

    /**
     * Sets the value of the stopOnWarning property.
     * 
     */
    public void setStopOnWarning(boolean value) {
        this.stopOnWarning = value;
    }

    /**
     * Gets the value of the metricNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metricNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetricNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetricNames() {
        if (metricNames == null) {
            metricNames = new ArrayList<String>();
        }
        return this.metricNames;
    }

    /**
     * Gets the value of the metricEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metricEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetricEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetricEvents() {
        if (metricEvents == null) {
            metricEvents = new ArrayList<String>();
        }
        return this.metricEvents;
    }

    /**
     * Gets the value of the dimensionNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensionNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensionNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDimensionNames() {
        if (dimensionNames == null) {
            dimensionNames = new ArrayList<String>();
        }
        return this.dimensionNames;
    }

    /**
     * Gets the value of the dimensionVariables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensionVariables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensionVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDimensionVariables() {
        if (dimensionVariables == null) {
            dimensionVariables = new ArrayList<String>();
        }
        return this.dimensionVariables;
    }

    /**
     * Gets the value of the dataScope property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceDataScopes }
     *     
     */
    public DataSourceDataScopes getDataScope() {
        return dataScope;
    }

    /**
     * Sets the value of the dataScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceDataScopes }
     *     
     */
    public void setDataScope(DataSourceDataScopes value) {
        this.dataScope = value;
    }

    /**
     * Gets the value of the standardBreakdowns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardBreakdowns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardBreakdowns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStandardBreakdowns() {
        if (standardBreakdowns == null) {
            standardBreakdowns = new ArrayList<String>();
        }
        return this.standardBreakdowns;
    }

    /**
     * Gets the value of the metricList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metricList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetricList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMetricList() {
        if (metricList == null) {
            metricList = new ArrayList<String>();
        }
        return this.metricList;
    }

    /**
     * Gets the value of the customBreakdownNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customBreakdownNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomBreakdownNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomBreakdownNames() {
        if (customBreakdownNames == null) {
            customBreakdownNames = new ArrayList<String>();
        }
        return this.customBreakdownNames;
    }

    /**
     * Gets the value of the customBreakdownValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customBreakdownValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomBreakdownValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomBreakdownValues() {
        if (customBreakdownValues == null) {
            customBreakdownValues = new ArrayList<String>();
        }
        return this.customBreakdownValues;
    }

    /**
     * Gets the value of the logFormat property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourceWeblogFormats }
     *     
     */
    public DataSourceWeblogFormats getLogFormat() {
        return logFormat;
    }

    /**
     * Sets the value of the logFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourceWeblogFormats }
     *     
     */
    public void setLogFormat(DataSourceWeblogFormats value) {
        this.logFormat = value;
    }

}