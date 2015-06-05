// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/reads.proto

package com.google.genomics.v1;

public interface SearchReadsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.SearchReadsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
   *
   * <pre>
   * The list of matching alignments sorted by mapped genomic coordinate,
   * if any, ascending in position within the same reference. Unmapped reads,
   * which have no position, are returned last and are further sorted
   * in ascending lexicographic order by fragment name.
   * </pre>
   */
  java.util.List<com.google.genomics.v1.Read> 
      getAlignmentsList();
  /**
   * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
   *
   * <pre>
   * The list of matching alignments sorted by mapped genomic coordinate,
   * if any, ascending in position within the same reference. Unmapped reads,
   * which have no position, are returned last and are further sorted
   * in ascending lexicographic order by fragment name.
   * </pre>
   */
  com.google.genomics.v1.Read getAlignments(int index);
  /**
   * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
   *
   * <pre>
   * The list of matching alignments sorted by mapped genomic coordinate,
   * if any, ascending in position within the same reference. Unmapped reads,
   * which have no position, are returned last and are further sorted
   * in ascending lexicographic order by fragment name.
   * </pre>
   */
  int getAlignmentsCount();
  /**
   * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
   *
   * <pre>
   * The list of matching alignments sorted by mapped genomic coordinate,
   * if any, ascending in position within the same reference. Unmapped reads,
   * which have no position, are returned last and are further sorted
   * in ascending lexicographic order by fragment name.
   * </pre>
   */
  java.util.List<? extends com.google.genomics.v1.ReadOrBuilder> 
      getAlignmentsOrBuilderList();
  /**
   * <code>repeated .google.genomics.v1.Read alignments = 1;</code>
   *
   * <pre>
   * The list of matching alignments sorted by mapped genomic coordinate,
   * if any, ascending in position within the same reference. Unmapped reads,
   * which have no position, are returned last and are further sorted
   * in ascending lexicographic order by fragment name.
   * </pre>
   */
  com.google.genomics.v1.ReadOrBuilder getAlignmentsOrBuilder(
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
