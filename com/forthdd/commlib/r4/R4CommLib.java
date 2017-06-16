package com.forthdd.commlib.r4;

import com.forthdd.commlib.exceptions.AbstractException;

public abstract class R4CommLib
{
    public static final int FDD_VID = 0x19EC;

    public static final int R4_HID_PID = 0x0301;
    public static final String R4_WINUSB_GUID = "54ED7AC9-CC23-4165-BE32-79016BAFB950";
    public static final int R4_WINUSB_PID = 0x0403;
    public static final int R4_RS232_BAUDRATE = 115200;

    public static final int ATMEL_VID = 0x03EB;
    public static final int ATMEL_SAM_BA_PID = 0x6124;
    public static final int ATMEL_SAM_BA_BAUDRATE = 115200;

    public static native String libGetVersion() throws AbstractException;

    public static native String[] devEnumerateWinUSB() throws AbstractException;

    public static native byte rpcSysGetBoardType() throws AbstractException;
    public static native void rpcSysReboot() throws AbstractException;
    public static native int rpcSysGetStoredChecksum(int bpIndex) throws AbstractException;
    public static native int rpcSysGetCalculatedChecksum(int bpIndex) throws AbstractException;
    public static native int rpcSysGetBitplaneCount() throws AbstractException;
    public static native void rpcSysReloadRepertoire() throws AbstractException;
    public static native String rpcSysGetRepertoireName() throws AbstractException;
    public static native void rpcSysSaveSettings() throws AbstractException;
    public static native byte rpcSysGetDaughterboardType() throws AbstractException;
    public static native int rpcSysGetADC(int channel) throws AbstractException;
    public static native byte rpcSysGetBoardID() throws AbstractException;
    public static native byte rpcSysGetDisplayType() throws AbstractException;
    public static native int rpcSysGetDisplayTemp() throws AbstractException;
    public static native int rpcSysGetSerialNum() throws AbstractException;
    public static native String rpcMicroGetCodeTimestamp() throws AbstractException;
    public static native byte[] rpcMicroGetCodeVersion() throws AbstractException;
    public static native void rpcFlashEraseBlock(int flashPage) throws AbstractException;
    public static native byte[] rpcFpgaRead(int reg, int len) throws AbstractException;
    public static native void rpcFpgaWrite(int reg, byte[] buf) throws AbstractException;
    public static native int rpcRoGetCount() throws AbstractException;
    public static native int rpcRoGetSelected() throws AbstractException;
    public static native int rpcRoGetDefault() throws AbstractException;
    public static native void rpcRoSetSelected(int roIndex) throws AbstractException;
    public static native void rpcRoSetDefault(int roIndex) throws AbstractException;
    public static native byte rpcRoGetActivationType() throws AbstractException;
    public static native byte rpcRoGetActivationState() throws AbstractException;
    public static native void rpcRoActivate() throws AbstractException;
    public static native void rpcRoDeactivate() throws AbstractException;
    public static native String rpcRoGetName(int roIndex) throws AbstractException;
    public static native void rpcLedSet(int ledValue) throws AbstractException;
    public static native int rpcLedGet() throws AbstractException;
    public static native void rpcFlipTpSet(byte flipTpValue) throws AbstractException;
    public static native byte rpcFlipTpGet() throws AbstractException;
    public static native void rpcMaintLedSet(boolean ledEnable) throws AbstractException;
    public static native boolean rpcMaintLedGet() throws AbstractException;
    public static native int devGetProgress() throws AbstractException;
    public static native byte[] flashRead(int offset, int len) throws AbstractException;
    public static native void flashWrite(byte[] buf, int offset) throws AbstractException;
    public static native void flashGrab(int page) throws AbstractException;
    public static native void flashBurn(int page) throws AbstractException;
}
