package com.example.schava.devicessample.device;

import com.android.internal.util.Predicate;

import org.json.JSONArray;

import java.util.List;
import java.util.Map;

/**
 * Holds all IPScan devices and provide simple functions for application usage
 * Internally manages pair state based on type(i.e hue or Lutron)
 */
public class IPScanDeviceManager {
    private Map<String, IPScanDevice> ipScanDeviceMap;

    public boolean updateIpScanDevices(JSONArray ipScanResponse) {
        return false;
    }

    public List<IPScanDevice> getIpScanDevices(Predicate<IPScanDevice> devicePredicate) {
        return null;
    }

    public void updateDevicePairState(IPScanDevice ipScanDevice, int pairState) {

    }
}
