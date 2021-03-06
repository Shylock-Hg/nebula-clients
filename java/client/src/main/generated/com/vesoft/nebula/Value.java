/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial", "unchecked" })
public class Value extends TUnion<Value> {
  public static boolean DEFAULT_PRETTY_PRINT = true;
  private static final TStruct STRUCT_DESC = new TStruct("Value");
  private static final TField N_VAL_FIELD_DESC = new TField("nVal", TType.I32, (short)1);
  private static final TField B_VAL_FIELD_DESC = new TField("bVal", TType.BOOL, (short)2);
  private static final TField I_VAL_FIELD_DESC = new TField("iVal", TType.I64, (short)3);
  private static final TField F_VAL_FIELD_DESC = new TField("fVal", TType.DOUBLE, (short)4);
  private static final TField S_VAL_FIELD_DESC = new TField("sVal", TType.STRING, (short)5);
  private static final TField D_VAL_FIELD_DESC = new TField("dVal", TType.STRUCT, (short)6);
  private static final TField T_VAL_FIELD_DESC = new TField("tVal", TType.STRUCT, (short)7);
  private static final TField DT_VAL_FIELD_DESC = new TField("dtVal", TType.STRUCT, (short)8);
  private static final TField V_VAL_FIELD_DESC = new TField("vVal", TType.STRUCT, (short)9);
  private static final TField E_VAL_FIELD_DESC = new TField("eVal", TType.STRUCT, (short)10);
  private static final TField P_VAL_FIELD_DESC = new TField("pVal", TType.STRUCT, (short)11);
  private static final TField L_VAL_FIELD_DESC = new TField("lVal", TType.STRUCT, (short)12);
  private static final TField M_VAL_FIELD_DESC = new TField("mVal", TType.STRUCT, (short)13);
  private static final TField U_VAL_FIELD_DESC = new TField("uVal", TType.STRUCT, (short)14);
  private static final TField G_VAL_FIELD_DESC = new TField("gVal", TType.STRUCT, (short)15);

  public static final int NVAL = 1;
  public static final int BVAL = 2;
  public static final int IVAL = 3;
  public static final int FVAL = 4;
  public static final int SVAL = 5;
  public static final int DVAL = 6;
  public static final int TVAL = 7;
  public static final int DTVAL = 8;
  public static final int VVAL = 9;
  public static final int EVAL = 10;
  public static final int PVAL = 11;
  public static final int LVAL = 12;
  public static final int MVAL = 13;
  public static final int UVAL = 14;
  public static final int GVAL = 15;

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(NVAL, new FieldMetaData("nVal", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(BVAL, new FieldMetaData("bVal", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(IVAL, new FieldMetaData("iVal", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(FVAL, new FieldMetaData("fVal", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.DOUBLE)));
    tmpMetaDataMap.put(SVAL, new FieldMetaData("sVal", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(DVAL, new FieldMetaData("dVal", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Date.class)));
    tmpMetaDataMap.put(TVAL, new FieldMetaData("tVal", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Time.class)));
    tmpMetaDataMap.put(DTVAL, new FieldMetaData("dtVal", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, DateTime.class)));
    tmpMetaDataMap.put(VVAL, new FieldMetaData("vVal", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Vertex.class)));
    tmpMetaDataMap.put(EVAL, new FieldMetaData("eVal", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Edge.class)));
    tmpMetaDataMap.put(PVAL, new FieldMetaData("pVal", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, Path.class)));
    tmpMetaDataMap.put(LVAL, new FieldMetaData("lVal", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.List.class)));
    tmpMetaDataMap.put(MVAL, new FieldMetaData("mVal", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.Map.class)));
    tmpMetaDataMap.put(UVAL, new FieldMetaData("uVal", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.Set.class)));
    tmpMetaDataMap.put(GVAL, new FieldMetaData("gVal", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, DataSet.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  public Value() {
    super();
  }

  public Value(int setField, Object value) {
    super(setField, value);
  }

  public Value(Value other) {
    super(other);
  }
  public Value deepCopy() {
    return new Value(this);
  }

  public static Value nVal(int value) {
    Value x = new Value();
    x.setNVal(value);
    return x;
  }

  public static Value bVal(boolean value) {
    Value x = new Value();
    x.setBVal(value);
    return x;
  }

  public static Value iVal(long value) {
    Value x = new Value();
    x.setIVal(value);
    return x;
  }

  public static Value fVal(double value) {
    Value x = new Value();
    x.setFVal(value);
    return x;
  }

  public static Value sVal(byte[] value) {
    Value x = new Value();
    x.setSVal(value);
    return x;
  }

  public static Value dVal(Date value) {
    Value x = new Value();
    x.setDVal(value);
    return x;
  }

  public static Value tVal(Time value) {
    Value x = new Value();
    x.setTVal(value);
    return x;
  }

  public static Value dtVal(DateTime value) {
    Value x = new Value();
    x.setDtVal(value);
    return x;
  }

  public static Value vVal(Vertex value) {
    Value x = new Value();
    x.setVVal(value);
    return x;
  }

  public static Value eVal(Edge value) {
    Value x = new Value();
    x.setEVal(value);
    return x;
  }

  public static Value pVal(Path value) {
    Value x = new Value();
    x.setPVal(value);
    return x;
  }

  public static Value lVal(List value) {
    Value x = new Value();
    x.setLVal(value);
    return x;
  }

  public static Value mVal(Map value) {
    Value x = new Value();
    x.setMVal(value);
    return x;
  }

  public static Value uVal(Set value) {
    Value x = new Value();
    x.setUVal(value);
    return x;
  }

  public static Value gVal(DataSet value) {
    Value x = new Value();
    x.setGVal(value);
    return x;
  }


  @Override
  protected void checkType(short setField, Object value) throws ClassCastException {
    switch (setField) {
      case NVAL:
        if (value instanceof Integer) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Integer for field 'nVal', but got " + value.getClass().getSimpleName());
      case BVAL:
        if (value instanceof Boolean) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Boolean for field 'bVal', but got " + value.getClass().getSimpleName());
      case IVAL:
        if (value instanceof Long) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Long for field 'iVal', but got " + value.getClass().getSimpleName());
      case FVAL:
        if (value instanceof Double) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Double for field 'fVal', but got " + value.getClass().getSimpleName());
      case SVAL:
        if (value instanceof byte[]) {
          break;
        }
        throw new ClassCastException("Was expecting value of type byte[] for field 'sVal', but got " + value.getClass().getSimpleName());
      case DVAL:
        if (value instanceof Date) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Date for field 'dVal', but got " + value.getClass().getSimpleName());
      case TVAL:
        if (value instanceof Time) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Time for field 'tVal', but got " + value.getClass().getSimpleName());
      case DTVAL:
        if (value instanceof DateTime) {
          break;
        }
        throw new ClassCastException("Was expecting value of type DateTime for field 'dtVal', but got " + value.getClass().getSimpleName());
      case VVAL:
        if (value instanceof Vertex) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Vertex for field 'vVal', but got " + value.getClass().getSimpleName());
      case EVAL:
        if (value instanceof Edge) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Edge for field 'eVal', but got " + value.getClass().getSimpleName());
      case PVAL:
        if (value instanceof Path) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Path for field 'pVal', but got " + value.getClass().getSimpleName());
      case LVAL:
        if (value instanceof List) {
          break;
        }
        throw new ClassCastException("Was expecting value of type List for field 'lVal', but got " + value.getClass().getSimpleName());
      case MVAL:
        if (value instanceof Map) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Map for field 'mVal', but got " + value.getClass().getSimpleName());
      case UVAL:
        if (value instanceof Set) {
          break;
        }
        throw new ClassCastException("Was expecting value of type Set for field 'uVal', but got " + value.getClass().getSimpleName());
      case GVAL:
        if (value instanceof DataSet) {
          break;
        }
        throw new ClassCastException("Was expecting value of type DataSet for field 'gVal', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  public void read(TProtocol iprot) throws TException {
    setField_ = 0;
    value_ = null;
    iprot.readStructBegin(metaDataMap);
    TField field = iprot.readFieldBegin();
    if (field.type != TType.STOP)
    {
      value_ = readValue(iprot, field);
      if (value_ != null)
      {
        switch (field.id) {
          case NVAL:
            if (field.type == N_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case BVAL:
            if (field.type == B_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case IVAL:
            if (field.type == I_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case FVAL:
            if (field.type == F_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case SVAL:
            if (field.type == S_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case DVAL:
            if (field.type == D_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case TVAL:
            if (field.type == T_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case DTVAL:
            if (field.type == DT_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case VVAL:
            if (field.type == V_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case EVAL:
            if (field.type == E_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case PVAL:
            if (field.type == P_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case LVAL:
            if (field.type == L_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case MVAL:
            if (field.type == M_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case UVAL:
            if (field.type == U_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
          case GVAL:
            if (field.type == G_VAL_FIELD_DESC.type) {
              setField_ = field.id;
            }
            break;
        }
      }
      iprot.readFieldEnd();
      iprot.readFieldBegin();
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
  }

  @Override
  protected Object readValue(TProtocol iprot, TField field) throws TException {
    switch (field.id) {
      case NVAL:
        if (field.type == N_VAL_FIELD_DESC.type) {
          Integer nVal;
          nVal = iprot.readI32();
          return nVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case BVAL:
        if (field.type == B_VAL_FIELD_DESC.type) {
          Boolean bVal;
          bVal = iprot.readBool();
          return bVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case IVAL:
        if (field.type == I_VAL_FIELD_DESC.type) {
          Long iVal;
          iVal = iprot.readI64();
          return iVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case FVAL:
        if (field.type == F_VAL_FIELD_DESC.type) {
          Double fVal;
          fVal = iprot.readDouble();
          return fVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case SVAL:
        if (field.type == S_VAL_FIELD_DESC.type) {
          byte[] sVal;
          sVal = iprot.readBinary();
          return sVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case DVAL:
        if (field.type == D_VAL_FIELD_DESC.type) {
          Date dVal;
          dVal = new Date();
          dVal.read(iprot);
          return dVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case TVAL:
        if (field.type == T_VAL_FIELD_DESC.type) {
          Time tVal;
          tVal = new Time();
          tVal.read(iprot);
          return tVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case DTVAL:
        if (field.type == DT_VAL_FIELD_DESC.type) {
          DateTime dtVal;
          dtVal = new DateTime();
          dtVal.read(iprot);
          return dtVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case VVAL:
        if (field.type == V_VAL_FIELD_DESC.type) {
          Vertex vVal;
          vVal = new Vertex();
          vVal.read(iprot);
          return vVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case EVAL:
        if (field.type == E_VAL_FIELD_DESC.type) {
          Edge eVal;
          eVal = new Edge();
          eVal.read(iprot);
          return eVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case PVAL:
        if (field.type == P_VAL_FIELD_DESC.type) {
          Path pVal;
          pVal = new Path();
          pVal.read(iprot);
          return pVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case LVAL:
        if (field.type == L_VAL_FIELD_DESC.type) {
          com.vesoft.nebula.List lVal;
          lVal = new com.vesoft.nebula.List();
          lVal.read(iprot);
          return lVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case MVAL:
        if (field.type == M_VAL_FIELD_DESC.type) {
          com.vesoft.nebula.Map mVal;
          mVal = new com.vesoft.nebula.Map();
          mVal.read(iprot);
          return mVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case UVAL:
        if (field.type == U_VAL_FIELD_DESC.type) {
          com.vesoft.nebula.Set uVal;
          uVal = new com.vesoft.nebula.Set();
          uVal.read(iprot);
          return uVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      case GVAL:
        if (field.type == G_VAL_FIELD_DESC.type) {
          DataSet gVal;
          gVal = new DataSet();
          gVal.read(iprot);
          return gVal;
        } else {
          TProtocolUtil.skip(iprot, field.type);
          return null;
        }
      default:
        TProtocolUtil.skip(iprot, field.type);
        return null;
    }
  }

  @Override
  protected void writeValue(TProtocol oprot, short setField, Object value) throws TException {
    switch (setField) {
      case NVAL:
        Integer nVal = (Integer)getFieldValue();
        oprot.writeI32(nVal);
        return;
      case BVAL:
        Boolean bVal = (Boolean)getFieldValue();
        oprot.writeBool(bVal);
        return;
      case IVAL:
        Long iVal = (Long)getFieldValue();
        oprot.writeI64(iVal);
        return;
      case FVAL:
        Double fVal = (Double)getFieldValue();
        oprot.writeDouble(fVal);
        return;
      case SVAL:
        byte[] sVal = (byte[])getFieldValue();
        oprot.writeBinary(sVal);
        return;
      case DVAL:
        Date dVal = (Date)getFieldValue();
        dVal.write(oprot);
        return;
      case TVAL:
        Time tVal = (Time)getFieldValue();
        tVal.write(oprot);
        return;
      case DTVAL:
        DateTime dtVal = (DateTime)getFieldValue();
        dtVal.write(oprot);
        return;
      case VVAL:
        Vertex vVal = (Vertex)getFieldValue();
        vVal.write(oprot);
        return;
      case EVAL:
        Edge eVal = (Edge)getFieldValue();
        eVal.write(oprot);
        return;
      case PVAL:
        Path pVal = (Path)getFieldValue();
        pVal.write(oprot);
        return;
      case LVAL:
        com.vesoft.nebula.List lVal = (com.vesoft.nebula.List)getFieldValue();
        lVal.write(oprot);
        return;
      case MVAL:
        com.vesoft.nebula.Map mVal = (com.vesoft.nebula.Map)getFieldValue();
        mVal.write(oprot);
        return;
      case UVAL:
        com.vesoft.nebula.Set uVal = (com.vesoft.nebula.Set)getFieldValue();
        uVal.write(oprot);
        return;
      case GVAL:
        DataSet gVal = (DataSet)getFieldValue();
        gVal.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField);
    }
  }

  @Override
  protected TField getFieldDesc(int setField) {
    switch (setField) {
      case NVAL:
        return N_VAL_FIELD_DESC;
      case BVAL:
        return B_VAL_FIELD_DESC;
      case IVAL:
        return I_VAL_FIELD_DESC;
      case FVAL:
        return F_VAL_FIELD_DESC;
      case SVAL:
        return S_VAL_FIELD_DESC;
      case DVAL:
        return D_VAL_FIELD_DESC;
      case TVAL:
        return T_VAL_FIELD_DESC;
      case DTVAL:
        return DT_VAL_FIELD_DESC;
      case VVAL:
        return V_VAL_FIELD_DESC;
      case EVAL:
        return E_VAL_FIELD_DESC;
      case PVAL:
        return P_VAL_FIELD_DESC;
      case LVAL:
        return L_VAL_FIELD_DESC;
      case MVAL:
        return M_VAL_FIELD_DESC;
      case UVAL:
        return U_VAL_FIELD_DESC;
      case GVAL:
        return G_VAL_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  /**
   * 
   * @see NullType
   */
  public int  getNVal() {
    if (getSetField() == NVAL) {
      return (Integer)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'nVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  /**
   * 
   * @see NullType
   */
  public void setNVal(int value) {
    setField_ = NVAL;
    value_ = value;
  }

  public boolean  isBVal() {
    if (getSetField() == BVAL) {
      return (Boolean)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'bVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBVal(boolean value) {
    setField_ = BVAL;
    value_ = value;
  }

  public long  getIVal() {
    if (getSetField() == IVAL) {
      return (Long)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'iVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setIVal(long value) {
    setField_ = IVAL;
    value_ = value;
  }

  public double  getFVal() {
    if (getSetField() == FVAL) {
      return (Double)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'fVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFVal(double value) {
    setField_ = FVAL;
    value_ = value;
  }

  public byte[]  getSVal() {
    if (getSetField() == SVAL) {
      return (byte[])getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'sVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSVal(byte[] value) {
    if (value == null) throw new NullPointerException();
    setField_ = SVAL;
    value_ = value;
  }

  public Date  getDVal() {
    if (getSetField() == DVAL) {
      return (Date)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'dVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDVal(Date value) {
    if (value == null) throw new NullPointerException();
    setField_ = DVAL;
    value_ = value;
  }

  public Time  getTVal() {
    if (getSetField() == TVAL) {
      return (Time)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'tVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTVal(Time value) {
    if (value == null) throw new NullPointerException();
    setField_ = TVAL;
    value_ = value;
  }

  public DateTime  getDtVal() {
    if (getSetField() == DTVAL) {
      return (DateTime)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'dtVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setDtVal(DateTime value) {
    if (value == null) throw new NullPointerException();
    setField_ = DTVAL;
    value_ = value;
  }

  public Vertex  getVVal() {
    if (getSetField() == VVAL) {
      return (Vertex)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'vVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setVVal(Vertex value) {
    if (value == null) throw new NullPointerException();
    setField_ = VVAL;
    value_ = value;
  }

  public Edge  getEVal() {
    if (getSetField() == EVAL) {
      return (Edge)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'eVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setEVal(Edge value) {
    if (value == null) throw new NullPointerException();
    setField_ = EVAL;
    value_ = value;
  }

  public Path  getPVal() {
    if (getSetField() == PVAL) {
      return (Path)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'pVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPVal(Path value) {
    if (value == null) throw new NullPointerException();
    setField_ = PVAL;
    value_ = value;
  }

  public List  getLVal() {
    if (getSetField() == LVAL) {
      return (List)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'lVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLVal(List value) {
    if (value == null) throw new NullPointerException();
    setField_ = LVAL;
    value_ = value;
  }

  public Map  getMVal() {
    if (getSetField() == MVAL) {
      return (Map)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'mVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setMVal(Map value) {
    if (value == null) throw new NullPointerException();
    setField_ = MVAL;
    value_ = value;
  }

  public Set  getUVal() {
    if (getSetField() == UVAL) {
      return (Set)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'uVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setUVal(Set value) {
    if (value == null) throw new NullPointerException();
    setField_ = UVAL;
    value_ = value;
  }

  public DataSet  getGVal() {
    if (getSetField() == GVAL) {
      return (DataSet)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'gVal' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setGVal(DataSet value) {
    if (value == null) throw new NullPointerException();
    setField_ = GVAL;
    value_ = value;
  }

  public boolean equals(Object other) {
    if (other instanceof Value) {
      return equals((Value)other);
    } else {
      return false;
    }
  }

  public boolean equals(Value other) {
    return equalsSlowImpl(other);
  }


  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(getSetField()).append(getFieldValue()).toHashCode();
  }
  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("Value");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    // Only print this field if it is the set field
    if (getSetField() == NVAL)
    {
      sb.append(indentStr);
      sb.append("nVal");
      sb.append(space);
      sb.append(":").append(space);
      String nVal_name = NullType.VALUES_TO_NAMES.get(this. getNVal());
      if (nVal_name != null) {
        sb.append(nVal_name);
        sb.append(" (");
      }
      sb.append(this. getNVal());
      if (nVal_name != null) {
        sb.append(")");
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == BVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("bVal");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. isBVal(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == IVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("iVal");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getIVal(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == FVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("fVal");
      sb.append(space);
      sb.append(":").append(space);
      sb.append(TBaseHelper.toString(this. getFVal(), indent + 1, prettyPrint));
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == SVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("sVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getSVal() == null) {
        sb.append("null");
      } else {
          int __sVal_size = Math.min(this. getSVal().length, 128);
          for (int i = 0; i < __sVal_size; i++) {
            if (i != 0) sb.append(" ");
            sb.append(Integer.toHexString(this. getSVal()[i]).length() > 1 ? Integer.toHexString(this. getSVal()[i]).substring(Integer.toHexString(this. getSVal()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this. getSVal()[i]).toUpperCase());
          }
          if (this. getSVal().length > 128) sb.append(" ...");
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == DVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("dVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getDVal() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getDVal(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == TVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("tVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getTVal() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getTVal(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == DTVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("dtVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getDtVal() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getDtVal(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == VVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("vVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getVVal() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getVVal(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == EVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("eVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getEVal() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getEVal(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == PVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("pVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getPVal() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getPVal(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == LVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("lVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getLVal() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getLVal(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == MVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("mVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getMVal() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getMVal(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == UVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("uVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getUVal() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getUVal(), indent + 1, prettyPrint));
      }
      first = false;
    }
    // Only print this field if it is the set field
    if (getSetField() == GVAL)
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("gVal");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getGVal() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getGVal(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }


}
