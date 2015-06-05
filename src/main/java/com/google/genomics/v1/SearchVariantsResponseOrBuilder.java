// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface SearchVariantsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.SearchVariantsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   *
   * <pre>
   * The list of matching Variants.
   * </pre>
   */
  java.util.List<com.google.genomics.v1.Variant> 
      getVariantsList();
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   *
   * <pre>
   * The list of matching Variants.
   * </pre>
   */
  com.google.genomics.v1.Variant getVariants(int index);
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   *
   * <pre>
   * The list of matching Variants.
   * </pre>
   */
  int getVariantsCount();
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   *
   * <pre>
   * The list of matching Variants.
   * </pre>
   */
  java.util.List<? extends com.google.genomics.v1.VariantOrBuilder> 
      getVariantsOrBuilderList();
  /**
   * <code>repeated .google.genomics.v1.Variant variants = 1;</code>
   *
   * <pre>
   * The list of matching Variants.
   * </pre>
   */
  com.google.genomics.v1.VariantOrBuilder getVariantsOrBuilder(
      int index);

  /**
   * <code>optional string next_page_token = 2;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  java.lang.String getNextPageToken();
  /**
   * <code>optional string next_page_token = 2;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * Provide this value in a subsequent request to return the next page of
   * results. This field will be empty if there aren't any additional results.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
