/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package id.flutter.flutter_background_service;
// Declare any non-default types here with import statements

public interface IBackgroundService extends android.os.IInterface
{
  /** Default implementation for IBackgroundService. */
  public static class Default implements id.flutter.flutter_background_service.IBackgroundService
  {
    @Override public void invoke(java.lang.String data) throws android.os.RemoteException
    {
    }
    @Override public void stop() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements id.flutter.flutter_background_service.IBackgroundService
  {
    private static final java.lang.String DESCRIPTOR = "id.flutter.flutter_background_service.IBackgroundService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an id.flutter.flutter_background_service.IBackgroundService interface,
     * generating a proxy if needed.
     */
    public static id.flutter.flutter_background_service.IBackgroundService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof id.flutter.flutter_background_service.IBackgroundService))) {
        return ((id.flutter.flutter_background_service.IBackgroundService)iin);
      }
      return new id.flutter.flutter_background_service.IBackgroundService.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_invoke:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.invoke(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_stop:
        {
          data.enforceInterface(descriptor);
          this.stop();
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements id.flutter.flutter_background_service.IBackgroundService
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void invoke(java.lang.String data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_invoke, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().invoke(data);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void stop() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().stop();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static id.flutter.flutter_background_service.IBackgroundService sDefaultImpl;
    }
    static final int TRANSACTION_invoke = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(id.flutter.flutter_background_service.IBackgroundService impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static id.flutter.flutter_background_service.IBackgroundService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void invoke(java.lang.String data) throws android.os.RemoteException;
  public void stop() throws android.os.RemoteException;
}
