//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.08 at 11:03:57 AM CEST 
//


package com.adobe.analytics.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for group_search_field_enum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="group_search_field_enum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="name"/>
 *     &lt;enumeration value="description"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "group_search_field_enum")
@XmlEnum
public enum GroupSearchFieldEnum {

    @XmlEnumValue("name")
    NAME("name"),
    @XmlEnumValue("description")
    DESCRIPTION("description");
    private final String value;

    GroupSearchFieldEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GroupSearchFieldEnum fromValue(String v) {
        for (GroupSearchFieldEnum c: GroupSearchFieldEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
