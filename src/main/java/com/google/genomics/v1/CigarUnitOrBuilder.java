// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/genomics/v1/cigar.proto

package com.google.genomics.v1;

public interface CigarUnitOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.genomics.v1.CigarUnit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .google.genomics.v1.CigarUnit.Operation operation = 1;</code>
   */
  int getOperationValue();
  /**
   * <code>optional .google.genomics.v1.CigarUnit.Operation operation = 1;</code>
   */
  com.google.genomics.v1.CigarUnit.Operation getOperation();

  /**
   * <code>optional int64 operation_length = 2;</code>
   *
   * <pre>
   * The number of genomic bases that the operation runs for. Required.
   * </pre>
   */
  long getOperationLength();

  /**
   * <code>optional string reference_sequence = 3;</code>
   *
   * <pre>
   * `referenceSequence` is only used at mismatches
   * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
   * Filling this field replaces SAM's MD tag. If the relevant information is
   * not available, this field is unset.
   * </pre>
   */
  java.lang.String getReferenceSequence();
  /**
   * <code>optional string reference_sequence = 3;</code>
   *
   * <pre>
   * `referenceSequence` is only used at mismatches
   * (`SEQUENCE_MISMATCH`) and deletions (`DELETE`).
   * Filling this field replaces SAM's MD tag. If the relevant information is
   * not available, this field is unset.
   * </pre>
   */
  com.google.protobuf.ByteString
      getReferenceSequenceBytes();
}