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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * This is the root element for the COordination Of Standards In MetabOlomicS
 *         nmrML schema, which is intended to capture the use of a nuclear magnetic resonance
 *         spectrometer, the data generated, and the initial processing of that data (to the level of
 *         the peak list).
 * 
 * <p>Java class for nmrMLType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nmrMLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvList" type="{http://nmrml.org/schema}CVListType"/>
 *         &lt;element name="fileDescription" type="{http://nmrml.org/schema}FileDescriptionType"/>
 *         &lt;element name="contactList" type="{http://nmrml.org/schema}ContactListType" minOccurs="0"/>
 *         &lt;element name="referenceableParamGroupList" type="{http://nmrml.org/schema}ReferenceableParamGroupListType" minOccurs="0"/>
 *         &lt;element name="sourceFileList" type="{http://nmrml.org/schema}SourceFileListType" minOccurs="0"/>
 *         &lt;element name="softwareList" type="{http://nmrml.org/schema}SoftwareListType" minOccurs="0"/>
 *         &lt;element name="instrumentConfigurationList" type="{http://nmrml.org/schema}InstrumentConfigurationListType"/>
 *         &lt;element name="sampleList" type="{http://nmrml.org/schema}SampleListType" minOccurs="0"/>
 *         &lt;element name="acquisition" type="{http://nmrml.org/schema}AcquisitionType"/>
 *         &lt;element name="spectrumList" type="{http://nmrml.org/schema}SpectrumListType" minOccurs="0"/>
 *         &lt;element name="spectrumAnnotationList" type="{http://nmrml.org/schema}SpectrumAnnotationListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accession" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="accession_url" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nmrMLType", propOrder = {
    "cvList",
    "fileDescription",
    "contactList",
    "referenceableParamGroupList",
    "sourceFileList",
    "softwareList",
    "instrumentConfigurationList",
    "sampleList",
    "acquisition",
    "spectrumList",
    "spectrumAnnotationList"
})
public class NmrMLType {

    @XmlElement(required = true)
    protected CVListType cvList;
    @XmlElement(required = true)
    protected FileDescriptionType fileDescription;
    protected ContactListType contactList;
    protected ReferenceableParamGroupListType referenceableParamGroupList;
    protected SourceFileListType sourceFileList;
    protected SoftwareListType softwareList;
    @XmlElement(required = true)
    protected InstrumentConfigurationListType instrumentConfigurationList;
    protected SampleListType sampleList;
    @XmlElement(required = true)
    protected AcquisitionType acquisition;
    protected SpectrumListType spectrumList;
    protected SpectrumAnnotationListType spectrumAnnotationList;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "accession")
    protected String accession;
    @XmlAttribute(name = "accession_url")
    @XmlSchemaType(name = "anyURI")
    protected String accessionUrl;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the cvList property.
     * 
     * @return
     *     possible object is
     *     {@link CVListType }
     *     
     */
    public CVListType getCvList() {
        return cvList;
    }

    /**
     * Sets the value of the cvList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVListType }
     *     
     */
    public void setCvList(CVListType value) {
        this.cvList = value;
    }

    /**
     * Gets the value of the fileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link FileDescriptionType }
     *     
     */
    public FileDescriptionType getFileDescription() {
        return fileDescription;
    }

    /**
     * Sets the value of the fileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDescriptionType }
     *     
     */
    public void setFileDescription(FileDescriptionType value) {
        this.fileDescription = value;
    }

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactListType }
     *     
     */
    public ContactListType getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactListType }
     *     
     */
    public void setContactList(ContactListType value) {
        this.contactList = value;
    }

    /**
     * Gets the value of the referenceableParamGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceableParamGroupListType }
     *     
     */
    public ReferenceableParamGroupListType getReferenceableParamGroupList() {
        return referenceableParamGroupList;
    }

    /**
     * Sets the value of the referenceableParamGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceableParamGroupListType }
     *     
     */
    public void setReferenceableParamGroupList(ReferenceableParamGroupListType value) {
        this.referenceableParamGroupList = value;
    }

    /**
     * Gets the value of the sourceFileList property.
     * 
     * @return
     *     possible object is
     *     {@link SourceFileListType }
     *     
     */
    public SourceFileListType getSourceFileList() {
        return sourceFileList;
    }

    /**
     * Sets the value of the sourceFileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceFileListType }
     *     
     */
    public void setSourceFileList(SourceFileListType value) {
        this.sourceFileList = value;
    }

    /**
     * Gets the value of the softwareList property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareListType }
     *     
     */
    public SoftwareListType getSoftwareList() {
        return softwareList;
    }

    /**
     * Sets the value of the softwareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareListType }
     *     
     */
    public void setSoftwareList(SoftwareListType value) {
        this.softwareList = value;
    }

    /**
     * Gets the value of the instrumentConfigurationList property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentConfigurationListType }
     *     
     */
    public InstrumentConfigurationListType getInstrumentConfigurationList() {
        return instrumentConfigurationList;
    }

    /**
     * Sets the value of the instrumentConfigurationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentConfigurationListType }
     *     
     */
    public void setInstrumentConfigurationList(InstrumentConfigurationListType value) {
        this.instrumentConfigurationList = value;
    }

    /**
     * Gets the value of the sampleList property.
     * 
     * @return
     *     possible object is
     *     {@link SampleListType }
     *     
     */
    public SampleListType getSampleList() {
        return sampleList;
    }

    /**
     * Sets the value of the sampleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleListType }
     *     
     */
    public void setSampleList(SampleListType value) {
        this.sampleList = value;
    }

    /**
     * Gets the value of the acquisition property.
     * 
     * @return
     *     possible object is
     *     {@link AcquisitionType }
     *     
     */
    public AcquisitionType getAcquisition() {
        return acquisition;
    }

    /**
     * Sets the value of the acquisition property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquisitionType }
     *     
     */
    public void setAcquisition(AcquisitionType value) {
        this.acquisition = value;
    }

    /**
     * Gets the value of the spectrumList property.
     * 
     * @return
     *     possible object is
     *     {@link SpectrumListType }
     *     
     */
    public SpectrumListType getSpectrumList() {
        return spectrumList;
    }

    /**
     * Sets the value of the spectrumList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpectrumListType }
     *     
     */
    public void setSpectrumList(SpectrumListType value) {
        this.spectrumList = value;
    }

    /**
     * Gets the value of the spectrumAnnotationList property.
     * 
     * @return
     *     possible object is
     *     {@link SpectrumAnnotationListType }
     *     
     */
    public SpectrumAnnotationListType getSpectrumAnnotationList() {
        return spectrumAnnotationList;
    }

    /**
     * Sets the value of the spectrumAnnotationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpectrumAnnotationListType }
     *     
     */
    public void setSpectrumAnnotationList(SpectrumAnnotationListType value) {
        this.spectrumAnnotationList = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the accession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccession() {
        return accession;
    }

    /**
     * Sets the value of the accession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccession(String value) {
        this.accession = value;
    }

    /**
     * Gets the value of the accessionUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessionUrl() {
        return accessionUrl;
    }

    /**
     * Sets the value of the accessionUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessionUrl(String value) {
        this.accessionUrl = value;
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

}