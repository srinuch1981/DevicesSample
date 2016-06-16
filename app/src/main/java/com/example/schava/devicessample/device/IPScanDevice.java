package com.example.schava.devicessample.device;

/**
 * Created by schava on 6/16/2016.
 */
public interface IPScanDevice {
    String getDeviceId();
    String getIPAddress();
    String getDeviceClass();
    String getServiceType();
}
