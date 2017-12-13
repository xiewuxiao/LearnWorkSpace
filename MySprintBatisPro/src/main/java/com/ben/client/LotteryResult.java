
package com.ben.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lotteryResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lotteryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="animal1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="animal2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="animal3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="animal4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="animal5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="animal6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="code_animal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code_b_or_l" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="code_s_or_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="num3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="num4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="num5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="num6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="open_Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="periods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sum_b_or_l" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sum_s_or_d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lotteryResult", propOrder = {
    "animal1",
    "animal2",
    "animal3",
    "animal4",
    "animal5",
    "animal6",
    "code",
    "codeAnimal",
    "codeBOrL",
    "codeSOrD",
    "num1",
    "num2",
    "num3",
    "num4",
    "num5",
    "num6",
    "openDate",
    "periods",
    "sumBOrL",
    "sumSOrD"
})
public class LotteryResult {

    protected String animal1;
    protected String animal2;
    protected String animal3;
    protected String animal4;
    protected String animal5;
    protected String animal6;
    protected int code;
    @XmlElement(name = "code_animal")
    protected String codeAnimal;
    @XmlElement(name = "code_b_or_l")
    protected String codeBOrL;
    @XmlElement(name = "code_s_or_d")
    protected String codeSOrD;
    protected int num1;
    protected int num2;
    protected int num3;
    protected int num4;
    protected int num5;
    protected int num6;
    @XmlElement(name = "open_Date")
    protected String openDate;
    protected int periods;
    @XmlElement(name = "sum_b_or_l")
    protected String sumBOrL;
    @XmlElement(name = "sum_s_or_d")
    protected String sumSOrD;

    /**
     * Gets the value of the animal1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimal1() {
        return animal1;
    }

    /**
     * Sets the value of the animal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimal1(String value) {
        this.animal1 = value;
    }

    /**
     * Gets the value of the animal2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimal2() {
        return animal2;
    }

    /**
     * Sets the value of the animal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimal2(String value) {
        this.animal2 = value;
    }

    /**
     * Gets the value of the animal3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimal3() {
        return animal3;
    }

    /**
     * Sets the value of the animal3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimal3(String value) {
        this.animal3 = value;
    }

    /**
     * Gets the value of the animal4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimal4() {
        return animal4;
    }

    /**
     * Sets the value of the animal4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimal4(String value) {
        this.animal4 = value;
    }

    /**
     * Gets the value of the animal5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimal5() {
        return animal5;
    }

    /**
     * Sets the value of the animal5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimal5(String value) {
        this.animal5 = value;
    }

    /**
     * Gets the value of the animal6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimal6() {
        return animal6;
    }

    /**
     * Sets the value of the animal6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimal6(String value) {
        this.animal6 = value;
    }

    /**
     * Gets the value of the code property.
     * 
     */
    public int getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(int value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeAnimal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeAnimal() {
        return codeAnimal;
    }

    /**
     * Sets the value of the codeAnimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeAnimal(String value) {
        this.codeAnimal = value;
    }

    /**
     * Gets the value of the codeBOrL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeBOrL() {
        return codeBOrL;
    }

    /**
     * Sets the value of the codeBOrL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeBOrL(String value) {
        this.codeBOrL = value;
    }

    /**
     * Gets the value of the codeSOrD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSOrD() {
        return codeSOrD;
    }

    /**
     * Sets the value of the codeSOrD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSOrD(String value) {
        this.codeSOrD = value;
    }

    /**
     * Gets the value of the num1 property.
     * 
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Sets the value of the num1 property.
     * 
     */
    public void setNum1(int value) {
        this.num1 = value;
    }

    /**
     * Gets the value of the num2 property.
     * 
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Sets the value of the num2 property.
     * 
     */
    public void setNum2(int value) {
        this.num2 = value;
    }

    /**
     * Gets the value of the num3 property.
     * 
     */
    public int getNum3() {
        return num3;
    }

    /**
     * Sets the value of the num3 property.
     * 
     */
    public void setNum3(int value) {
        this.num3 = value;
    }

    /**
     * Gets the value of the num4 property.
     * 
     */
    public int getNum4() {
        return num4;
    }

    /**
     * Sets the value of the num4 property.
     * 
     */
    public void setNum4(int value) {
        this.num4 = value;
    }

    /**
     * Gets the value of the num5 property.
     * 
     */
    public int getNum5() {
        return num5;
    }

    /**
     * Sets the value of the num5 property.
     * 
     */
    public void setNum5(int value) {
        this.num5 = value;
    }

    /**
     * Gets the value of the num6 property.
     * 
     */
    public int getNum6() {
        return num6;
    }

    /**
     * Sets the value of the num6 property.
     * 
     */
    public void setNum6(int value) {
        this.num6 = value;
    }

    /**
     * Gets the value of the openDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenDate() {
        return openDate;
    }

    /**
     * Sets the value of the openDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenDate(String value) {
        this.openDate = value;
    }

    /**
     * Gets the value of the periods property.
     * 
     */
    public int getPeriods() {
        return periods;
    }

    /**
     * Sets the value of the periods property.
     * 
     */
    public void setPeriods(int value) {
        this.periods = value;
    }

    /**
     * Gets the value of the sumBOrL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumBOrL() {
        return sumBOrL;
    }

    /**
     * Sets the value of the sumBOrL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumBOrL(String value) {
        this.sumBOrL = value;
    }

    /**
     * Gets the value of the sumSOrD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumSOrD() {
        return sumSOrD;
    }

    /**
     * Sets the value of the sumSOrD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumSOrD(String value) {
        this.sumSOrD = value;
    }

}
