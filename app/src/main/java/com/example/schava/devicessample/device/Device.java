package com.example.schava.devicessample.device;

/**
 * Base class for all devices (HE,HC, IPScanHE, IPScanHC)
 */
public abstract class Device {
    protected String deviceId;
    protected long timeStamp;

    protected String Model;
    protected String Manufacturer;
    protected String Name;
    protected int DeviceType; // HE, HC
    protected boolean IsMultiCode;
}
