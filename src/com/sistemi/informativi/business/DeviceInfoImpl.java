package com.sistemi.informativi.business;

import com.sistemi.informativi.bean.Device;
import com.sistemi.informativi.bean.Laptop;
import com.sistemi.informativi.bean.Pc;
import com.sistemi.informativi.bean.Smartphone;
import com.sistemi.informativi.enumeration.Choice;

import java.util.stream.Stream;

public class DeviceInfoImpl implements DeviceInfo{


    @Override
    public Stream<Device> findDevices(Choice choice) {

        Stream<Device> devices=null;

        switch (choice) {

            case LAPTOP:
                devices = Stream.of(new Laptop("ASUS","as"),
                                    new Laptop("ACER","ac"));
                break;
            case PC:
                devices = Stream.of(new Pc("HP","hp"),
                                    new Pc("DELL","dell"));
                break;
            case SMARTPHONE:
                devices = Stream.of(new Smartphone("GALAXY","AS10"),
                                    new Smartphone("IPHONE","14"));
                break;
        }

       return devices;

    }
}
