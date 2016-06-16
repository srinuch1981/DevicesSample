package com.example.schava.devicessample.device;

import org.json.JSONObject;

public class IPScanHCDevice extends HCDevice implements IPScanDevice{

    private IPScanInfo ipScanInfo;

    private IPScanHCDevice() {

    }

    public IPScanHCDevice build(JSONObject ipScanHCObject) {
        return new IPScanHCDevice();
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
