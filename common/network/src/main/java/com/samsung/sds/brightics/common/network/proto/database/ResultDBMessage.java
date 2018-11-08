// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: database.proto

package com.samsung.sds.brightics.common.network.proto.database;

/**
 * Protobuf type {@code com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage}
 */
public  final class ResultDBMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage)
    ResultDBMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultDBMessage.newBuilder() to construct.
  private ResultDBMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultDBMessage() {
    result_ = "";
    message_ = "";
    detailMessage_ = "";
    messageStatus_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResultDBMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            result_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            detailMessage_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            messageStatus_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.samsung.sds.brightics.common.network.proto.database.DataBaseProto.internal_static_com_samsung_sds_brightics_common_network_proto_database_ResultDBMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.samsung.sds.brightics.common.network.proto.database.DataBaseProto.internal_static_com_samsung_sds_brightics_common_network_proto_database_ResultDBMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage.class, com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 1;
  private volatile java.lang.Object result_;
  /**
   * <code>string result = 1;</code>
   */
  public java.lang.String getResult() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      result_ = s;
      return s;
    }
  }
  /**
   * <code>string result = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResultBytes() {
    java.lang.Object ref = result_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      result_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DETAILMESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object detailMessage_;
  /**
   * <code>string detailMessage = 3;</code>
   */
  public java.lang.String getDetailMessage() {
    java.lang.Object ref = detailMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      detailMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string detailMessage = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDetailMessageBytes() {
    java.lang.Object ref = detailMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      detailMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGESTATUS_FIELD_NUMBER = 4;
  private int messageStatus_;
  /**
   * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 4;</code>
   */
  public int getMessageStatusValue() {
    return messageStatus_;
  }
  /**
   * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 4;</code>
   */
  public com.samsung.sds.brightics.common.network.proto.MessageStatus getMessageStatus() {
    com.samsung.sds.brightics.common.network.proto.MessageStatus result = com.samsung.sds.brightics.common.network.proto.MessageStatus.valueOf(messageStatus_);
    return result == null ? com.samsung.sds.brightics.common.network.proto.MessageStatus.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getResultBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, result_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (!getDetailMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, detailMessage_);
    }
    if (messageStatus_ != com.samsung.sds.brightics.common.network.proto.MessageStatus.SUCCESS.getNumber()) {
      output.writeEnum(4, messageStatus_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResultBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, result_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (!getDetailMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, detailMessage_);
    }
    if (messageStatus_ != com.samsung.sds.brightics.common.network.proto.MessageStatus.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, messageStatus_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage)) {
      return super.equals(obj);
    }
    com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage other = (com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage) obj;

    boolean result = true;
    result = result && getResult()
        .equals(other.getResult());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && getDetailMessage()
        .equals(other.getDetailMessage());
    result = result && messageStatus_ == other.messageStatus_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RESULT_FIELD_NUMBER;
    hash = (53 * hash) + getResult().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + DETAILMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getDetailMessage().hashCode();
    hash = (37 * hash) + MESSAGESTATUS_FIELD_NUMBER;
    hash = (53 * hash) + messageStatus_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage)
      com.samsung.sds.brightics.common.network.proto.database.ResultDBMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.samsung.sds.brightics.common.network.proto.database.DataBaseProto.internal_static_com_samsung_sds_brightics_common_network_proto_database_ResultDBMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.samsung.sds.brightics.common.network.proto.database.DataBaseProto.internal_static_com_samsung_sds_brightics_common_network_proto_database_ResultDBMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage.class, com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage.Builder.class);
    }

    // Construct using com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      result_ = "";

      message_ = "";

      detailMessage_ = "";

      messageStatus_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.samsung.sds.brightics.common.network.proto.database.DataBaseProto.internal_static_com_samsung_sds_brightics_common_network_proto_database_ResultDBMessage_descriptor;
    }

    public com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage getDefaultInstanceForType() {
      return com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage.getDefaultInstance();
    }

    public com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage build() {
      com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage buildPartial() {
      com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage result = new com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage(this);
      result.result_ = result_;
      result.message_ = message_;
      result.detailMessage_ = detailMessage_;
      result.messageStatus_ = messageStatus_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage) {
        return mergeFrom((com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage other) {
      if (other == com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage.getDefaultInstance()) return this;
      if (!other.getResult().isEmpty()) {
        result_ = other.result_;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getDetailMessage().isEmpty()) {
        detailMessage_ = other.detailMessage_;
        onChanged();
      }
      if (other.messageStatus_ != 0) {
        setMessageStatusValue(other.getMessageStatusValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object result_ = "";
    /**
     * <code>string result = 1;</code>
     */
    public java.lang.String getResult() {
      java.lang.Object ref = result_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        result_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string result = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResultBytes() {
      java.lang.Object ref = result_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        result_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string result = 1;</code>
     */
    public Builder setResult(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      result_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string result = 1;</code>
     */
    public Builder clearResult() {
      
      result_ = getDefaultInstance().getResult();
      onChanged();
      return this;
    }
    /**
     * <code>string result = 1;</code>
     */
    public Builder setResultBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      result_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object detailMessage_ = "";
    /**
     * <code>string detailMessage = 3;</code>
     */
    public java.lang.String getDetailMessage() {
      java.lang.Object ref = detailMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        detailMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string detailMessage = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDetailMessageBytes() {
      java.lang.Object ref = detailMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        detailMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string detailMessage = 3;</code>
     */
    public Builder setDetailMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      detailMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string detailMessage = 3;</code>
     */
    public Builder clearDetailMessage() {
      
      detailMessage_ = getDefaultInstance().getDetailMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string detailMessage = 3;</code>
     */
    public Builder setDetailMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      detailMessage_ = value;
      onChanged();
      return this;
    }

    private int messageStatus_ = 0;
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 4;</code>
     */
    public int getMessageStatusValue() {
      return messageStatus_;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 4;</code>
     */
    public Builder setMessageStatusValue(int value) {
      messageStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 4;</code>
     */
    public com.samsung.sds.brightics.common.network.proto.MessageStatus getMessageStatus() {
      com.samsung.sds.brightics.common.network.proto.MessageStatus result = com.samsung.sds.brightics.common.network.proto.MessageStatus.valueOf(messageStatus_);
      return result == null ? com.samsung.sds.brightics.common.network.proto.MessageStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 4;</code>
     */
    public Builder setMessageStatus(com.samsung.sds.brightics.common.network.proto.MessageStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      messageStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 4;</code>
     */
    public Builder clearMessageStatus() {
      
      messageStatus_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage)
  }

  // @@protoc_insertion_point(class_scope:com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage)
  private static final com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage();
  }

  public static com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultDBMessage>
      PARSER = new com.google.protobuf.AbstractParser<ResultDBMessage>() {
    public ResultDBMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResultDBMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResultDBMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResultDBMessage> getParserForType() {
    return PARSER;
  }

  public com.samsung.sds.brightics.common.network.proto.database.ResultDBMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

