// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

public interface SearchReadsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.SearchReadsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string read_group_set_ids = 1;</code>
   *
   * <pre>
   * The IDs of the read groups sets within which to search for reads. All
   * specified read group sets must be aligned against a common set of reference
   * sequences; this defines the genomic coordinates for the query. Must specify
   * one of `readGroupSetIds` or `readGroupIds`.
   * </pre>
   */
  com.google.protobuf.ProtocolStringList
      getReadGroupSetIdsList();
  /**
   * <code>repeated string read_group_set_ids = 1;</code>
   *
   * <pre>
   * The IDs of the read groups sets within which to search for reads. All
   * specified read group sets must be aligned against a common set of reference
   * sequences; this defines the genomic coordinates for the query. Must specify
   * one of `readGroupSetIds` or `readGroupIds`.
   * </pre>
   */
  int getReadGroupSetIdsCount();
  /**
   * <code>repeated string read_group_set_ids = 1;</code>
   *
   * <pre>
   * The IDs of the read groups sets within which to search for reads. All
   * specified read group sets must be aligned against a common set of reference
   * sequences; this defines the genomic coordinates for the query. Must specify
   * one of `readGroupSetIds` or `readGroupIds`.
   * </pre>
   */
  java.lang.String getReadGroupSetIds(int index);
  /**
   * <code>repeated string read_group_set_ids = 1;</code>
   *
   * <pre>
   * The IDs of the read groups sets within which to search for reads. All
   * specified read group sets must be aligned against a common set of reference
   * sequences; this defines the genomic coordinates for the query. Must specify
   * one of `readGroupSetIds` or `readGroupIds`.
   * </pre>
   */
  com.google.protobuf.ByteString
      getReadGroupSetIdsBytes(int index);

  /**
   * <code>repeated string read_group_ids = 5;</code>
   *
   * <pre>
   * The IDs of the read groups within which to search for reads. All specified
   * read groups must belong to the same read group sets. Must specify one of
   * `readGroupSetIds` or `readGroupIds`.
   * </pre>
   */
  com.google.protobuf.ProtocolStringList
      getReadGroupIdsList();
  /**
   * <code>repeated string read_group_ids = 5;</code>
   *
   * <pre>
   * The IDs of the read groups within which to search for reads. All specified
   * read groups must belong to the same read group sets. Must specify one of
   * `readGroupSetIds` or `readGroupIds`.
   * </pre>
   */
  int getReadGroupIdsCount();
  /**
   * <code>repeated string read_group_ids = 5;</code>
   *
   * <pre>
   * The IDs of the read groups within which to search for reads. All specified
   * read groups must belong to the same read group sets. Must specify one of
   * `readGroupSetIds` or `readGroupIds`.
   * </pre>
   */
  java.lang.String getReadGroupIds(int index);
  /**
   * <code>repeated string read_group_ids = 5;</code>
   *
   * <pre>
   * The IDs of the read groups within which to search for reads. All specified
   * read groups must belong to the same read group sets. Must specify one of
   * `readGroupSetIds` or `readGroupIds`.
   * </pre>
   */
  com.google.protobuf.ByteString
      getReadGroupIdsBytes(int index);

  /**
   * <code>optional string reference_name = 7;</code>
   *
   * <pre>
   * The reference sequence name, for example `chr1`,
   * `1`, or `chrX`. If set to *, only unmapped reads are
   * returned.
   * </pre>
   */
  java.lang.String getReferenceName();
  /**
   * <code>optional string reference_name = 7;</code>
   *
   * <pre>
   * The reference sequence name, for example `chr1`,
   * `1`, or `chrX`. If set to *, only unmapped reads are
   * returned.
   * </pre>
   */
  com.google.protobuf.ByteString
      getReferenceNameBytes();

  /**
   * <code>optional int64 start = 8;</code>
   *
   * <pre>
   * The start position of the range on the reference, 0-based inclusive. If
   * specified, `referenceName` must also be specified.
   * </pre>
   */
  long getStart();

  /**
   * <code>optional int64 end = 9;</code>
   *
   * <pre>
   * The end position of the range on the reference, 0-based exclusive. If
   * specified, `referenceName` must also be specified.
   * </pre>
   */
  long getEnd();

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
   * Specifies number of results to return in a single page. If unspecified,
   * it will default to 256. The maximum value is 2048.
   * </pre>
   */
  int getPageSize();
}
