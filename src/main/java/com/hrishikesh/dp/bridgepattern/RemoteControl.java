package com.hrishikesh.dp.bridgepattern;

/**
 * @author hrishikesh.mishra
 */
public abstract class RemoteControl {
    private EntertainmentDevice theDevice;

    public RemoteControl(EntertainmentDevice newDevice){
        theDevice = newDevice;
    }

    public void buttonFivePressed(){
        theDevice.buttonFivePressed();
    }

    public void buttonSixPressed(){
        theDevice.buttonSixPressed();
    }

    public void deviceFeedback(){
        theDevice.deviceFeedback();
    }

    public abstract void buttonNinePressed();
}
