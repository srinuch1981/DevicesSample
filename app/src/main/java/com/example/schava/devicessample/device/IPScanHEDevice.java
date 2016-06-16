package com.example.schava.devicessample.device;

import org.json.JSONObject;

/**
 * IP detected HE devices (ex: Sono's)
 */
public class IPScanHEDevice extends HEDevice  implements IPScanDevice {

    private IPScanInfo ipScanInfo;

    private IPScanHEDevice() {

    }

    public IPScanHEDevice build(JSONObject ipScanHEObject) {
        return new IPScanHEDevice();
    }

    @Override
    public String getDeviceId() {
        return null;
    }

    @Override
    public String getIPAddress() {
        return null;
    }

    @Override
    public String getDeviceClass() {
        return null;
    }

    @Override
    public String getServiceType() {
        return null;
    }
}
