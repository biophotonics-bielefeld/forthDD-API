package com.forthdd.commlib.core;

import com.forthdd.commlib.exceptions.AbstractException;

public abstract class CommLib
{
    public static native String libGetVersion();

    public static native String[] devEnumerateRS232(int vid, int pid) throws AbstractException;
    public static native String[] devEnumerateComPorts() throws AbstractException;
    public static native String[] devEnumerateHID(int vid, int pid) throws AbstractException;
    public static native String[] devEnumerateWinUSB(String devId) throws AbstractException;

    // Deprecated. Use devOpenComPort() instead.
    public static native void devOpenRS232(String portName, int timeout, int baudRate, boolean doResync) throws AbstractException;

    public static native void devOpenComPort(String portName, int timeout, int baudRate, boolean doResync) throws AbstractException;
    public static native void devOpenHID(String devPath, int timeout) throws AbstractException;
    public static native void devOpenWinUSB(String devPath, int timeout) throws AbstractException;

    public static native void devSetTimeout(int timeout) throws AbstractException;
    public static native int devGetTimeout() throws AbstractException;
    public static native void devClose() throws AbstractException;

    public static native byte[] flashRead(int offset, int len) throws AbstractException;
    public static native void flashWrite(byte[] buf, int offset) throws AbstractException;
}
