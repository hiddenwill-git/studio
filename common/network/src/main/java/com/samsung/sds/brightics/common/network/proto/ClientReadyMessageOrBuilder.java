// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.samsung.sds.brightics.common.network.proto;

public interface ClientReadyMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.samsung.sds.brightics.common.network.proto.ClientReadyMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string clientId = 1;</code>
   */
  java.lang.String getClientId();
  /**
   * <code>string clientId = 1;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>string clientHost = 2;</code>
   */
  java.lang.String getClientHost();
  /**
   * <code>string clientHost = 2;</code>
   */
  com.google.protobuf.ByteString
      getClientHostBytes();

  /**
   * <code>int32 clientPort = 3;</code>
   */
  int getClientPort();

  /**
   * <code>string core = 4;</code>
   */
  java.lang.String getCore();
  /**
   * <code>string core = 4;</code>
   */
  com.google.protobuf.ByteString
      getCoreBytes();

  /**
   * <code>string memory = 5;</code>
   */
  java.lang.String getMemory();
  /**
   * <code>string memory = 5;</code>
   */
  com.google.protobuf.ByteString
      getMemoryBytes();

  /**
   * <code>.com.samsung.sds.brightics.common.network.proto.ClientReadyMessage.ClientType clientType = 6;</code>
   */
  int getClientTypeValue();
  /**
   * <code>.com.samsung.sds.brightics.common.network.proto.ClientReadyMessage.ClientType clientType = 6;</code>
   */
  com.samsung.sds.brightics.common.network.proto.ClientReadyMessage.ClientType getClientType();
}
