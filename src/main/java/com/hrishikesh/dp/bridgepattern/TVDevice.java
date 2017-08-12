package com.hrishikesh.dp.bridgepattern;

/**
 * @author hrishikesh.mishra
 */
public class TVDevice extends EntertainmentDevice {

    public TVDevice(int newDeviceState, int newMaxSetting) {
        deviceStatus = newDeviceState;
        maxSetting = newMaxSetting;
    }

    @Override
    public void buttonFivePressed() {
        deviceStatus--;
        System.out.println("Channel Down");

    }

    @Override
    public void buttonSixPressed() {
        deviceStatus++;
        System.out.println("Channel UP.");
    }
}
