package com.exemple.reservation_rest.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.CreateReservationRequest,
      com.exemple.reservation_rest.stubs.Reservation> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = com.exemple.reservation_rest.stubs.CreateReservationRequest.class,
      responseType = com.exemple.reservation_rest.stubs.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.CreateReservationRequest,
      com.exemple.reservation_rest.stubs.Reservation> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.CreateReservationRequest, com.exemple.reservation_rest.stubs.Reservation> getCreateReservationMethod;
    if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
          ReservationServiceGrpc.getCreateReservationMethod = getCreateReservationMethod = 
              io.grpc.MethodDescriptor.<com.exemple.reservation_rest.stubs.CreateReservationRequest, com.exemple.reservation_rest.stubs.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.reservation_rest.stubs.CreateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.reservation_rest.stubs.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("CreateReservation"))
                  .build();
          }
        }
     }
     return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.ReservationIdRequest,
      com.exemple.reservation_rest.stubs.Reservation> getGetReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservation",
      requestType = com.exemple.reservation_rest.stubs.ReservationIdRequest.class,
      responseType = com.exemple.reservation_rest.stubs.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.ReservationIdRequest,
      com.exemple.reservation_rest.stubs.Reservation> getGetReservationMethod() {
    io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.ReservationIdRequest, com.exemple.reservation_rest.stubs.Reservation> getGetReservationMethod;
    if ((getGetReservationMethod = ReservationServiceGrpc.getGetReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationMethod = ReservationServiceGrpc.getGetReservationMethod) == null) {
          ReservationServiceGrpc.getGetReservationMethod = getGetReservationMethod = 
              io.grpc.MethodDescriptor.<com.exemple.reservation_rest.stubs.ReservationIdRequest, com.exemple.reservation_rest.stubs.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "GetReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.reservation_rest.stubs.ReservationIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.reservation_rest.stubs.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservation"))
                  .build();
          }
        }
     }
     return getGetReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.UpdateReservationRequest,
      com.exemple.reservation_rest.stubs.Reservation> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReservation",
      requestType = com.exemple.reservation_rest.stubs.UpdateReservationRequest.class,
      responseType = com.exemple.reservation_rest.stubs.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.UpdateReservationRequest,
      com.exemple.reservation_rest.stubs.Reservation> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.UpdateReservationRequest, com.exemple.reservation_rest.stubs.Reservation> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
          ReservationServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod = 
              io.grpc.MethodDescriptor.<com.exemple.reservation_rest.stubs.UpdateReservationRequest, com.exemple.reservation_rest.stubs.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "UpdateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.reservation_rest.stubs.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.reservation_rest.stubs.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("UpdateReservation"))
                  .build();
          }
        }
     }
     return getUpdateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.ReservationIdRequest,
      com.exemple.reservation_rest.stubs.Empty> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservation",
      requestType = com.exemple.reservation_rest.stubs.ReservationIdRequest.class,
      responseType = com.exemple.reservation_rest.stubs.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.ReservationIdRequest,
      com.exemple.reservation_rest.stubs.Empty> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.ReservationIdRequest, com.exemple.reservation_rest.stubs.Empty> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<com.exemple.reservation_rest.stubs.ReservationIdRequest, com.exemple.reservation_rest.stubs.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "DeleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.reservation_rest.stubs.ReservationIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.reservation_rest.stubs.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.Empty,
      com.exemple.reservation_rest.stubs.ReservationList> getGetAllReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllReservations",
      requestType = com.exemple.reservation_rest.stubs.Empty.class,
      responseType = com.exemple.reservation_rest.stubs.ReservationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.Empty,
      com.exemple.reservation_rest.stubs.ReservationList> getGetAllReservationsMethod() {
    io.grpc.MethodDescriptor<com.exemple.reservation_rest.stubs.Empty, com.exemple.reservation_rest.stubs.ReservationList> getGetAllReservationsMethod;
    if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetAllReservationsMethod = ReservationServiceGrpc.getGetAllReservationsMethod) == null) {
          ReservationServiceGrpc.getGetAllReservationsMethod = getGetAllReservationsMethod = 
              io.grpc.MethodDescriptor.<com.exemple.reservation_rest.stubs.Empty, com.exemple.reservation_rest.stubs.ReservationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ReservationService", "GetAllReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.reservation_rest.stubs.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.exemple.reservation_rest.stubs.ReservationList.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetAllReservations"))
                  .build();
          }
        }
     }
     return getGetAllReservationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createReservation(com.exemple.reservation_rest.stubs.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     */
    public void getReservation(com.exemple.reservation_rest.stubs.ReservationIdRequest request,
        io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationMethod(), responseObserver);
    }

    /**
     */
    public void updateReservation(com.exemple.reservation_rest.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    /**
     */
    public void deleteReservation(com.exemple.reservation_rest.stubs.ReservationIdRequest request,
        io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    /**
     */
    public void getAllReservations(com.exemple.reservation_rest.stubs.Empty request,
        io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.ReservationList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllReservationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.exemple.reservation_rest.stubs.CreateReservationRequest,
                com.exemple.reservation_rest.stubs.Reservation>(
                  this, METHODID_CREATE_RESERVATION)))
          .addMethod(
            getGetReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.exemple.reservation_rest.stubs.ReservationIdRequest,
                com.exemple.reservation_rest.stubs.Reservation>(
                  this, METHODID_GET_RESERVATION)))
          .addMethod(
            getUpdateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.exemple.reservation_rest.stubs.UpdateReservationRequest,
                com.exemple.reservation_rest.stubs.Reservation>(
                  this, METHODID_UPDATE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.exemple.reservation_rest.stubs.ReservationIdRequest,
                com.exemple.reservation_rest.stubs.Empty>(
                  this, METHODID_DELETE_RESERVATION)))
          .addMethod(
            getGetAllReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.exemple.reservation_rest.stubs.Empty,
                com.exemple.reservation_rest.stubs.ReservationList>(
                  this, METHODID_GET_ALL_RESERVATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createReservation(com.exemple.reservation_rest.stubs.CreateReservationRequest request,
        io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservation(com.exemple.reservation_rest.stubs.ReservationIdRequest request,
        io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReservation(com.exemple.reservation_rest.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(com.exemple.reservation_rest.stubs.ReservationIdRequest request,
        io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllReservations(com.exemple.reservation_rest.stubs.Empty request,
        io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.ReservationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.exemple.reservation_rest.stubs.Reservation createReservation(com.exemple.reservation_rest.stubs.CreateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.exemple.reservation_rest.stubs.Reservation getReservation(com.exemple.reservation_rest.stubs.ReservationIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.exemple.reservation_rest.stubs.Reservation updateReservation(com.exemple.reservation_rest.stubs.UpdateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.exemple.reservation_rest.stubs.Empty deleteReservation(com.exemple.reservation_rest.stubs.ReservationIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.exemple.reservation_rest.stubs.ReservationList getAllReservations(com.exemple.reservation_rest.stubs.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetAllReservationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.exemple.reservation_rest.stubs.Reservation> createReservation(
        com.exemple.reservation_rest.stubs.CreateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.exemple.reservation_rest.stubs.Reservation> getReservation(
        com.exemple.reservation_rest.stubs.ReservationIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.exemple.reservation_rest.stubs.Reservation> updateReservation(
        com.exemple.reservation_rest.stubs.UpdateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.exemple.reservation_rest.stubs.Empty> deleteReservation(
        com.exemple.reservation_rest.stubs.ReservationIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.exemple.reservation_rest.stubs.ReservationList> getAllReservations(
        com.exemple.reservation_rest.stubs.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllReservationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RESERVATION = 0;
  private static final int METHODID_GET_RESERVATION = 1;
  private static final int METHODID_UPDATE_RESERVATION = 2;
  private static final int METHODID_DELETE_RESERVATION = 3;
  private static final int METHODID_GET_ALL_RESERVATIONS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((com.exemple.reservation_rest.stubs.CreateReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Reservation>) responseObserver);
          break;
        case METHODID_GET_RESERVATION:
          serviceImpl.getReservation((com.exemple.reservation_rest.stubs.ReservationIdRequest) request,
              (io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Reservation>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((com.exemple.reservation_rest.stubs.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Reservation>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((com.exemple.reservation_rest.stubs.ReservationIdRequest) request,
              (io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.Empty>) responseObserver);
          break;
        case METHODID_GET_ALL_RESERVATIONS:
          serviceImpl.getAllReservations((com.exemple.reservation_rest.stubs.Empty) request,
              (io.grpc.stub.StreamObserver<com.exemple.reservation_rest.stubs.ReservationList>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.exemple.reservation_rest.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getCreateReservationMethod())
              .addMethod(getGetReservationMethod())
              .addMethod(getUpdateReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .addMethod(getGetAllReservationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
