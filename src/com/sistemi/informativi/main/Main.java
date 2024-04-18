package com.sistemi.informativi.main;

import com.sistemi.informativi.business.DeviceInfo;
import com.sistemi.informativi.business.DeviceInfoImpl;
import com.sistemi.informativi.enumeration.Choice;

public class Main {
    public static void main(String[] args) {

       DeviceInfo deviceInfo = new DeviceInfoImpl();

       deviceInfo.findDevices(Choice.SMARTPHONE).forEach(device->System.out.println(device));
    }
}