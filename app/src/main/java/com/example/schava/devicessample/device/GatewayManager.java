package com.example.schava.devicessample.device;

import org.json.JSONObject;

public class GatewayManager {

    public boolean updateGateways(JSONObject autoConfig) {
        return false;
    }

    private boolean addGateway(GatewayInfo gatewayInfo) {
        return false;
    }

    private boolean removeGateway(String gatewayId) {
        return false;
    }

    public boolean addDevice(String deviceId, String gatewayId) {
        return false;
    }

    public boolean deleteDevice(String deviceId, String gatewayId) {
        return false;
    }
}
