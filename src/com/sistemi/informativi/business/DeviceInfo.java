package com.sistemi.informativi.business;

import com.sistemi.informativi.bean.Device;
import com.sistemi.informativi.enumeration.Choice;

import java.util.stream.Stream;

public interface DeviceInfo {

    public Stream<Device> findDevices(Choice choice);

}
