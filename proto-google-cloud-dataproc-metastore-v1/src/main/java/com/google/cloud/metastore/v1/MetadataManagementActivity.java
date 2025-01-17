/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1/metastore.proto

package com.google.cloud.metastore.v1;

/**
 *
 *
 * <pre>
 * The metadata management activities of the metastore service.
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1.MetadataManagementActivity}
 */
public final class MetadataManagementActivity extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1.MetadataManagementActivity)
    MetadataManagementActivityOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MetadataManagementActivity.newBuilder() to construct.
  private MetadataManagementActivity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MetadataManagementActivity() {
    metadataExports_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MetadataManagementActivity();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private MetadataManagementActivity(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                metadataExports_ =
                    new java.util.ArrayList<com.google.cloud.metastore.v1.MetadataExport>();
                mutable_bitField0_ |= 0x00000001;
              }
              metadataExports_.add(
                  input.readMessage(
                      com.google.cloud.metastore.v1.MetadataExport.parser(), extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        metadataExports_ = java.util.Collections.unmodifiableList(metadataExports_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.metastore.v1.MetastoreProto
        .internal_static_google_cloud_metastore_v1_MetadataManagementActivity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1.MetastoreProto
        .internal_static_google_cloud_metastore_v1_MetadataManagementActivity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1.MetadataManagementActivity.class,
            com.google.cloud.metastore.v1.MetadataManagementActivity.Builder.class);
  }

  public static final int METADATA_EXPORTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.metastore.v1.MetadataExport> metadataExports_;
  /**
   *
   *
   * <pre>
   * Output only. The latest metadata exports of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.metastore.v1.MetadataExport> getMetadataExportsList() {
    return metadataExports_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The latest metadata exports of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.metastore.v1.MetadataExportOrBuilder>
      getMetadataExportsOrBuilderList() {
    return metadataExports_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The latest metadata exports of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public int getMetadataExportsCount() {
    return metadataExports_.size();
  }
  /**
   *
   *
   * <pre>
   * Output only. The latest metadata exports of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.metastore.v1.MetadataExport getMetadataExports(int index) {
    return metadataExports_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Output only. The latest metadata exports of the metastore service.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.metastore.v1.MetadataExportOrBuilder getMetadataExportsOrBuilder(
      int index) {
    return metadataExports_.get(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < metadataExports_.size(); i++) {
      output.writeMessage(1, metadataExports_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < metadataExports_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, metadataExports_.get(i));
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
    if (!(obj instanceof com.google.cloud.metastore.v1.MetadataManagementActivity)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1.MetadataManagementActivity other =
        (com.google.cloud.metastore.v1.MetadataManagementActivity) obj;

    if (!getMetadataExportsList().equals(other.getMetadataExportsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMetadataExportsCount() > 0) {
      hash = (37 * hash) + METADATA_EXPORTS_FIELD_NUMBER;
      hash = (53 * hash) + getMetadataExportsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.metastore.v1.MetadataManagementActivity prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The metadata management activities of the metastore service.
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1.MetadataManagementActivity}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1.MetadataManagementActivity)
      com.google.cloud.metastore.v1.MetadataManagementActivityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.metastore.v1.MetastoreProto
          .internal_static_google_cloud_metastore_v1_MetadataManagementActivity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1.MetastoreProto
          .internal_static_google_cloud_metastore_v1_MetadataManagementActivity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1.MetadataManagementActivity.class,
              com.google.cloud.metastore.v1.MetadataManagementActivity.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1.MetadataManagementActivity.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMetadataExportsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (metadataExportsBuilder_ == null) {
        metadataExports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        metadataExportsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.metastore.v1.MetastoreProto
          .internal_static_google_cloud_metastore_v1_MetadataManagementActivity_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.MetadataManagementActivity getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1.MetadataManagementActivity.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.MetadataManagementActivity build() {
      com.google.cloud.metastore.v1.MetadataManagementActivity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1.MetadataManagementActivity buildPartial() {
      com.google.cloud.metastore.v1.MetadataManagementActivity result =
          new com.google.cloud.metastore.v1.MetadataManagementActivity(this);
      int from_bitField0_ = bitField0_;
      if (metadataExportsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          metadataExports_ = java.util.Collections.unmodifiableList(metadataExports_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metadataExports_ = metadataExports_;
      } else {
        result.metadataExports_ = metadataExportsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.metastore.v1.MetadataManagementActivity) {
        return mergeFrom((com.google.cloud.metastore.v1.MetadataManagementActivity) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1.MetadataManagementActivity other) {
      if (other == com.google.cloud.metastore.v1.MetadataManagementActivity.getDefaultInstance())
        return this;
      if (metadataExportsBuilder_ == null) {
        if (!other.metadataExports_.isEmpty()) {
          if (metadataExports_.isEmpty()) {
            metadataExports_ = other.metadataExports_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetadataExportsIsMutable();
            metadataExports_.addAll(other.metadataExports_);
          }
          onChanged();
        }
      } else {
        if (!other.metadataExports_.isEmpty()) {
          if (metadataExportsBuilder_.isEmpty()) {
            metadataExportsBuilder_.dispose();
            metadataExportsBuilder_ = null;
            metadataExports_ = other.metadataExports_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metadataExportsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMetadataExportsFieldBuilder()
                    : null;
          } else {
            metadataExportsBuilder_.addAllMessages(other.metadataExports_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.metastore.v1.MetadataManagementActivity parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.metastore.v1.MetadataManagementActivity) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.metastore.v1.MetadataExport> metadataExports_ =
        java.util.Collections.emptyList();

    private void ensureMetadataExportsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        metadataExports_ =
            new java.util.ArrayList<com.google.cloud.metastore.v1.MetadataExport>(metadataExports_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.metastore.v1.MetadataExport,
            com.google.cloud.metastore.v1.MetadataExport.Builder,
            com.google.cloud.metastore.v1.MetadataExportOrBuilder>
        metadataExportsBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.metastore.v1.MetadataExport> getMetadataExportsList() {
      if (metadataExportsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metadataExports_);
      } else {
        return metadataExportsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getMetadataExportsCount() {
      if (metadataExportsBuilder_ == null) {
        return metadataExports_.size();
      } else {
        return metadataExportsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.metastore.v1.MetadataExport getMetadataExports(int index) {
      if (metadataExportsBuilder_ == null) {
        return metadataExports_.get(index);
      } else {
        return metadataExportsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setMetadataExports(
        int index, com.google.cloud.metastore.v1.MetadataExport value) {
      if (metadataExportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetadataExportsIsMutable();
        metadataExports_.set(index, value);
        onChanged();
      } else {
        metadataExportsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setMetadataExports(
        int index, com.google.cloud.metastore.v1.MetadataExport.Builder builderForValue) {
      if (metadataExportsBuilder_ == null) {
        ensureMetadataExportsIsMutable();
        metadataExports_.set(index, builderForValue.build());
        onChanged();
      } else {
        metadataExportsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addMetadataExports(com.google.cloud.metastore.v1.MetadataExport value) {
      if (metadataExportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetadataExportsIsMutable();
        metadataExports_.add(value);
        onChanged();
      } else {
        metadataExportsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addMetadataExports(
        int index, com.google.cloud.metastore.v1.MetadataExport value) {
      if (metadataExportsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetadataExportsIsMutable();
        metadataExports_.add(index, value);
        onChanged();
      } else {
        metadataExportsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addMetadataExports(
        com.google.cloud.metastore.v1.MetadataExport.Builder builderForValue) {
      if (metadataExportsBuilder_ == null) {
        ensureMetadataExportsIsMutable();
        metadataExports_.add(builderForValue.build());
        onChanged();
      } else {
        metadataExportsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addMetadataExports(
        int index, com.google.cloud.metastore.v1.MetadataExport.Builder builderForValue) {
      if (metadataExportsBuilder_ == null) {
        ensureMetadataExportsIsMutable();
        metadataExports_.add(index, builderForValue.build());
        onChanged();
      } else {
        metadataExportsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder addAllMetadataExports(
        java.lang.Iterable<? extends com.google.cloud.metastore.v1.MetadataExport> values) {
      if (metadataExportsBuilder_ == null) {
        ensureMetadataExportsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, metadataExports_);
        onChanged();
      } else {
        metadataExportsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearMetadataExports() {
      if (metadataExportsBuilder_ == null) {
        metadataExports_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metadataExportsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeMetadataExports(int index) {
      if (metadataExportsBuilder_ == null) {
        ensureMetadataExportsIsMutable();
        metadataExports_.remove(index);
        onChanged();
      } else {
        metadataExportsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.metastore.v1.MetadataExport.Builder getMetadataExportsBuilder(
        int index) {
      return getMetadataExportsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.metastore.v1.MetadataExportOrBuilder getMetadataExportsOrBuilder(
        int index) {
      if (metadataExportsBuilder_ == null) {
        return metadataExports_.get(index);
      } else {
        return metadataExportsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.metastore.v1.MetadataExportOrBuilder>
        getMetadataExportsOrBuilderList() {
      if (metadataExportsBuilder_ != null) {
        return metadataExportsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metadataExports_);
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.metastore.v1.MetadataExport.Builder addMetadataExportsBuilder() {
      return getMetadataExportsFieldBuilder()
          .addBuilder(com.google.cloud.metastore.v1.MetadataExport.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.metastore.v1.MetadataExport.Builder addMetadataExportsBuilder(
        int index) {
      return getMetadataExportsFieldBuilder()
          .addBuilder(index, com.google.cloud.metastore.v1.MetadataExport.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Output only. The latest metadata exports of the metastore service.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.metastore.v1.MetadataExport metadata_exports = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public java.util.List<com.google.cloud.metastore.v1.MetadataExport.Builder>
        getMetadataExportsBuilderList() {
      return getMetadataExportsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.metastore.v1.MetadataExport,
            com.google.cloud.metastore.v1.MetadataExport.Builder,
            com.google.cloud.metastore.v1.MetadataExportOrBuilder>
        getMetadataExportsFieldBuilder() {
      if (metadataExportsBuilder_ == null) {
        metadataExportsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.metastore.v1.MetadataExport,
                com.google.cloud.metastore.v1.MetadataExport.Builder,
                com.google.cloud.metastore.v1.MetadataExportOrBuilder>(
                metadataExports_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        metadataExports_ = null;
      }
      return metadataExportsBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1.MetadataManagementActivity)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1.MetadataManagementActivity)
  private static final com.google.cloud.metastore.v1.MetadataManagementActivity DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1.MetadataManagementActivity();
  }

  public static com.google.cloud.metastore.v1.MetadataManagementActivity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetadataManagementActivity> PARSER =
      new com.google.protobuf.AbstractParser<MetadataManagementActivity>() {
        @java.lang.Override
        public MetadataManagementActivity parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new MetadataManagementActivity(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<MetadataManagementActivity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetadataManagementActivity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1.MetadataManagementActivity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
