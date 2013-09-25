/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package streamcorpus;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum AttributeType implements org.apache.thrift.TEnum {
  PER_AGE(0),
  PER_GENDER(1);

  private final int value;

  private AttributeType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static AttributeType findByValue(int value) { 
    switch (value) {
      case 0:
        return PER_AGE;
      case 1:
        return PER_GENDER;
      default:
        return null;
    }
  }
}