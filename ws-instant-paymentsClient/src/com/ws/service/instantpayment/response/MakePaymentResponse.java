/**
 * MakePaymentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ws.service.instantpayment.response;

public class MakePaymentResponse  implements java.io.Serializable {
    private java.lang.Boolean isProcessed;

    public MakePaymentResponse() {
    }

    public MakePaymentResponse(
           java.lang.Boolean isProcessed) {
           this.isProcessed = isProcessed;
    }


    /**
     * Gets the isProcessed value for this MakePaymentResponse.
     * 
     * @return isProcessed
     */
    public java.lang.Boolean getIsProcessed() {
        return isProcessed;
    }


    /**
     * Sets the isProcessed value for this MakePaymentResponse.
     * 
     * @param isProcessed
     */
    public void setIsProcessed(java.lang.Boolean isProcessed) {
        this.isProcessed = isProcessed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MakePaymentResponse)) return false;
        MakePaymentResponse other = (MakePaymentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isProcessed==null && other.getIsProcessed()==null) || 
             (this.isProcessed!=null &&
              this.isProcessed.equals(other.getIsProcessed())));
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
        if (getIsProcessed() != null) {
            _hashCode += getIsProcessed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MakePaymentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.instantpayment.service.ws.com", "MakePaymentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProcessed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.instantpayment.service.ws.com", "isProcessed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
