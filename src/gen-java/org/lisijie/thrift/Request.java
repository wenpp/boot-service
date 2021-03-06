/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.lisijie.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-04-01")
public class Request implements org.apache.thrift.TBase<Request, Request._Fields>, java.io.Serializable, Cloneable, Comparable<Request> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Request");

  private static final org.apache.thrift.protocol.TField CLIENT_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("clientIp", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField APP_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("appId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField APP_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("appKey", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField REQUEST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("requestId", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField REQUEST_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("requestTime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RequestTupleSchemeFactory());
  }

  public long clientIp; // required
  public int appId; // required
  public String appKey; // required
  public String requestId; // required
  public long requestTime; // required
  public String data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CLIENT_IP((short)1, "clientIp"),
    APP_ID((short)2, "appId"),
    APP_KEY((short)3, "appKey"),
    REQUEST_ID((short)4, "requestId"),
    REQUEST_TIME((short)5, "requestTime"),
    DATA((short)6, "data");

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
        case 1: // CLIENT_IP
          return CLIENT_IP;
        case 2: // APP_ID
          return APP_ID;
        case 3: // APP_KEY
          return APP_KEY;
        case 4: // REQUEST_ID
          return REQUEST_ID;
        case 5: // REQUEST_TIME
          return REQUEST_TIME;
        case 6: // DATA
          return DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exceptions
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
  private static final int __CLIENTIP_ISSET_ID = 0;
  private static final int __APPID_ISSET_ID = 1;
  private static final int __REQUESTTIME_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CLIENT_IP, new org.apache.thrift.meta_data.FieldMetaData("clientIp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.APP_ID, new org.apache.thrift.meta_data.FieldMetaData("appId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.APP_KEY, new org.apache.thrift.meta_data.FieldMetaData("appKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUEST_ID, new org.apache.thrift.meta_data.FieldMetaData("requestId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUEST_TIME, new org.apache.thrift.meta_data.FieldMetaData("requestTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Request.class, metaDataMap);
  }

  public Request() {
  }

  public Request(
    long clientIp,
    int appId,
    String appKey,
    String requestId,
    long requestTime,
    String data)
  {
    this();
    this.clientIp = clientIp;
    setClientIpIsSet(true);
    this.appId = appId;
    setAppIdIsSet(true);
    this.appKey = appKey;
    this.requestId = requestId;
    this.requestTime = requestTime;
    setRequestTimeIsSet(true);
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Request(Request other) {
    __isset_bitfield = other.__isset_bitfield;
    this.clientIp = other.clientIp;
    this.appId = other.appId;
    if (other.isSetAppKey()) {
      this.appKey = other.appKey;
    }
    if (other.isSetRequestId()) {
      this.requestId = other.requestId;
    }
    this.requestTime = other.requestTime;
    if (other.isSetData()) {
      this.data = other.data;
    }
  }

  public Request deepCopy() {
    return new Request(this);
  }

  @Override
  public void clear() {
    setClientIpIsSet(false);
    this.clientIp = 0;
    setAppIdIsSet(false);
    this.appId = 0;
    this.appKey = null;
    this.requestId = null;
    setRequestTimeIsSet(false);
    this.requestTime = 0;
    this.data = null;
  }

  public long getClientIp() {
    return this.clientIp;
  }

  public Request setClientIp(long clientIp) {
    this.clientIp = clientIp;
    setClientIpIsSet(true);
    return this;
  }

  public void unsetClientIp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CLIENTIP_ISSET_ID);
  }

  /** Returns true if field clientIp is set (has been assigned a value) and false otherwise */
  public boolean isSetClientIp() {
    return EncodingUtils.testBit(__isset_bitfield, __CLIENTIP_ISSET_ID);
  }

  public void setClientIpIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CLIENTIP_ISSET_ID, value);
  }

  public int getAppId() {
    return this.appId;
  }

  public Request setAppId(int appId) {
    this.appId = appId;
    setAppIdIsSet(true);
    return this;
  }

  public void unsetAppId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __APPID_ISSET_ID);
  }

  /** Returns true if field appId is set (has been assigned a value) and false otherwise */
  public boolean isSetAppId() {
    return EncodingUtils.testBit(__isset_bitfield, __APPID_ISSET_ID);
  }

  public void setAppIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __APPID_ISSET_ID, value);
  }

  public String getAppKey() {
    return this.appKey;
  }

  public Request setAppKey(String appKey) {
    this.appKey = appKey;
    return this;
  }

  public void unsetAppKey() {
    this.appKey = null;
  }

  /** Returns true if field appKey is set (has been assigned a value) and false otherwise */
  public boolean isSetAppKey() {
    return this.appKey != null;
  }

  public void setAppKeyIsSet(boolean value) {
    if (!value) {
      this.appKey = null;
    }
  }

  public String getRequestId() {
    return this.requestId;
  }

  public Request setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public void unsetRequestId() {
    this.requestId = null;
  }

  /** Returns true if field requestId is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestId() {
    return this.requestId != null;
  }

  public void setRequestIdIsSet(boolean value) {
    if (!value) {
      this.requestId = null;
    }
  }

  public long getRequestTime() {
    return this.requestTime;
  }

  public Request setRequestTime(long requestTime) {
    this.requestTime = requestTime;
    setRequestTimeIsSet(true);
    return this;
  }

  public void unsetRequestTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REQUESTTIME_ISSET_ID);
  }

  /** Returns true if field requestTime is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestTime() {
    return EncodingUtils.testBit(__isset_bitfield, __REQUESTTIME_ISSET_ID);
  }

  public void setRequestTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REQUESTTIME_ISSET_ID, value);
  }

  public String getData() {
    return this.data;
  }

  public Request setData(String data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CLIENT_IP:
      if (value == null) {
        unsetClientIp();
      } else {
        setClientIp((Long)value);
      }
      break;

    case APP_ID:
      if (value == null) {
        unsetAppId();
      } else {
        setAppId((Integer)value);
      }
      break;

    case APP_KEY:
      if (value == null) {
        unsetAppKey();
      } else {
        setAppKey((String)value);
      }
      break;

    case REQUEST_ID:
      if (value == null) {
        unsetRequestId();
      } else {
        setRequestId((String)value);
      }
      break;

    case REQUEST_TIME:
      if (value == null) {
        unsetRequestTime();
      } else {
        setRequestTime((Long)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CLIENT_IP:
      return getClientIp();

    case APP_ID:
      return getAppId();

    case APP_KEY:
      return getAppKey();

    case REQUEST_ID:
      return getRequestId();

    case REQUEST_TIME:
      return getRequestTime();

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CLIENT_IP:
      return isSetClientIp();
    case APP_ID:
      return isSetAppId();
    case APP_KEY:
      return isSetAppKey();
    case REQUEST_ID:
      return isSetRequestId();
    case REQUEST_TIME:
      return isSetRequestTime();
    case DATA:
      return isSetData();
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

    boolean this_present_clientIp = true;
    boolean that_present_clientIp = true;
    if (this_present_clientIp || that_present_clientIp) {
      if (!(this_present_clientIp && that_present_clientIp))
        return false;
      if (this.clientIp != that.clientIp)
        return false;
    }

    boolean this_present_appId = true;
    boolean that_present_appId = true;
    if (this_present_appId || that_present_appId) {
      if (!(this_present_appId && that_present_appId))
        return false;
      if (this.appId != that.appId)
        return false;
    }

    boolean this_present_appKey = true && this.isSetAppKey();
    boolean that_present_appKey = true && that.isSetAppKey();
    if (this_present_appKey || that_present_appKey) {
      if (!(this_present_appKey && that_present_appKey))
        return false;
      if (!this.appKey.equals(that.appKey))
        return false;
    }

    boolean this_present_requestId = true && this.isSetRequestId();
    boolean that_present_requestId = true && that.isSetRequestId();
    if (this_present_requestId || that_present_requestId) {
      if (!(this_present_requestId && that_present_requestId))
        return false;
      if (!this.requestId.equals(that.requestId))
        return false;
    }

    boolean this_present_requestTime = true;
    boolean that_present_requestTime = true;
    if (this_present_requestTime || that_present_requestTime) {
      if (!(this_present_requestTime && that_present_requestTime))
        return false;
      if (this.requestTime != that.requestTime)
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_clientIp = true;
    list.add(present_clientIp);
    if (present_clientIp)
      list.add(clientIp);

    boolean present_appId = true;
    list.add(present_appId);
    if (present_appId)
      list.add(appId);

    boolean present_appKey = true && (isSetAppKey());
    list.add(present_appKey);
    if (present_appKey)
      list.add(appKey);

    boolean present_requestId = true && (isSetRequestId());
    list.add(present_requestId);
    if (present_requestId)
      list.add(requestId);

    boolean present_requestTime = true;
    list.add(present_requestTime);
    if (present_requestTime)
      list.add(requestTime);

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    return list.hashCode();
  }

  @Override
  public int compareTo(Request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetClientIp()).compareTo(other.isSetClientIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClientIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.clientIp, other.clientIp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppId()).compareTo(other.isSetAppId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appId, other.appId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAppKey()).compareTo(other.isSetAppKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAppKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.appKey, other.appKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestId()).compareTo(other.isSetRequestId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestId, other.requestId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestTime()).compareTo(other.isSetRequestTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestTime, other.requestTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
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

    sb.append("clientIp:");
    sb.append(this.clientIp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("appId:");
    sb.append(this.appId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("appKey:");
    if (this.appKey == null) {
      sb.append("null");
    } else {
      sb.append(this.appKey);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestId:");
    if (this.requestId == null) {
      sb.append("null");
    } else {
      sb.append(this.requestId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestTime:");
    sb.append(this.requestTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
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
          case 1: // CLIENT_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.clientIp = iprot.readI64();
              struct.setClientIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // APP_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.appId = iprot.readI32();
              struct.setAppIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // APP_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.appKey = iprot.readString();
              struct.setAppKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // REQUEST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestId = iprot.readString();
              struct.setRequestIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REQUEST_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.requestTime = iprot.readI64();
              struct.setRequestTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.data = iprot.readString();
              struct.setDataIsSet(true);
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
      oprot.writeFieldBegin(CLIENT_IP_FIELD_DESC);
      oprot.writeI64(struct.clientIp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(APP_ID_FIELD_DESC);
      oprot.writeI32(struct.appId);
      oprot.writeFieldEnd();
      if (struct.appKey != null) {
        oprot.writeFieldBegin(APP_KEY_FIELD_DESC);
        oprot.writeString(struct.appKey);
        oprot.writeFieldEnd();
      }
      if (struct.requestId != null) {
        oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
        oprot.writeString(struct.requestId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(REQUEST_TIME_FIELD_DESC);
      oprot.writeI64(struct.requestTime);
      oprot.writeFieldEnd();
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        oprot.writeString(struct.data);
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
      BitSet optionals = new BitSet();
      if (struct.isSetClientIp()) {
        optionals.set(0);
      }
      if (struct.isSetAppId()) {
        optionals.set(1);
      }
      if (struct.isSetAppKey()) {
        optionals.set(2);
      }
      if (struct.isSetRequestId()) {
        optionals.set(3);
      }
      if (struct.isSetRequestTime()) {
        optionals.set(4);
      }
      if (struct.isSetData()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetClientIp()) {
        oprot.writeI64(struct.clientIp);
      }
      if (struct.isSetAppId()) {
        oprot.writeI32(struct.appId);
      }
      if (struct.isSetAppKey()) {
        oprot.writeString(struct.appKey);
      }
      if (struct.isSetRequestId()) {
        oprot.writeString(struct.requestId);
      }
      if (struct.isSetRequestTime()) {
        oprot.writeI64(struct.requestTime);
      }
      if (struct.isSetData()) {
        oprot.writeString(struct.data);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Request struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.clientIp = iprot.readI64();
        struct.setClientIpIsSet(true);
      }
      if (incoming.get(1)) {
        struct.appId = iprot.readI32();
        struct.setAppIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.appKey = iprot.readString();
        struct.setAppKeyIsSet(true);
      }
      if (incoming.get(3)) {
        struct.requestId = iprot.readString();
        struct.setRequestIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.requestTime = iprot.readI64();
        struct.setRequestTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.data = iprot.readString();
        struct.setDataIsSet(true);
      }
    }
  }

}

