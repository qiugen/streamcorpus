/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package streamcorpus;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description of a relation between two entities that a tagger
 * discovered in the text.
 */
public class Relation implements org.apache.thrift.TBase<Relation, Relation._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Relation");

  private static final org.apache.thrift.protocol.TField RELATION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("relation_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SENTENCE_ID_1_FIELD_DESC = new org.apache.thrift.protocol.TField("sentence_id_1", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField MENTION_ID_1_FIELD_DESC = new org.apache.thrift.protocol.TField("mention_id_1", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField SENTENCE_ID_2_FIELD_DESC = new org.apache.thrift.protocol.TField("sentence_id_2", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField MENTION_ID_2_FIELD_DESC = new org.apache.thrift.protocol.TField("mention_id_2", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RelationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RelationTupleSchemeFactory());
  }

  /**
   * The type of the relation, see documentation for RelationType
   * 
   * 
   * @see RelationType
   */
  public RelationType relation_type; // optional
  /**
   * Zero-based index into the sentences array for this TaggerID
   */
  public int sentence_id_1; // optional
  /**
   * Index into the mentions in the document.  This identifies the
   * origin of the relation.  For example, the relation
   *    (Bob, PHYS_Located, Chicago)
   * would have mention_id_1 point to Bob.
   */
  public int mention_id_1; // optional
  /**
   * Zero-based index into the sentences array for this TaggerID
   */
  public int sentence_id_2; // optional
  /**
   * Index into the mentions in the document. This identifies the
   * origin of the relation.  For example, the relation
   *    (Bob, PHYS_Located, Chicago)
   * would have mention_id_2 point to Chicago.
   */
  public int mention_id_2; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * The type of the relation, see documentation for RelationType
     * 
     * 
     * @see RelationType
     */
    RELATION_TYPE((short)1, "relation_type"),
    /**
     * Zero-based index into the sentences array for this TaggerID
     */
    SENTENCE_ID_1((short)2, "sentence_id_1"),
    /**
     * Index into the mentions in the document.  This identifies the
     * origin of the relation.  For example, the relation
     *    (Bob, PHYS_Located, Chicago)
     * would have mention_id_1 point to Bob.
     */
    MENTION_ID_1((short)3, "mention_id_1"),
    /**
     * Zero-based index into the sentences array for this TaggerID
     */
    SENTENCE_ID_2((short)4, "sentence_id_2"),
    /**
     * Index into the mentions in the document. This identifies the
     * origin of the relation.  For example, the relation
     *    (Bob, PHYS_Located, Chicago)
     * would have mention_id_2 point to Chicago.
     */
    MENTION_ID_2((short)5, "mention_id_2");

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
        case 1: // RELATION_TYPE
          return RELATION_TYPE;
        case 2: // SENTENCE_ID_1
          return SENTENCE_ID_1;
        case 3: // MENTION_ID_1
          return MENTION_ID_1;
        case 4: // SENTENCE_ID_2
          return SENTENCE_ID_2;
        case 5: // MENTION_ID_2
          return MENTION_ID_2;
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
  private static final int __SENTENCE_ID_1_ISSET_ID = 0;
  private static final int __MENTION_ID_1_ISSET_ID = 1;
  private static final int __SENTENCE_ID_2_ISSET_ID = 2;
  private static final int __MENTION_ID_2_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.RELATION_TYPE,_Fields.SENTENCE_ID_1,_Fields.MENTION_ID_1,_Fields.SENTENCE_ID_2,_Fields.MENTION_ID_2};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RELATION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("relation_type", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, RelationType.class)));
    tmpMap.put(_Fields.SENTENCE_ID_1, new org.apache.thrift.meta_data.FieldMetaData("sentence_id_1", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MENTION_ID_1, new org.apache.thrift.meta_data.FieldMetaData("mention_id_1", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "MentionID")));
    tmpMap.put(_Fields.SENTENCE_ID_2, new org.apache.thrift.meta_data.FieldMetaData("sentence_id_2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MENTION_ID_2, new org.apache.thrift.meta_data.FieldMetaData("mention_id_2", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "MentionID")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Relation.class, metaDataMap);
  }

  public Relation() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Relation(Relation other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRelation_type()) {
      this.relation_type = other.relation_type;
    }
    this.sentence_id_1 = other.sentence_id_1;
    this.mention_id_1 = other.mention_id_1;
    this.sentence_id_2 = other.sentence_id_2;
    this.mention_id_2 = other.mention_id_2;
  }

  public Relation deepCopy() {
    return new Relation(this);
  }

  @Override
  public void clear() {
    this.relation_type = null;
    setSentence_id_1IsSet(false);
    this.sentence_id_1 = 0;
    setMention_id_1IsSet(false);
    this.mention_id_1 = 0;
    setSentence_id_2IsSet(false);
    this.sentence_id_2 = 0;
    setMention_id_2IsSet(false);
    this.mention_id_2 = 0;
  }

  /**
   * The type of the relation, see documentation for RelationType
   * 
   * 
   * @see RelationType
   */
  public RelationType getRelation_type() {
    return this.relation_type;
  }

  /**
   * The type of the relation, see documentation for RelationType
   * 
   * 
   * @see RelationType
   */
  public Relation setRelation_type(RelationType relation_type) {
    this.relation_type = relation_type;
    return this;
  }

  public void unsetRelation_type() {
    this.relation_type = null;
  }

  /** Returns true if field relation_type is set (has been assigned a value) and false otherwise */
  public boolean isSetRelation_type() {
    return this.relation_type != null;
  }

  public void setRelation_typeIsSet(boolean value) {
    if (!value) {
      this.relation_type = null;
    }
  }

  /**
   * Zero-based index into the sentences array for this TaggerID
   */
  public int getSentence_id_1() {
    return this.sentence_id_1;
  }

  /**
   * Zero-based index into the sentences array for this TaggerID
   */
  public Relation setSentence_id_1(int sentence_id_1) {
    this.sentence_id_1 = sentence_id_1;
    setSentence_id_1IsSet(true);
    return this;
  }

  public void unsetSentence_id_1() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SENTENCE_ID_1_ISSET_ID);
  }

  /** Returns true if field sentence_id_1 is set (has been assigned a value) and false otherwise */
  public boolean isSetSentence_id_1() {
    return EncodingUtils.testBit(__isset_bitfield, __SENTENCE_ID_1_ISSET_ID);
  }

  public void setSentence_id_1IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SENTENCE_ID_1_ISSET_ID, value);
  }

  /**
   * Index into the mentions in the document.  This identifies the
   * origin of the relation.  For example, the relation
   *    (Bob, PHYS_Located, Chicago)
   * would have mention_id_1 point to Bob.
   */
  public int getMention_id_1() {
    return this.mention_id_1;
  }

  /**
   * Index into the mentions in the document.  This identifies the
   * origin of the relation.  For example, the relation
   *    (Bob, PHYS_Located, Chicago)
   * would have mention_id_1 point to Bob.
   */
  public Relation setMention_id_1(int mention_id_1) {
    this.mention_id_1 = mention_id_1;
    setMention_id_1IsSet(true);
    return this;
  }

  public void unsetMention_id_1() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MENTION_ID_1_ISSET_ID);
  }

  /** Returns true if field mention_id_1 is set (has been assigned a value) and false otherwise */
  public boolean isSetMention_id_1() {
    return EncodingUtils.testBit(__isset_bitfield, __MENTION_ID_1_ISSET_ID);
  }

  public void setMention_id_1IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MENTION_ID_1_ISSET_ID, value);
  }

  /**
   * Zero-based index into the sentences array for this TaggerID
   */
  public int getSentence_id_2() {
    return this.sentence_id_2;
  }

  /**
   * Zero-based index into the sentences array for this TaggerID
   */
  public Relation setSentence_id_2(int sentence_id_2) {
    this.sentence_id_2 = sentence_id_2;
    setSentence_id_2IsSet(true);
    return this;
  }

  public void unsetSentence_id_2() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SENTENCE_ID_2_ISSET_ID);
  }

  /** Returns true if field sentence_id_2 is set (has been assigned a value) and false otherwise */
  public boolean isSetSentence_id_2() {
    return EncodingUtils.testBit(__isset_bitfield, __SENTENCE_ID_2_ISSET_ID);
  }

  public void setSentence_id_2IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SENTENCE_ID_2_ISSET_ID, value);
  }

  /**
   * Index into the mentions in the document. This identifies the
   * origin of the relation.  For example, the relation
   *    (Bob, PHYS_Located, Chicago)
   * would have mention_id_2 point to Chicago.
   */
  public int getMention_id_2() {
    return this.mention_id_2;
  }

  /**
   * Index into the mentions in the document. This identifies the
   * origin of the relation.  For example, the relation
   *    (Bob, PHYS_Located, Chicago)
   * would have mention_id_2 point to Chicago.
   */
  public Relation setMention_id_2(int mention_id_2) {
    this.mention_id_2 = mention_id_2;
    setMention_id_2IsSet(true);
    return this;
  }

  public void unsetMention_id_2() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MENTION_ID_2_ISSET_ID);
  }

  /** Returns true if field mention_id_2 is set (has been assigned a value) and false otherwise */
  public boolean isSetMention_id_2() {
    return EncodingUtils.testBit(__isset_bitfield, __MENTION_ID_2_ISSET_ID);
  }

  public void setMention_id_2IsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MENTION_ID_2_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RELATION_TYPE:
      if (value == null) {
        unsetRelation_type();
      } else {
        setRelation_type((RelationType)value);
      }
      break;

    case SENTENCE_ID_1:
      if (value == null) {
        unsetSentence_id_1();
      } else {
        setSentence_id_1((Integer)value);
      }
      break;

    case MENTION_ID_1:
      if (value == null) {
        unsetMention_id_1();
      } else {
        setMention_id_1((Integer)value);
      }
      break;

    case SENTENCE_ID_2:
      if (value == null) {
        unsetSentence_id_2();
      } else {
        setSentence_id_2((Integer)value);
      }
      break;

    case MENTION_ID_2:
      if (value == null) {
        unsetMention_id_2();
      } else {
        setMention_id_2((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RELATION_TYPE:
      return getRelation_type();

    case SENTENCE_ID_1:
      return Integer.valueOf(getSentence_id_1());

    case MENTION_ID_1:
      return Integer.valueOf(getMention_id_1());

    case SENTENCE_ID_2:
      return Integer.valueOf(getSentence_id_2());

    case MENTION_ID_2:
      return Integer.valueOf(getMention_id_2());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RELATION_TYPE:
      return isSetRelation_type();
    case SENTENCE_ID_1:
      return isSetSentence_id_1();
    case MENTION_ID_1:
      return isSetMention_id_1();
    case SENTENCE_ID_2:
      return isSetSentence_id_2();
    case MENTION_ID_2:
      return isSetMention_id_2();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Relation)
      return this.equals((Relation)that);
    return false;
  }

  public boolean equals(Relation that) {
    if (that == null)
      return false;

    boolean this_present_relation_type = true && this.isSetRelation_type();
    boolean that_present_relation_type = true && that.isSetRelation_type();
    if (this_present_relation_type || that_present_relation_type) {
      if (!(this_present_relation_type && that_present_relation_type))
        return false;
      if (!this.relation_type.equals(that.relation_type))
        return false;
    }

    boolean this_present_sentence_id_1 = true && this.isSetSentence_id_1();
    boolean that_present_sentence_id_1 = true && that.isSetSentence_id_1();
    if (this_present_sentence_id_1 || that_present_sentence_id_1) {
      if (!(this_present_sentence_id_1 && that_present_sentence_id_1))
        return false;
      if (this.sentence_id_1 != that.sentence_id_1)
        return false;
    }

    boolean this_present_mention_id_1 = true && this.isSetMention_id_1();
    boolean that_present_mention_id_1 = true && that.isSetMention_id_1();
    if (this_present_mention_id_1 || that_present_mention_id_1) {
      if (!(this_present_mention_id_1 && that_present_mention_id_1))
        return false;
      if (this.mention_id_1 != that.mention_id_1)
        return false;
    }

    boolean this_present_sentence_id_2 = true && this.isSetSentence_id_2();
    boolean that_present_sentence_id_2 = true && that.isSetSentence_id_2();
    if (this_present_sentence_id_2 || that_present_sentence_id_2) {
      if (!(this_present_sentence_id_2 && that_present_sentence_id_2))
        return false;
      if (this.sentence_id_2 != that.sentence_id_2)
        return false;
    }

    boolean this_present_mention_id_2 = true && this.isSetMention_id_2();
    boolean that_present_mention_id_2 = true && that.isSetMention_id_2();
    if (this_present_mention_id_2 || that_present_mention_id_2) {
      if (!(this_present_mention_id_2 && that_present_mention_id_2))
        return false;
      if (this.mention_id_2 != that.mention_id_2)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Relation other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Relation typedOther = (Relation)other;

    lastComparison = Boolean.valueOf(isSetRelation_type()).compareTo(typedOther.isSetRelation_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelation_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.relation_type, typedOther.relation_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSentence_id_1()).compareTo(typedOther.isSetSentence_id_1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSentence_id_1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sentence_id_1, typedOther.sentence_id_1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMention_id_1()).compareTo(typedOther.isSetMention_id_1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMention_id_1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mention_id_1, typedOther.mention_id_1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSentence_id_2()).compareTo(typedOther.isSetSentence_id_2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSentence_id_2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sentence_id_2, typedOther.sentence_id_2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMention_id_2()).compareTo(typedOther.isSetMention_id_2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMention_id_2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mention_id_2, typedOther.mention_id_2);
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
    StringBuilder sb = new StringBuilder("Relation(");
    boolean first = true;

    if (isSetRelation_type()) {
      sb.append("relation_type:");
      if (this.relation_type == null) {
        sb.append("null");
      } else {
        sb.append(this.relation_type);
      }
      first = false;
    }
    if (isSetSentence_id_1()) {
      if (!first) sb.append(", ");
      sb.append("sentence_id_1:");
      sb.append(this.sentence_id_1);
      first = false;
    }
    if (isSetMention_id_1()) {
      if (!first) sb.append(", ");
      sb.append("mention_id_1:");
      sb.append(this.mention_id_1);
      first = false;
    }
    if (isSetSentence_id_2()) {
      if (!first) sb.append(", ");
      sb.append("sentence_id_2:");
      sb.append(this.sentence_id_2);
      first = false;
    }
    if (isSetMention_id_2()) {
      if (!first) sb.append(", ");
      sb.append("mention_id_2:");
      sb.append(this.mention_id_2);
      first = false;
    }
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

  private static class RelationStandardSchemeFactory implements SchemeFactory {
    public RelationStandardScheme getScheme() {
      return new RelationStandardScheme();
    }
  }

  private static class RelationStandardScheme extends StandardScheme<Relation> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Relation struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RELATION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.relation_type = RelationType.findByValue(iprot.readI32());
              struct.setRelation_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SENTENCE_ID_1
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sentence_id_1 = iprot.readI32();
              struct.setSentence_id_1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MENTION_ID_1
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mention_id_1 = iprot.readI32();
              struct.setMention_id_1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SENTENCE_ID_2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sentence_id_2 = iprot.readI32();
              struct.setSentence_id_2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MENTION_ID_2
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.mention_id_2 = iprot.readI32();
              struct.setMention_id_2IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Relation struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.relation_type != null) {
        if (struct.isSetRelation_type()) {
          oprot.writeFieldBegin(RELATION_TYPE_FIELD_DESC);
          oprot.writeI32(struct.relation_type.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSentence_id_1()) {
        oprot.writeFieldBegin(SENTENCE_ID_1_FIELD_DESC);
        oprot.writeI32(struct.sentence_id_1);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMention_id_1()) {
        oprot.writeFieldBegin(MENTION_ID_1_FIELD_DESC);
        oprot.writeI32(struct.mention_id_1);
        oprot.writeFieldEnd();
      }
      if (struct.isSetSentence_id_2()) {
        oprot.writeFieldBegin(SENTENCE_ID_2_FIELD_DESC);
        oprot.writeI32(struct.sentence_id_2);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMention_id_2()) {
        oprot.writeFieldBegin(MENTION_ID_2_FIELD_DESC);
        oprot.writeI32(struct.mention_id_2);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RelationTupleSchemeFactory implements SchemeFactory {
    public RelationTupleScheme getScheme() {
      return new RelationTupleScheme();
    }
  }

  private static class RelationTupleScheme extends TupleScheme<Relation> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Relation struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRelation_type()) {
        optionals.set(0);
      }
      if (struct.isSetSentence_id_1()) {
        optionals.set(1);
      }
      if (struct.isSetMention_id_1()) {
        optionals.set(2);
      }
      if (struct.isSetSentence_id_2()) {
        optionals.set(3);
      }
      if (struct.isSetMention_id_2()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetRelation_type()) {
        oprot.writeI32(struct.relation_type.getValue());
      }
      if (struct.isSetSentence_id_1()) {
        oprot.writeI32(struct.sentence_id_1);
      }
      if (struct.isSetMention_id_1()) {
        oprot.writeI32(struct.mention_id_1);
      }
      if (struct.isSetSentence_id_2()) {
        oprot.writeI32(struct.sentence_id_2);
      }
      if (struct.isSetMention_id_2()) {
        oprot.writeI32(struct.mention_id_2);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Relation struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.relation_type = RelationType.findByValue(iprot.readI32());
        struct.setRelation_typeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sentence_id_1 = iprot.readI32();
        struct.setSentence_id_1IsSet(true);
      }
      if (incoming.get(2)) {
        struct.mention_id_1 = iprot.readI32();
        struct.setMention_id_1IsSet(true);
      }
      if (incoming.get(3)) {
        struct.sentence_id_2 = iprot.readI32();
        struct.setSentence_id_2IsSet(true);
      }
      if (incoming.get(4)) {
        struct.mention_id_2 = iprot.readI32();
        struct.setMention_id_2IsSet(true);
      }
    }
  }

}

