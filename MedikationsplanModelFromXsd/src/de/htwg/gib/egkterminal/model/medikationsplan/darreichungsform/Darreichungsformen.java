//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.20 at 08:57:13 nachm. MESZ 
//


package de.htwg.gib.egkterminal.model.medikationsplan.darreichungsform;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for keytabs element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="keytabs">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="keytab">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="key" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;simpleContent>
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                             &lt;attribute name="V" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="DN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="S" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="SV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="bezeichnungIFA" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="hinweis" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/extension>
 *                         &lt;/simpleContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="SV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="SN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                   &lt;attribute name="S" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "schluesseltabelle"
})
@XmlRootElement(name = "keytabs")
public class Darreichungsformen {

    @XmlElement(name = "keytab", required = true)
    protected Darreichungsformen.Schluesseltabelle schluesseltabelle;

    /**
     * Gets the value of the schluesseltabelle property.
     * 
     * @return
     *     possible object is
     *     {@link Darreichungsformen.Schluesseltabelle }
     *     
     */
    public Darreichungsformen.Schluesseltabelle getSchluesseltabelle() {
        return schluesseltabelle;
    }

    /**
     * Sets the value of the schluesseltabelle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Darreichungsformen.Schluesseltabelle }
     *     
     */
    public void setSchluesseltabelle(Darreichungsformen.Schluesseltabelle value) {
        this.schluesseltabelle = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="key" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="V" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="DN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="S" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SV" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="bezeichnungIFA" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="hinweis" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="SV" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SN" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="S" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kodierungen"
    })
    public static class Schluesseltabelle {

        @XmlElement(name = "key")
        protected List<Darreichungsformen.Schluesseltabelle.Darreichungsform> kodierungen;
        @XmlAttribute(name = "SV")
        protected String schemaVersion;
        @XmlAttribute(name = "SN")
        protected String schemaName;
        @XmlAttribute(name = "S")
        protected String oid;

        /**
         * Gets the value of the kodierungen property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kodierungen property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKodierungen().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Darreichungsformen.Schluesseltabelle.Darreichungsform }
         * 
         * 
         */
        public List<Darreichungsformen.Schluesseltabelle.Darreichungsform> getKodierungen() {
            if (kodierungen == null) {
                kodierungen = new ArrayList<Darreichungsformen.Schluesseltabelle.Darreichungsform>();
            }
            return this.kodierungen;
        }

        /**
         * Gets the value of the schemaVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchemaVersion() {
            return schemaVersion;
        }

        /**
         * Sets the value of the schemaVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchemaVersion(String value) {
            this.schemaVersion = value;
        }

        /**
         * Gets the value of the schemaName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchemaName() {
            return schemaName;
        }

        /**
         * Sets the value of the schemaName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchemaName(String value) {
            this.schemaName = value;
        }

        /**
         * Gets the value of the oid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOID() {
            return oid;
        }

        /**
         * Sets the value of the oid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOID(String value) {
            this.oid = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="V" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="DN" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="S" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SV" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="bezeichnungIFA" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="hinweis" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Darreichungsform {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "V", required = true)
            protected String code;
            @XmlAttribute(name = "DN", required = true)
            protected String form;
            @XmlAttribute(name = "S")
            protected String oid;
            @XmlAttribute(name = "SV")
            protected String schemaVersion;
            @XmlAttribute(name = "bezeichnungIFA")
            protected String bezeichnungIFA;
            @XmlAttribute(name = "hinweis")
            protected String hinweis;

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
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the form property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getForm() {
                return form;
            }

            /**
             * Sets the value of the form property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setForm(String value) {
                this.form = value;
            }

            /**
             * Gets the value of the oid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOID() {
                return oid;
            }

            /**
             * Sets the value of the oid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOID(String value) {
                this.oid = value;
            }

            /**
             * Gets the value of the schemaVersion property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchemaVersion() {
                return schemaVersion;
            }

            /**
             * Sets the value of the schemaVersion property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchemaVersion(String value) {
                this.schemaVersion = value;
            }

            /**
             * Gets the value of the bezeichnungIFA property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBezeichnungIFA() {
                return bezeichnungIFA;
            }

            /**
             * Sets the value of the bezeichnungIFA property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBezeichnungIFA(String value) {
                this.bezeichnungIFA = value;
            }

            /**
             * Gets the value of the hinweis property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHinweis() {
                return hinweis;
            }

            /**
             * Sets the value of the hinweis property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHinweis(String value) {
                this.hinweis = value;
            }

        }

    }

}
