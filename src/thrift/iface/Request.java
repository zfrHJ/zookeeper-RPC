/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package thrift.iface;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Collections;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-11-22")
public class Request implements org.apache.thrift.TBase<Request, Request._Fields>, java.io.Serializable, Cloneable, Comparable<Request> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Request");

  private static final org.apache.thrift.protocol.TField PARAM_JSON_FIELD_DESC = new org.apache.thrift.protocol.TField("paramJSON", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SERVICE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("serviceName", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RequestTupleSchemeFactory());
  }

  public ByteBuffer paramJSON; // required
  public String serviceName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARAM_JSON((short)1, "paramJSON"),
    SERVICE_NAME((short)2, "serviceName");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PARAM_JSON
          return PARAM_JSON;
        case 2: // SERVICE_NAME
          return SERVICE_NAME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARAM_JSON, new org.apache.thrift.meta_data.FieldMetaData("paramJSON", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.SERVICE_NAME, new org.apache.thrift.meta_data.FieldMetaData("serviceName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Request.class, metaDataMap);
  }

  public Request() {
  }

  public Request(
    ByteBuffer paramJSON,
    String serviceName)
  {
    this();
    this.paramJSON = org.apache.thrift.TBaseHelper.copyBinary(paramJSON);
    this.serviceName = serviceName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Request(Request other) {
    if (other.isSetParamJSON()) {
      this.paramJSON = org.apache.thrift.TBaseHelper.copyBinary(other.paramJSON);
    }
    if (other.isSetServiceName()) {
      this.serviceName = other.serviceName;
    }
  }

  public Request deepCopy() {
    return new Request(this);
  }

  @Override
  public void clear() {
    this.paramJSON = null;
    this.serviceName = null;
  }

  public byte[] getParamJSON() {
    setParamJSON(org.apache.thrift.TBaseHelper.rightSize(paramJSON));
    return paramJSON == null ? null : paramJSON.array();
  }

  public ByteBuffer bufferForParamJSON() {
    return org.apache.thrift.TBaseHelper.copyBinary(paramJSON);
  }

  public Request setParamJSON(byte[] paramJSON) {
    this.paramJSON = paramJSON == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(paramJSON, paramJSON.length));
    return this;
  }

  public Request setParamJSON(ByteBuffer paramJSON) {
    this.paramJSON = org.apache.thrift.TBaseHelper.copyBinary(paramJSON);
    return this;
  }

  public void unsetParamJSON() {
    this.paramJSON = null;
  }

  /** Returns true if field paramJSON is set (has been assigned a value) and false otherwise */
  public boolean isSetParamJSON() {
    return this.paramJSON != null;
  }

  public void setParamJSONIsSet(boolean value) {
    if (!value) {
      this.paramJSON = null;
    }
  }

  public String getServiceName() {
    return this.serviceName;
  }

  public Request setServiceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  public void unsetServiceName() {
    this.serviceName = null;
  }

  /** Returns true if field serviceName is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceName() {
    return this.serviceName != null;
  }

  public void setServiceNameIsSet(boolean value) {
    if (!value) {
      this.serviceName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARAM_JSON:
      if (value == null) {
        unsetParamJSON();
      } else {
        setParamJSON((ByteBuffer)value);
      }
      break;

    case SERVICE_NAME:
      if (value == null) {
        unsetServiceName();
      } else {
        setServiceName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARAM_JSON:
      return getParamJSON();

    case SERVICE_NAME:
      return getServiceName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARAM_JSON:
      return isSetParamJSON();
    case SERVICE_NAME:
      return isSetServiceName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Request)
      return this.equals((Request)that);
    return false;
  }

  public boolean equals(Request that) {
    if (that == null)
      return false;

    boolean this_present_paramJSON = true && this.isSetParamJSON();
    boolean that_present_paramJSON = true && that.isSetParamJSON();
    if (this_present_paramJSON || that_present_paramJSON) {
      if (!(this_present_paramJSON && that_present_paramJSON))
        return false;
      if (!this.paramJSON.equals(that.paramJSON))
        return false;
    }

    boolean this_present_serviceName = true && this.isSetServiceName();
    boolean that_present_serviceName = true && that.isSetServiceName();
    if (this_present_serviceName || that_present_serviceName) {
      if (!(this_present_serviceName && that_present_serviceName))
        return false;
      if (!this.serviceName.equals(that.serviceName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_paramJSON = true && (isSetParamJSON());
    list.add(present_paramJSON);
    if (present_paramJSON)
      list.add(paramJSON);

    boolean present_serviceName = true && (isSetServiceName());
    list.add(present_serviceName);
    if (present_serviceName)
      list.add(serviceName);

    return list.hashCode();
  }

  @Override
  public int compareTo(Request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetParamJSON()).compareTo(other.isSetParamJSON());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParamJSON()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paramJSON, other.paramJSON);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServiceName()).compareTo(other.isSetServiceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceName, other.serviceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Request(");
    boolean first = true;

    sb.append("paramJSON:");
    if (this.paramJSON == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.paramJSON, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serviceName:");
    if (this.serviceName == null) {
      sb.append("null");
    } else {
      sb.append(this.serviceName);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (paramJSON == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'paramJSON' was not present! Struct: " + toString());
    }
    if (serviceName == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'serviceName' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RequestStandardSchemeFactory implements SchemeFactory {
    public RequestStandardScheme getScheme() {
      return new RequestStandardScheme();
    }
  }

  private static class RequestStandardScheme extends StandardScheme<Request> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Request struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARAM_JSON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.paramJSON = iprot.readBinary();
              struct.setParamJSONIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SERVICE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.serviceName = iprot.readString();
              struct.setServiceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Request struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.paramJSON != null) {
        oprot.writeFieldBegin(PARAM_JSON_FIELD_DESC);
        oprot.writeBinary(struct.paramJSON);
        oprot.writeFieldEnd();
      }
      if (struct.serviceName != null) {
        oprot.writeFieldBegin(SERVICE_NAME_FIELD_DESC);
        oprot.writeString(struct.serviceName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RequestTupleSchemeFactory implements SchemeFactory {
    public RequestTupleScheme getScheme() {
      return new RequestTupleScheme();
    }
  }

  private static class RequestTupleScheme extends TupleScheme<Request> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeBinary(struct.paramJSON);
      oprot.writeString(struct.serviceName);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.paramJSON = iprot.readBinary();
      struct.setParamJSONIsSet(true);
      struct.serviceName = iprot.readString();
      struct.setServiceNameIsSet(true);
    }
  }

}

