// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: deeplearning.proto

package com.samsung.sds.brightics.common.network.proto.deeplearning;

/**
 * Protobuf type {@code com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage}
 */
public  final class ResultDLMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage)
    ResultDLMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultDLMessage.newBuilder() to construct.
  private ResultDLMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultDLMessage() {
    messageStatus_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResultDLMessage(
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
          case 8: {
            int rawValue = input.readEnum();

            messageStatus_ = rawValue;
            break;
          }
          case 18: {
            com.google.protobuf.Any.Builder subBuilder = null;
            if (result_ != null) {
              subBuilder = result_.toBuilder();
            }
            result_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(result_);
              result_ = subBuilder.buildPartial();
            }

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
    return com.samsung.sds.brightics.common.network.proto.deeplearning.DeeplearningProto.internal_static_com_samsung_sds_brightics_common_network_proto_deeplearning_ResultDLMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.samsung.sds.brightics.common.network.proto.deeplearning.DeeplearningProto.internal_static_com_samsung_sds_brightics_common_network_proto_deeplearning_ResultDLMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage.class, com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage.Builder.class);
  }

  public static final int MESSAGESTATUS_FIELD_NUMBER = 1;
  private int messageStatus_;
  /**
   * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 1;</code>
   */
  public int getMessageStatusValue() {
    return messageStatus_;
  }
  /**
   * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 1;</code>
   */
  public com.samsung.sds.brightics.common.network.proto.MessageStatus getMessageStatus() {
    com.samsung.sds.brightics.common.network.proto.MessageStatus result = com.samsung.sds.brightics.common.network.proto.MessageStatus.valueOf(messageStatus_);
    return result == null ? com.samsung.sds.brightics.common.network.proto.MessageStatus.UNRECOGNIZED : result;
  }

  public static final int RESULT_FIELD_NUMBER = 2;
  private com.google.protobuf.Any result_;
  /**
   * <code>.google.protobuf.Any result = 2;</code>
   */
  public boolean hasResult() {
    return result_ != null;
  }
  /**
   * <code>.google.protobuf.Any result = 2;</code>
   */
  public com.google.protobuf.Any getResult() {
    return result_ == null ? com.google.protobuf.Any.getDefaultInstance() : result_;
  }
  /**
   * <code>.google.protobuf.Any result = 2;</code>
   */
  public com.google.protobuf.AnyOrBuilder getResultOrBuilder() {
    return getResult();
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
    if (messageStatus_ != com.samsung.sds.brightics.common.network.proto.MessageStatus.SUCCESS.getNumber()) {
      output.writeEnum(1, messageStatus_);
    }
    if (result_ != null) {
      output.writeMessage(2, getResult());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageStatus_ != com.samsung.sds.brightics.common.network.proto.MessageStatus.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, messageStatus_);
    }
    if (result_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResult());
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
    if (!(obj instanceof com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage)) {
      return super.equals(obj);
    }
    com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage other = (com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage) obj;

    boolean result = true;
    result = result && messageStatus_ == other.messageStatus_;
    result = result && (hasResult() == other.hasResult());
    if (hasResult()) {
      result = result && getResult()
          .equals(other.getResult());
    }
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
    hash = (37 * hash) + MESSAGESTATUS_FIELD_NUMBER;
    hash = (53 * hash) + messageStatus_;
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parseFrom(
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
  public static Builder newBuilder(com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage prototype) {
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
   * Protobuf type {@code com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage)
      com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.samsung.sds.brightics.common.network.proto.deeplearning.DeeplearningProto.internal_static_com_samsung_sds_brightics_common_network_proto_deeplearning_ResultDLMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.samsung.sds.brightics.common.network.proto.deeplearning.DeeplearningProto.internal_static_com_samsung_sds_brightics_common_network_proto_deeplearning_ResultDLMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage.class, com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage.Builder.class);
    }

    // Construct using com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage.newBuilder()
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
      messageStatus_ = 0;

      if (resultBuilder_ == null) {
        result_ = null;
      } else {
        result_ = null;
        resultBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.samsung.sds.brightics.common.network.proto.deeplearning.DeeplearningProto.internal_static_com_samsung_sds_brightics_common_network_proto_deeplearning_ResultDLMessage_descriptor;
    }

    public com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage getDefaultInstanceForType() {
      return com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage.getDefaultInstance();
    }

    public com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage build() {
      com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage buildPartial() {
      com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage result = new com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage(this);
      result.messageStatus_ = messageStatus_;
      if (resultBuilder_ == null) {
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
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
      if (other instanceof com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage) {
        return mergeFrom((com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage other) {
      if (other == com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage.getDefaultInstance()) return this;
      if (other.messageStatus_ != 0) {
        setMessageStatusValue(other.getMessageStatusValue());
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
      com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int messageStatus_ = 0;
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 1;</code>
     */
    public int getMessageStatusValue() {
      return messageStatus_;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 1;</code>
     */
    public Builder setMessageStatusValue(int value) {
      messageStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 1;</code>
     */
    public com.samsung.sds.brightics.common.network.proto.MessageStatus getMessageStatus() {
      com.samsung.sds.brightics.common.network.proto.MessageStatus result = com.samsung.sds.brightics.common.network.proto.MessageStatus.valueOf(messageStatus_);
      return result == null ? com.samsung.sds.brightics.common.network.proto.MessageStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 1;</code>
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
     * <code>.com.samsung.sds.brightics.common.network.proto.MessageStatus messageStatus = 1;</code>
     */
    public Builder clearMessageStatus() {
      
      messageStatus_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any result_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> resultBuilder_;
    /**
     * <code>.google.protobuf.Any result = 2;</code>
     */
    public boolean hasResult() {
      return resultBuilder_ != null || result_ != null;
    }
    /**
     * <code>.google.protobuf.Any result = 2;</code>
     */
    public com.google.protobuf.Any getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.google.protobuf.Any.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any result = 2;</code>
     */
    public Builder setResult(com.google.protobuf.Any value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        resultBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any result = 2;</code>
     */
    public Builder setResult(
        com.google.protobuf.Any.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any result = 2;</code>
     */
    public Builder mergeResult(com.google.protobuf.Any value) {
      if (resultBuilder_ == null) {
        if (result_ != null) {
          result_ =
            com.google.protobuf.Any.newBuilder(result_).mergeFrom(value).buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        resultBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any result = 2;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = null;
        onChanged();
      } else {
        result_ = null;
        resultBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Any result = 2;</code>
     */
    public com.google.protobuf.Any.Builder getResultBuilder() {
      
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any result = 2;</code>
     */
    public com.google.protobuf.AnyOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : result_;
      }
    }
    /**
     * <code>.google.protobuf.Any result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage)
  }

  // @@protoc_insertion_point(class_scope:com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage)
  private static final com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage();
  }

  public static com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultDLMessage>
      PARSER = new com.google.protobuf.AbstractParser<ResultDLMessage>() {
    public ResultDLMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResultDLMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResultDLMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResultDLMessage> getParserForType() {
    return PARSER;
  }

  public com.samsung.sds.brightics.common.network.proto.deeplearning.ResultDLMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

