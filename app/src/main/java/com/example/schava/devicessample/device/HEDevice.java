package com.example.schava.devicessample.device;

import org.json.JSONObject;

/**
 * Home entertainment devices information
 */
public class HEDevice extends Device {

    protected String CategoryType;
    protected int Transport;
    protected boolean isFaqCritical;
    protected boolean isFaqAvailable;

    public HEDevice build(JSONObject deviceObject) {
        return new HEDevice();
    }
}
