package com.example.schava.devicessample.device;

import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;

/**
 * Device Gateway Information , Gateway info comes from Automation config
 */
public final class GatewayInfo {
    private String id;
    private String type;
    private String udn;
    private String urlBase;
    private String name;

    // Holds all devices
    private Set<String> devices = new HashSet<>();

    private GatewayInfo(){

    }

    public GatewayInfo build(JSONObject gatewayObject) {
        return new GatewayInfo();
    }

    public void addDevice(String deviceId) {
        if(deviceId != null && devices != null){
            devices.add(deviceId);
        }
    }

    public void removeDevice(String deviceId) {
        if(deviceId != null && devices != null){
            devices.remove(deviceId);
        }
    }

    public boolean hasDevices() {
        if(devices.size() == 0) {
            return false;
        }
        return true;
    }
}
