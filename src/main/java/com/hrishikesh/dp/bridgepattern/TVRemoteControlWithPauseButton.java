package com.hrishikesh.dp.bridgepattern;

/**
 * @author hrishikesh.mishra
 */
public class TVRemoteControlWithPauseButton extends RemoteControl {

    public TVRemoteControlWithPauseButton(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was paused!");
    }
}