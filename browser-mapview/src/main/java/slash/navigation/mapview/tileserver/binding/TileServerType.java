//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.28 at 03:34:09 PM CET 
//


package slash.navigation.mapview.tileserver.binding;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *                 a tile server contains an id, a name, a minimum and maximum zoom level, a copyright and a tile url pattern
 *             
 * 
 * <p>Java class for tileServerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tileServerType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="minZoom" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxZoom" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="copyright" use="required" type="{http://api.routeconverter.com/v1/schemas/tileserver-catalog}copyrightType" />
 *       &lt;attribute name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tileServerType", propOrder = {
    "value"
})
public class TileServerType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "minZoom", required = true)
    protected BigInteger minZoom;
    @XmlAttribute(name = "maxZoom", required = true)
    protected BigInteger maxZoom;
    @XmlAttribute(name = "copyright", required = true)
    protected CopyrightType copyright;
    @XmlAttribute(name = "active")
    protected Boolean active;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the minZoom property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinZoom() {
        return minZoom;
    }

    /**
     * Sets the value of the minZoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinZoom(BigInteger value) {
        this.minZoom = value;
    }

    /**
     * Gets the value of the maxZoom property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxZoom() {
        return maxZoom;
    }

    /**
     * Sets the value of the maxZoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxZoom(BigInteger value) {
        this.maxZoom = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link CopyrightType }
     *     
     */
    public CopyrightType getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyrightType }
     *     
     */
    public void setCopyright(CopyrightType value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

}
