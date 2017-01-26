//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.24 at 10:31:51 PM GMT 
//


package org.nmrml.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantificationAnnotationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantificationAnnotationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantificationMethod" type="{http://nmrml.org/schema}CVTermType"/>
 *         &lt;element name="quantifiedCompoundList" type="{http://nmrml.org/schema}QuantifiedCompoundListType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="spectrumRef" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantificationAnnotationType", propOrder = {
    "quantificationMethod",
    "quantifiedCompoundList"
})
public class QuantificationAnnotationType {

    @XmlElement(required = true)
    protected CVTermType quantificationMethod;
    @XmlElement(required = true)
    protected QuantifiedCompoundListType quantifiedCompoundList;
    @XmlAttribute(name = "spectrumRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object spectrumRef;

    /**
     * Gets the value of the quantificationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CVTermType }
     *     
     */
    public CVTermType getQuantificationMethod() {
        return quantificationMethod;
    }

    /**
     * Sets the value of the quantificationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVTermType }
     *     
     */
    public void setQuantificationMethod(CVTermType value) {
        this.quantificationMethod = value;
    }

    /**
     * Gets the value of the quantifiedCompoundList property.
     * 
     * @return
     *     possible object is
     *     {@link QuantifiedCompoundListType }
     *     
     */
    public QuantifiedCompoundListType getQuantifiedCompoundList() {
        return quantifiedCompoundList;
    }

    /**
     * Sets the value of the quantifiedCompoundList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantifiedCompoundListType }
     *     
     */
    public void setQuantifiedCompoundList(QuantifiedCompoundListType value) {
        this.quantifiedCompoundList = value;
    }

    /**
     * Gets the value of the spectrumRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSpectrumRef() {
        return spectrumRef;
    }

    /**
     * Sets the value of the spectrumRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSpectrumRef(Object value) {
        this.spectrumRef = value;
    }

}