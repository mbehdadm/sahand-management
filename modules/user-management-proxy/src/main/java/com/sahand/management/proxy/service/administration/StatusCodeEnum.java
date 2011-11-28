
package com.sahand.management.proxy.service.administration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for statusCodeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="statusCodeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="WARNING"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusCodeEnum")
@XmlEnum
public enum StatusCodeEnum {

    SUCCESS,
    WARNING,
    ERROR;

    public String value() {
        return name();
    }

    public static StatusCodeEnum fromValue(String v) {
        return valueOf(v);
    }

}
