/**
 * MakePaymentRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws.service.instantpayment.request;

public class MakePaymentRequest  implements java.io.Serializable {
    private java.lang.String cardHolderName;

    private java.lang.String cardNumber;

    private int cardSecurityCode;

    private java.lang.String transactionNumber;

    public MakePaymentRequest() {
    }

    public MakePaymentRequest(
           java.lang.String cardHolderName,
           java.lang.String cardNumber,
           int cardSecurityCode,
           java.lang.String transactionNumber) {
           this.cardHolderName = cardHolderName;
           this.cardNumber = cardNumber;
           this.cardSecurityCode = cardSecurityCode;
           this.transactionNumber = transactionNumber;
    }


    /**
     * Gets the cardHolderName value for this MakePaymentRequest.
     * 
     * @return cardHolderName
     */
    public java.lang.String getCardHolderName() {
        return cardHolderName;
    }


    /**
     * Sets the cardHolderName value for this MakePaymentRequest.
     * 
     * @param cardHolderName
     */
    public void setCardHolderName(java.lang.String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }


    /**
     * Gets the cardNumber value for this MakePaymentRequest.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this MakePaymentRequest.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the cardSecurityCode value for this MakePaymentRequest.
     * 
     * @return cardSecurityCode
     */
    public int getCardSecurityCode() {
        return cardSecurityCode;
    }


    /**
     * Sets the cardSecurityCode value for this MakePaymentRequest.
     * 
     * @param cardSecurityCode
     */
    public void setCardSecurityCode(int cardSecurityCode) {
        this.cardSecurityCode = cardSecurityCode;
    }


    /**
     * Gets the transactionNumber value for this MakePaymentRequest.
     * 
     * @return transactionNumber
     */
    public java.lang.String getTransactionNumber() {
        return transactionNumber;
    }


    /**
     * Sets the transactionNumber value for this MakePaymentRequest.
     * 
     * @param transactionNumber
     */
    public void setTransactionNumber(java.lang.String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MakePaymentRequest)) return false;
        MakePaymentRequest other = (MakePaymentRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardHolderName==null && other.getCardHolderName()==null) || 
             (this.cardHolderName!=null &&
              this.cardHolderName.equals(other.getCardHolderName()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            this.cardSecurityCode == other.getCardSecurityCode() &&
            ((this.transactionNumber==null && other.getTransactionNumber()==null) || 
             (this.transactionNumber!=null &&
              this.transactionNumber.equals(other.getTransactionNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCardHolderName() != null) {
            _hashCode += getCardHolderName().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        _hashCode += getCardSecurityCode();
        if (getTransactionNumber() != null) {
            _hashCode += getTransactionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MakePaymentRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.instantpayment.service.ws.com", "MakePaymentRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardHolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.instantpayment.service.ws.com", "cardHolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.instantpayment.service.ws.com", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSecurityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.instantpayment.service.ws.com", "cardSecurityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.instantpayment.service.ws.com", "transactionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
