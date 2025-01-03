// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.exemple.reservation_rest.stubs;

public final class ReservationOuterClass {
  private ReservationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Reservation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Reservation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateReservationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateReservationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReservationIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReservationIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReservationList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReservationList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021reservation.proto\"w\n\013Reservation\022\n\n\002id" +
      "\030\001 \001(\005\022\020\n\010clientId\030\002 \001(\005\022\021\n\tchambreId\030\003 " +
      "\001(\005\022\021\n\tdateDebut\030\004 \001(\t\022\017\n\007dateFin\030\005 \001(\t\022" +
      "\023\n\013preferences\030\006 \001(\t\"x\n\030CreateReservatio" +
      "nRequest\022\020\n\010clientId\030\001 \001(\005\022\021\n\tchambreId\030" +
      "\002 \001(\005\022\021\n\tdateDebut\030\003 \001(\t\022\017\n\007dateFin\030\004 \001(" +
      "\t\022\023\n\013preferences\030\005 \001(\t\"\204\001\n\030UpdateReserva" +
      "tionRequest\022\n\n\002id\030\001 \001(\005\022\020\n\010clientId\030\002 \001(" +
      "\005\022\021\n\tchambreId\030\003 \001(\005\022\021\n\tdateDebut\030\004 \001(\t\022" +
      "\017\n\007dateFin\030\005 \001(\t\022\023\n\013preferences\030\006 \001(\t\"\"\n" +
      "\024ReservationIdRequest\022\n\n\002id\030\001 \001(\005\"\007\n\005Emp" +
      "ty\"5\n\017ReservationList\022\"\n\014reservations\030\001 " +
      "\003(\0132\014.Reservation2\253\002\n\022ReservationService" +
      "\022<\n\021CreateReservation\022\031.CreateReservatio" +
      "nRequest\032\014.Reservation\0225\n\016GetReservation" +
      "\022\025.ReservationIdRequest\032\014.Reservation\022<\n" +
      "\021UpdateReservation\022\031.UpdateReservationRe" +
      "quest\032\014.Reservation\0222\n\021DeleteReservation" +
      "\022\025.ReservationIdRequest\032\006.Empty\022.\n\022GetAl" +
      "lReservations\022\006.Empty\032\020.ReservationListB" +
      "&\n\"com.exemple.reservation_rest.stubsP\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Reservation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Reservation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Reservation_descriptor,
        new java.lang.String[] { "Id", "ClientId", "ChambreId", "DateDebut", "DateFin", "Preferences", });
    internal_static_CreateReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CreateReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateReservationRequest_descriptor,
        new java.lang.String[] { "ClientId", "ChambreId", "DateDebut", "DateFin", "Preferences", });
    internal_static_UpdateReservationRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_UpdateReservationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateReservationRequest_descriptor,
        new java.lang.String[] { "Id", "ClientId", "ChambreId", "DateDebut", "DateFin", "Preferences", });
    internal_static_ReservationIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ReservationIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReservationIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_Empty_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_ReservationList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ReservationList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReservationList_descriptor,
        new java.lang.String[] { "Reservations", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
