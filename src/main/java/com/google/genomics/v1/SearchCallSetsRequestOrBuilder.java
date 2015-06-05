// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/variants.proto

package com.google.genomics.v1;

public interface SearchCallSetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.SearchCallSetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string variant_set_ids = 1;</code>
   *
   * <pre>
   * Restrict the query to call sets within the given variant sets. At least one
   * ID must be provided.
   * </pre>
   */
  com.google.protobuf.ProtocolStringList
      getVariantSetIdsList();
  /**
   * <code>repeated string variant_set_ids = 1;</code>
   *
   * <pre>
   * Restrict the query to call sets within the given variant sets. At least one
   * ID must be provided.
   * </pre>
   */
  int getVariantSetIdsCount();
  /**
   * <code>repeated string variant_set_ids = 1;</code>
   *
   * <pre>
   * Restrict the query to call sets within the given variant sets. At least one
   * ID must be provided.
   * </pre>
   */
  java.lang.String getVariantSetIds(int index);
  /**
   * <code>repeated string variant_set_ids = 1;</code>
   *
   * <pre>
   * Restrict the query to call sets within the given variant sets. At least one
   * ID must be provided.
   * </pre>
   */
  com.google.protobuf.ByteString
      getVariantSetIdsBytes(int index);

  /**
   * <code>optional string name = 2;</code>
   *
   * <pre>
   * Only return call sets for which a substring of the name matches this
   * string.
   * </pre>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2;</code>
   *
   * <pre>
   * Only return call sets for which a substring of the name matches this
   * string.
   * </pre>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string page_token = 3;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * To get the next page of results, set this parameter to the value of
   * `nextPageToken` from the previous response.
   * </pre>
   */
  java.lang.String getPageToken();
  /**
   * <code>optional string page_token = 3;</code>
   *
   * <pre>
   * The continuation token, which is used to page through large result sets.
   * To get the next page of results, set this parameter to the value of
   * `nextPageToken` from the previous response.
   * </pre>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <code>optional int32 page_size = 4;</code>
   *
   * <pre>
   * The maximum number of call sets to return. If unspecified, defaults to
   * 1000.
   * </pre>
   */
  int getPageSize();
}
