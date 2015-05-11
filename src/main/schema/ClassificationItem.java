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
 * <p>Java class for classification_item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="classification_item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://marketing.adobe.com/analytics/2015/04/16}classification_type_enum"/>
 *         &lt;element name="options" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="parent_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date_enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="metric_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="children" type="{http://marketing.adobe.com/analytics/2015/04/16}classification_item" maxOccurs="unbounded"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "classification_item", propOrder = {

})
public class ClassificationItem {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ClassificationTypeEnum type;
    @XmlElement(required = true, nillable = true)
    protected List<String> options;
    @XmlElement(name = "parent_name", required = true, nillable = true)
    protected String parentName;
    @XmlElement(name = "date_enabled", required = true, type = Boolean.class, nillable = true)
    protected Boolean dateEnabled;
    @XmlElement(name = "metric_id", required = true, nillable = true)
    protected String metricId;
    @XmlElement(required = true, nillable = true)
    protected List<ClassificationItem> children;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationTypeEnum }
     *     
     */
    public ClassificationTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationTypeEnum }
     *     
     */
    public void setType(ClassificationTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the options property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOptions() {
        if (options == null) {
            options = new ArrayList<String>();
        }
        return this.options;
    }

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the dateEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateEnabled() {
        return dateEnabled;
    }

    /**
     * Sets the value of the dateEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateEnabled(Boolean value) {
        this.dateEnabled = value;
    }

    /**
     * Gets the value of the metricId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetricId() {
        return metricId;
    }

    /**
     * Sets the value of the metricId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetricId(String value) {
        this.metricId = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationItem }
     * 
     * 
     */
    public List<ClassificationItem> getChildren() {
        if (children == null) {
            children = new ArrayList<ClassificationItem>();
        }
        return this.children;
    }

}
