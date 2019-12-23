// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Message.proto

package com.example.demo.protobuf;

public final class PbMessage {
  private PbMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MyMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MyMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <code>string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <code>string senderId = 2;</code>
     */
    java.lang.String getSenderId();
    /**
     * <code>string senderId = 2;</code>
     */
    com.google.protobuf.ByteString
        getSenderIdBytes();

    /**
     * <code>string receiverId = 3;</code>
     */
    java.lang.String getReceiverId();
    /**
     * <code>string receiverId = 3;</code>
     */
    com.google.protobuf.ByteString
        getReceiverIdBytes();

    /**
     * <code>uint64 sendTime = 4;</code>
     */
    long getSendTime();

    /**
     * <code>string data = 5;</code>
     */
    java.lang.String getData();
    /**
     * <code>string data = 5;</code>
     */
    com.google.protobuf.ByteString
        getDataBytes();
  }
  /**
   * Protobuf type {@code MyMessage}
   */
  public  static final class MyMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MyMessage)
      MyMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MyMessage.newBuilder() to construct.
    private MyMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MyMessage() {
      id_ = "";
      senderId_ = "";
      receiverId_ = "";
      sendTime_ = 0L;
      data_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MyMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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

              id_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              senderId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              receiverId_ = s;
              break;
            }
            case 32: {

              sendTime_ = input.readUInt64();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              data_ = s;
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
      return com.example.demo.protobuf.PbMessage.internal_static_MyMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.demo.protobuf.PbMessage.internal_static_MyMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.demo.protobuf.PbMessage.MyMessage.class, com.example.demo.protobuf.PbMessage.MyMessage.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <code>string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      }
    }
    /**
     * <code>string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDERID_FIELD_NUMBER = 2;
    private volatile java.lang.Object senderId_;
    /**
     * <code>string senderId = 2;</code>
     */
    public java.lang.String getSenderId() {
      java.lang.Object ref = senderId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senderId_ = s;
        return s;
      }
    }
    /**
     * <code>string senderId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSenderIdBytes() {
      java.lang.Object ref = senderId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECEIVERID_FIELD_NUMBER = 3;
    private volatile java.lang.Object receiverId_;
    /**
     * <code>string receiverId = 3;</code>
     */
    public java.lang.String getReceiverId() {
      java.lang.Object ref = receiverId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        receiverId_ = s;
        return s;
      }
    }
    /**
     * <code>string receiverId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getReceiverIdBytes() {
      java.lang.Object ref = receiverId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        receiverId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENDTIME_FIELD_NUMBER = 4;
    private long sendTime_;
    /**
     * <code>uint64 sendTime = 4;</code>
     */
    public long getSendTime() {
      return sendTime_;
    }

    public static final int DATA_FIELD_NUMBER = 5;
    private volatile java.lang.Object data_;
    /**
     * <code>string data = 5;</code>
     */
    public java.lang.String getData() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        data_ = s;
        return s;
      }
    }
    /**
     * <code>string data = 5;</code>
     */
    public com.google.protobuf.ByteString
        getDataBytes() {
      java.lang.Object ref = data_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        data_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!getIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      if (!getSenderIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, senderId_);
      }
      if (!getReceiverIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, receiverId_);
      }
      if (sendTime_ != 0L) {
        output.writeUInt64(4, sendTime_);
      }
      if (!getDataBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, data_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
      }
      if (!getSenderIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, senderId_);
      }
      if (!getReceiverIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, receiverId_);
      }
      if (sendTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, sendTime_);
      }
      if (!getDataBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, data_);
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
      if (!(obj instanceof com.example.demo.protobuf.PbMessage.MyMessage)) {
        return super.equals(obj);
      }
      com.example.demo.protobuf.PbMessage.MyMessage other = (com.example.demo.protobuf.PbMessage.MyMessage) obj;

      boolean result = true;
      result = result && getId()
          .equals(other.getId());
      result = result && getSenderId()
          .equals(other.getSenderId());
      result = result && getReceiverId()
          .equals(other.getReceiverId());
      result = result && (getSendTime()
          == other.getSendTime());
      result = result && getData()
          .equals(other.getData());
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
      hash = (37 * hash) + SENDERID_FIELD_NUMBER;
      hash = (53 * hash) + getSenderId().hashCode();
      hash = (37 * hash) + RECEIVERID_FIELD_NUMBER;
      hash = (53 * hash) + getReceiverId().hashCode();
      hash = (37 * hash) + SENDTIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSendTime());
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.demo.protobuf.PbMessage.MyMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.demo.protobuf.PbMessage.MyMessage parseFrom(
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
    public static Builder newBuilder(com.example.demo.protobuf.PbMessage.MyMessage prototype) {
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
     * Protobuf type {@code MyMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MyMessage)
        com.example.demo.protobuf.PbMessage.MyMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.example.demo.protobuf.PbMessage.internal_static_MyMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.example.demo.protobuf.PbMessage.internal_static_MyMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.demo.protobuf.PbMessage.MyMessage.class, com.example.demo.protobuf.PbMessage.MyMessage.Builder.class);
      }

      // Construct using com.example.demo.protobuf.PbMessage.MyMessage.newBuilder()
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
        id_ = "";

        senderId_ = "";

        receiverId_ = "";

        sendTime_ = 0L;

        data_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.example.demo.protobuf.PbMessage.internal_static_MyMessage_descriptor;
      }

      public com.example.demo.protobuf.PbMessage.MyMessage getDefaultInstanceForType() {
        return com.example.demo.protobuf.PbMessage.MyMessage.getDefaultInstance();
      }

      public com.example.demo.protobuf.PbMessage.MyMessage build() {
        com.example.demo.protobuf.PbMessage.MyMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.example.demo.protobuf.PbMessage.MyMessage buildPartial() {
        com.example.demo.protobuf.PbMessage.MyMessage result = new com.example.demo.protobuf.PbMessage.MyMessage(this);
        result.id_ = id_;
        result.senderId_ = senderId_;
        result.receiverId_ = receiverId_;
        result.sendTime_ = sendTime_;
        result.data_ = data_;
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
        if (other instanceof com.example.demo.protobuf.PbMessage.MyMessage) {
          return mergeFrom((com.example.demo.protobuf.PbMessage.MyMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.demo.protobuf.PbMessage.MyMessage other) {
        if (other == com.example.demo.protobuf.PbMessage.MyMessage.getDefaultInstance()) return this;
        if (!other.getId().isEmpty()) {
          id_ = other.id_;
          onChanged();
        }
        if (!other.getSenderId().isEmpty()) {
          senderId_ = other.senderId_;
          onChanged();
        }
        if (!other.getReceiverId().isEmpty()) {
          receiverId_ = other.receiverId_;
          onChanged();
        }
        if (other.getSendTime() != 0L) {
          setSendTime(other.getSendTime());
        }
        if (!other.getData().isEmpty()) {
          data_ = other.data_;
          onChanged();
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
        com.example.demo.protobuf.PbMessage.MyMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.example.demo.protobuf.PbMessage.MyMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object id_ = "";
      /**
       * <code>string id = 1;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string id = 1;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string id = 1;</code>
       */
      public Builder clearId() {
        
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <code>string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        id_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object senderId_ = "";
      /**
       * <code>string senderId = 2;</code>
       */
      public java.lang.String getSenderId() {
        java.lang.Object ref = senderId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          senderId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string senderId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSenderIdBytes() {
        java.lang.Object ref = senderId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          senderId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string senderId = 2;</code>
       */
      public Builder setSenderId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        senderId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string senderId = 2;</code>
       */
      public Builder clearSenderId() {
        
        senderId_ = getDefaultInstance().getSenderId();
        onChanged();
        return this;
      }
      /**
       * <code>string senderId = 2;</code>
       */
      public Builder setSenderIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        senderId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object receiverId_ = "";
      /**
       * <code>string receiverId = 3;</code>
       */
      public java.lang.String getReceiverId() {
        java.lang.Object ref = receiverId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          receiverId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string receiverId = 3;</code>
       */
      public com.google.protobuf.ByteString
          getReceiverIdBytes() {
        java.lang.Object ref = receiverId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          receiverId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string receiverId = 3;</code>
       */
      public Builder setReceiverId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        receiverId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string receiverId = 3;</code>
       */
      public Builder clearReceiverId() {
        
        receiverId_ = getDefaultInstance().getReceiverId();
        onChanged();
        return this;
      }
      /**
       * <code>string receiverId = 3;</code>
       */
      public Builder setReceiverIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        receiverId_ = value;
        onChanged();
        return this;
      }

      private long sendTime_ ;
      /**
       * <code>uint64 sendTime = 4;</code>
       */
      public long getSendTime() {
        return sendTime_;
      }
      /**
       * <code>uint64 sendTime = 4;</code>
       */
      public Builder setSendTime(long value) {
        
        sendTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 sendTime = 4;</code>
       */
      public Builder clearSendTime() {
        
        sendTime_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object data_ = "";
      /**
       * <code>string data = 5;</code>
       */
      public java.lang.String getData() {
        java.lang.Object ref = data_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          data_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string data = 5;</code>
       */
      public com.google.protobuf.ByteString
          getDataBytes() {
        java.lang.Object ref = data_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          data_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string data = 5;</code>
       */
      public Builder setData(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string data = 5;</code>
       */
      public Builder clearData() {
        
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }
      /**
       * <code>string data = 5;</code>
       */
      public Builder setDataBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        data_ = value;
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


      // @@protoc_insertion_point(builder_scope:MyMessage)
    }

    // @@protoc_insertion_point(class_scope:MyMessage)
    private static final com.example.demo.protobuf.PbMessage.MyMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.demo.protobuf.PbMessage.MyMessage();
    }

    public static com.example.demo.protobuf.PbMessage.MyMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MyMessage>
        PARSER = new com.google.protobuf.AbstractParser<MyMessage>() {
      public MyMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MyMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MyMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MyMessage> getParserForType() {
      return PARSER;
    }

    public com.example.demo.protobuf.PbMessage.MyMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MyMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MyMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rMessage.proto\"]\n\tMyMessage\022\n\n\002id\030\001 \001(\t" +
      "\022\020\n\010senderId\030\002 \001(\t\022\022\n\nreceiverId\030\003 \001(\t\022\020" +
      "\n\010sendTime\030\004 \001(\004\022\014\n\004data\030\005 \001(\tB(\n\031com.ex" +
      "ample.demo.protobufB\tPbMessageH\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_MyMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MyMessage_descriptor,
        new java.lang.String[] { "Id", "SenderId", "ReceiverId", "SendTime", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
