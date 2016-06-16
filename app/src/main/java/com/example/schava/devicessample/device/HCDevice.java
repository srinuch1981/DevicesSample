package com.example.schava.devicessample.device;

import org.json.JSONObject;

/**
 * Home control devices, gatewayID present only after pairing
 */
public class HCDevice extends Device {

    public static final int MANUAL_ENTERED_HC_DEVICE = 0;
    public static final int AUTOMATION_CONFIG_HC_DEVICE = 1;

    protected String gatewayId;

    // Use this to avoid Multiple pair of same types
    protected String gatewayType;

    // Will be match after pair with GateWay->type
    protected String authType;


    public HCDevice build(JSONObject deviceObject) {
        return new HCDevice();
    }

    public HCDevice build(int detectedType, JSONObject deviceObject) {
        return new HCDevice();
    }


}
