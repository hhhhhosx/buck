/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum FrontendRequestType implements org.apache.thrift.TEnum {
  UNKNOWN(0),
  START_BUILD(1),
  BUILD_STATUS(2),
  LOG(5),
  CAS_CONTAINS(6),
  CREATE_BUILD(7),
  STORE_LOCAL_CHANGES(8),
  FETCH_SRC_FILES(9),
  STORE_BUILD_GRAPH(10),
  FETCH_BUILD_GRAPH(11),
  SET_BUCK_VERSION(12),
  ANNOUNCEMENT(13),
  SET_DOTFILE_PATHS(14),
  GET_BUILD_SLAVE_LOG_DIR(15),
  GET_BUILD_SLAVE_REAL_TIME_LOGS(16),
  UPDATE_BUILD_SLAVE_STATUS(17),
  FETCH_BUILD_SLAVE_STATUS(18);

  private final int value;

  private FrontendRequestType(int value) {
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
  public static FrontendRequestType findByValue(int value) { 
    switch (value) {
      case 0:
        return UNKNOWN;
      case 1:
        return START_BUILD;
      case 2:
        return BUILD_STATUS;
      case 5:
        return LOG;
      case 6:
        return CAS_CONTAINS;
      case 7:
        return CREATE_BUILD;
      case 8:
        return STORE_LOCAL_CHANGES;
      case 9:
        return FETCH_SRC_FILES;
      case 10:
        return STORE_BUILD_GRAPH;
      case 11:
        return FETCH_BUILD_GRAPH;
      case 12:
        return SET_BUCK_VERSION;
      case 13:
        return ANNOUNCEMENT;
      case 14:
        return SET_DOTFILE_PATHS;
      case 15:
        return GET_BUILD_SLAVE_LOG_DIR;
      case 16:
        return GET_BUILD_SLAVE_REAL_TIME_LOGS;
      case 17:
        return UPDATE_BUILD_SLAVE_STATUS;
      case 18:
        return FETCH_BUILD_SLAVE_STATUS;
      default:
        return null;
    }
  }
}
