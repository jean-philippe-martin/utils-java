// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/references.proto

package com.google.genomics.v1;

/**
 * Protobuf type {@code google.genomics.v1.SearchReferenceSetsResponse}
 */
public  final class SearchReferenceSetsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.genomics.v1.SearchReferenceSetsResponse)
    SearchReferenceSetsResponseOrBuilder {
  // Use SearchReferenceSetsResponse.newBuilder() to construct.
  private SearchReferenceSetsResponse(com.google.protobuf.GeneratedMessage.Builder builder) {
    super(builder);
  }
  private SearchReferenceSetsResponse() {
    referenceSets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SearchReferenceSetsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              referenceSets_ = new java.util.ArrayList<com.google.genomics.v1.ReferenceSet>();
              mutable_bitField0_ |= 0x00000001;
            }
            referenceSets_.add(input.readMessage(com.google.genomics.v1.ReferenceSet.PARSER, extensionRegistry));
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();

            nextPageToken_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        referenceSets_ = java.util.Collections.unmodifiableList(referenceSets_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.genomics.v1.ReferencesProto.internal_static_google_genomics_v1_SearchReferenceSetsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.genomics.v1.ReferencesProto.internal_static_google_genomics_v1_SearchReferenceSetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.genomics.v1.SearchReferenceSetsResponse.class, com.google.genomics.v1.SearchReferenceSetsResponse.Builder.class);
  }

  public static final com.google.protobuf.Parser<SearchReferenceSetsResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchReferenceSetsResponse>() {
    public SearchReferenceSetsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchReferenceSetsResponse(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public com.google.protobuf.Parser<SearchReferenceSetsResponse> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int REFERENCE_SETS_FIELD_NUMBER = 1;
  private java.util.List<com.google.genomics.v1.ReferenceSet> referenceSets_;
  /**
   * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
   *
   * <pre>
   * The matching references sets.
   * </pre>
   */
  public java.util.List<com.google.genomics.v1.ReferenceSet> getReferenceSetsList() {
    return referenceSets_;
  }
  /**
   * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
   *
   * <pre>
   * The matching references sets.
   * </pre>
   */
  public java.util.List<? extends com.google.genomics.v1.ReferenceSetOrBuilder> 
      getReferenceSetsOrBuilderList() {
    return referenceSets_;
  }
  /**
   * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
   *
   * <pre>
   * The matching references sets.
   * </pre>
   */
  public int getReferenceSetsCount() {
    return referenceSets_.size();
  }
  /**
   * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
   *
   * <pre>
   * The matching references sets.
   * </pre>
   */
  public com.google.genomics.v1.ReferenceSet getReferenceSets(int index) {
    return referenceSets_.get(index);
  }
  /**
   * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
   *
   * <pre>
   * The matching references sets.
   * </pre>
   */
  public com.google.genomics.v1.ReferenceSetOrBuilder getReferenceSetsOrBuilder(
      int index) {
    return referenceSets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private java.lang.Object nextPageToken_;
  /**
   * <code>optional string next_page_token = 2;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        nextPageToken_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string next_page_token = 2;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
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
    getSerializedSize();
    for (int i = 0; i < referenceSets_.size(); i++) {
      output.writeMessage(1, referenceSets_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      output.writeBytes(2, getNextPageTokenBytes());
    }
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < referenceSets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, referenceSets_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, getNextPageTokenBytes());
    }
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.genomics.v1.SearchReferenceSetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchReferenceSetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReferenceSetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.genomics.v1.SearchReferenceSetsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReferenceSetsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.SearchReferenceSetsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReferenceSetsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.genomics.v1.SearchReferenceSetsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.genomics.v1.SearchReferenceSetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.genomics.v1.SearchReferenceSetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return new Builder(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(com.google.genomics.v1.SearchReferenceSetsResponse prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.genomics.v1.SearchReferenceSetsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.genomics.v1.SearchReferenceSetsResponse)
      com.google.genomics.v1.SearchReferenceSetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.genomics.v1.ReferencesProto.internal_static_google_genomics_v1_SearchReferenceSetsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.genomics.v1.ReferencesProto.internal_static_google_genomics_v1_SearchReferenceSetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.genomics.v1.SearchReferenceSetsResponse.class, com.google.genomics.v1.SearchReferenceSetsResponse.Builder.class);
    }

    // Construct using com.google.genomics.v1.SearchReferenceSetsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        getReferenceSetsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (referenceSetsBuilder_ == null) {
        referenceSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        referenceSetsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.genomics.v1.ReferencesProto.internal_static_google_genomics_v1_SearchReferenceSetsResponse_descriptor;
    }

    public com.google.genomics.v1.SearchReferenceSetsResponse getDefaultInstanceForType() {
      return com.google.genomics.v1.SearchReferenceSetsResponse.getDefaultInstance();
    }

    public com.google.genomics.v1.SearchReferenceSetsResponse build() {
      com.google.genomics.v1.SearchReferenceSetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.genomics.v1.SearchReferenceSetsResponse buildPartial() {
      com.google.genomics.v1.SearchReferenceSetsResponse result = new com.google.genomics.v1.SearchReferenceSetsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (referenceSetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          referenceSets_ = java.util.Collections.unmodifiableList(referenceSets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.referenceSets_ = referenceSets_;
      } else {
        result.referenceSets_ = referenceSetsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.genomics.v1.SearchReferenceSetsResponse) {
        return mergeFrom((com.google.genomics.v1.SearchReferenceSetsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.genomics.v1.SearchReferenceSetsResponse other) {
      if (other == com.google.genomics.v1.SearchReferenceSetsResponse.getDefaultInstance()) return this;
      if (referenceSetsBuilder_ == null) {
        if (!other.referenceSets_.isEmpty()) {
          if (referenceSets_.isEmpty()) {
            referenceSets_ = other.referenceSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReferenceSetsIsMutable();
            referenceSets_.addAll(other.referenceSets_);
          }
          onChanged();
        }
      } else {
        if (!other.referenceSets_.isEmpty()) {
          if (referenceSetsBuilder_.isEmpty()) {
            referenceSetsBuilder_.dispose();
            referenceSetsBuilder_ = null;
            referenceSets_ = other.referenceSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            referenceSetsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getReferenceSetsFieldBuilder() : null;
          } else {
            referenceSetsBuilder_.addAllMessages(other.referenceSets_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
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
      com.google.genomics.v1.SearchReferenceSetsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.genomics.v1.SearchReferenceSetsResponse) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.genomics.v1.ReferenceSet> referenceSets_ =
      java.util.Collections.emptyList();
    private void ensureReferenceSetsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        referenceSets_ = new java.util.ArrayList<com.google.genomics.v1.ReferenceSet>(referenceSets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.genomics.v1.ReferenceSet, com.google.genomics.v1.ReferenceSet.Builder, com.google.genomics.v1.ReferenceSetOrBuilder> referenceSetsBuilder_;

    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public java.util.List<com.google.genomics.v1.ReferenceSet> getReferenceSetsList() {
      if (referenceSetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(referenceSets_);
      } else {
        return referenceSetsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public int getReferenceSetsCount() {
      if (referenceSetsBuilder_ == null) {
        return referenceSets_.size();
      } else {
        return referenceSetsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public com.google.genomics.v1.ReferenceSet getReferenceSets(int index) {
      if (referenceSetsBuilder_ == null) {
        return referenceSets_.get(index);
      } else {
        return referenceSetsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public Builder setReferenceSets(
        int index, com.google.genomics.v1.ReferenceSet value) {
      if (referenceSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReferenceSetsIsMutable();
        referenceSets_.set(index, value);
        onChanged();
      } else {
        referenceSetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public Builder setReferenceSets(
        int index, com.google.genomics.v1.ReferenceSet.Builder builderForValue) {
      if (referenceSetsBuilder_ == null) {
        ensureReferenceSetsIsMutable();
        referenceSets_.set(index, builderForValue.build());
        onChanged();
      } else {
        referenceSetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public Builder addReferenceSets(com.google.genomics.v1.ReferenceSet value) {
      if (referenceSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReferenceSetsIsMutable();
        referenceSets_.add(value);
        onChanged();
      } else {
        referenceSetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public Builder addReferenceSets(
        int index, com.google.genomics.v1.ReferenceSet value) {
      if (referenceSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReferenceSetsIsMutable();
        referenceSets_.add(index, value);
        onChanged();
      } else {
        referenceSetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public Builder addReferenceSets(
        com.google.genomics.v1.ReferenceSet.Builder builderForValue) {
      if (referenceSetsBuilder_ == null) {
        ensureReferenceSetsIsMutable();
        referenceSets_.add(builderForValue.build());
        onChanged();
      } else {
        referenceSetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public Builder addReferenceSets(
        int index, com.google.genomics.v1.ReferenceSet.Builder builderForValue) {
      if (referenceSetsBuilder_ == null) {
        ensureReferenceSetsIsMutable();
        referenceSets_.add(index, builderForValue.build());
        onChanged();
      } else {
        referenceSetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public Builder addAllReferenceSets(
        java.lang.Iterable<? extends com.google.genomics.v1.ReferenceSet> values) {
      if (referenceSetsBuilder_ == null) {
        ensureReferenceSetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, referenceSets_);
        onChanged();
      } else {
        referenceSetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public Builder clearReferenceSets() {
      if (referenceSetsBuilder_ == null) {
        referenceSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        referenceSetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public Builder removeReferenceSets(int index) {
      if (referenceSetsBuilder_ == null) {
        ensureReferenceSetsIsMutable();
        referenceSets_.remove(index);
        onChanged();
      } else {
        referenceSetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public com.google.genomics.v1.ReferenceSet.Builder getReferenceSetsBuilder(
        int index) {
      return getReferenceSetsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public com.google.genomics.v1.ReferenceSetOrBuilder getReferenceSetsOrBuilder(
        int index) {
      if (referenceSetsBuilder_ == null) {
        return referenceSets_.get(index);  } else {
        return referenceSetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public java.util.List<? extends com.google.genomics.v1.ReferenceSetOrBuilder> 
         getReferenceSetsOrBuilderList() {
      if (referenceSetsBuilder_ != null) {
        return referenceSetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(referenceSets_);
      }
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public com.google.genomics.v1.ReferenceSet.Builder addReferenceSetsBuilder() {
      return getReferenceSetsFieldBuilder().addBuilder(
          com.google.genomics.v1.ReferenceSet.getDefaultInstance());
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public com.google.genomics.v1.ReferenceSet.Builder addReferenceSetsBuilder(
        int index) {
      return getReferenceSetsFieldBuilder().addBuilder(
          index, com.google.genomics.v1.ReferenceSet.getDefaultInstance());
    }
    /**
     * <code>repeated .google.genomics.v1.ReferenceSet reference_sets = 1;</code>
     *
     * <pre>
     * The matching references sets.
     * </pre>
     */
    public java.util.List<com.google.genomics.v1.ReferenceSet.Builder> 
         getReferenceSetsBuilderList() {
      return getReferenceSetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.google.genomics.v1.ReferenceSet, com.google.genomics.v1.ReferenceSet.Builder, com.google.genomics.v1.ReferenceSetOrBuilder> 
        getReferenceSetsFieldBuilder() {
      if (referenceSetsBuilder_ == null) {
        referenceSetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.google.genomics.v1.ReferenceSet, com.google.genomics.v1.ReferenceSet.Builder, com.google.genomics.v1.ReferenceSetOrBuilder>(
                referenceSets_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        referenceSets_ = null;
      }
      return referenceSetsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <code>optional string next_page_token = 2;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nextPageToken_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string next_page_token = 2;</code>
     *
     * <pre>
     * The continuation token, which is used to page through large result sets.
     * Provide this value in a subsequent request to return the next page of
     * results. This field will be empty if there aren't any additional results.
     * </pre>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.genomics.v1.SearchReferenceSetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.genomics.v1.SearchReferenceSetsResponse)
  private static final com.google.genomics.v1.SearchReferenceSetsResponse defaultInstance;static {
    defaultInstance = new com.google.genomics.v1.SearchReferenceSetsResponse();
  }

  public static com.google.genomics.v1.SearchReferenceSetsResponse getDefaultInstance() {
    return defaultInstance;
  }

  public com.google.genomics.v1.SearchReferenceSetsResponse getDefaultInstanceForType() {
    return defaultInstance;
  }

}

