
package com.sahand.management.proxy.service.administration;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for credentialTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="credentialTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSWORD"/>
 *     &lt;enumeration value="FINGERPRINT"/>
 *     &lt;enumeration value="SMARTCARD"/>
 *     &lt;enumeration value="TICKET"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "credentialTypeEnum")
@XmlEnum
public enum CredentialTypeEnum {

    PASSWORD,
    FINGERPRINT,
    SMARTCARD,
    TICKET;

    public String value() {
        return name();
    }

    public static CredentialTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
