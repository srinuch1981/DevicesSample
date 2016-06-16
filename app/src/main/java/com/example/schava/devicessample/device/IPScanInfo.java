package com.example.schava.devicessample.device;


import org.json.JSONObject;

public class IPScanInfo {
    /* Below data Extracted from AutoDetectedDevice  -- Start*/
    private String USN;
    private String Id; /* Unique Key to differentiate */
    private String Class;
    private String serviceType;
    private String ipAddress;
    /* Below data Extracted from AutoDetectedDevice  -- End*/

    private IPScanInfo() {

    }
    
    public IPScanInfo build(JSONObject ipScanInfo) {
        return new IPScanInfo();
    }
}
