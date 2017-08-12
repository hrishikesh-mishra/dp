package com.hrishikesh.dp.bridgepattern;

/**
 * @author hrishikesh.mishra
 */
public class TVRemoteControlWithMuteButton extends RemoteControl {

    public TVRemoteControlWithMuteButton(EntertainmentDevice newDevice) {
        super(newDevice);
    }

    @Override
    public void buttonNinePressed() {
        System.out.println("TV was muted");
    }
}
