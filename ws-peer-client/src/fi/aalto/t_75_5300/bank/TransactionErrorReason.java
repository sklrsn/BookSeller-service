/**
 * TransactionErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fi.aalto.t_75_5300.bank;

public class TransactionErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_AMOUNT = "INVALID_AMOUNT";
    public static final java.lang.String _INVALID_CARD_NUMBER = "INVALID_CARD_NUMBER";
    public static final java.lang.String _CARD_EXPIRED = "CARD_EXPIRED";
    public static final java.lang.String _INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    public static final TransactionErrorReason INVALID_AMOUNT = new TransactionErrorReason(_INVALID_AMOUNT);
    public static final TransactionErrorReason INVALID_CARD_NUMBER = new TransactionErrorReason(_INVALID_CARD_NUMBER);
    public static final TransactionErrorReason CARD_EXPIRED = new TransactionErrorReason(_CARD_EXPIRED);
    public static final TransactionErrorReason INTERNAL_SERVER_ERROR = new TransactionErrorReason(_INTERNAL_SERVER_ERROR);
    public java.lang.String getValue() { return _value_;}
    public static TransactionErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionErrorReason enumeration = (TransactionErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionErrorReason fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://aalto.fi/t-75.5300/bank", "transactionErrorReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
