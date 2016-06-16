package com.example.schava.devicessample.device;

/**
 * Manager to hold both Paired and Manually added devices to display in device list screen
 * (Should manage groups inside and just give data to application as a list to display)
 *
 *  ex: When user delete's a device it should check HE/HC delete corresponding gatewayId and devices
 */
public class SetupDeviceManager {

    public boolean addDetectedDevice(Device device) {
        return false;
    }

    public boolean deleteDetectedDevice(String deviceId) {
        return false;
    }

    public Device getSetupDevice(String deviceId) {
        return null;
    }

}