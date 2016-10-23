/**
 * VisaTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fi.aalto.t_75_5300.bank;

public class VisaTransaction  implements java.io.Serializable {
    private int amountInCents;

    private fi.aalto.t_75_5300.bank.VisaCard card;

    private java.lang.String targetIBAN;

    private java.lang.String transactionMessage;

    public VisaTransaction() {
    }

    public VisaTransaction(
           int amountInCents,
           fi.aalto.t_75_5300.bank.VisaCard card,
           java.lang.String targetIBAN,
           java.lang.String transactionMessage) {
           this.amountInCents = amountInCents;
           this.card = card;
           this.targetIBAN = targetIBAN;
           this.transactionMessage = transactionMessage;
    }


    /**
     * Gets the amountInCents value for this VisaTransaction.
     * 
     * @return amountInCents
     */
    public int getAmountInCents() {
        return amountInCents;
    }


    /**
     * Sets the amountInCents value for this VisaTransaction.
     * 
     * @param amountInCents
     */
    public void setAmountInCents(int amountInCents) {
        this.amountInCents = amountInCents;
    }


    /**
     * Gets the card value for this VisaTransaction.
     * 
     * @return card
     */
    public fi.aalto.t_75_5300.bank.VisaCard getCard() {
        return card;
    }


    /**
     * Sets the card value for this VisaTransaction.
     * 
     * @param card
     */
    public void setCard(fi.aalto.t_75_5300.bank.VisaCard card) {
        this.card = card;
    }


    /**
     * Gets the targetIBAN value for this VisaTransaction.
     * 
     * @return targetIBAN
     */
    public java.lang.String getTargetIBAN() {
        return targetIBAN;
    }


    /**
     * Sets the targetIBAN value for this VisaTransaction.
     * 
     * @param targetIBAN
     */
    public void setTargetIBAN(java.lang.String targetIBAN) {
        this.targetIBAN = targetIBAN;
    }


    /**
     * Gets the transactionMessage value for this VisaTransaction.
     * 
     * @return transactionMessage
     */
    public java.lang.String getTransactionMessage() {
        return transactionMessage;
    }


    /**
     * Sets the transactionMessage value for this VisaTransaction.
     * 
     * @param transactionMessage
     */
    public void setTransactionMessage(java.lang.String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VisaTransaction)) return false;
        VisaTransaction other = (VisaTransaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amountInCents == other.getAmountInCents() &&
            ((this.card==null && other.getCard()==null) || 
             (this.card!=null &&
              this.card.equals(other.getCard()))) &&
            ((this.targetIBAN==null && other.getTargetIBAN()==null) || 
             (this.targetIBAN!=null &&
              this.targetIBAN.equals(other.getTargetIBAN()))) &&
            ((this.transactionMessage==null && other.getTransactionMessage()==null) || 
             (this.transactionMessage!=null &&
              this.transactionMessage.equals(other.getTransactionMessage())));
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
        _hashCode += getAmountInCents();
        if (getCard() != null) {
            _hashCode += getCard().hashCode();
        }
        if (getTargetIBAN() != null) {
            _hashCode += getTargetIBAN().hashCode();
        }
        if (getTransactionMessage() != null) {
            _hashCode += getTransactionMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VisaTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aalto.fi/t-75.5300/bank", "visaTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountInCents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountInCents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card");
        elemField.setXmlName(new javax.xml.namespace.QName("", "card"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://aalto.fi/t-75.5300/bank", "visaCard"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetIBAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetIBAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
