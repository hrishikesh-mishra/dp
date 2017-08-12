package com.hrishikesh.dp.bridgepattern;

/**
 * @author hrishikesh.mishra
 */
public abstract class EntertainmentDevice {

    protected int deviceStatus;

    protected int maxSetting;

    protected int volumeSetting =0 ;

    public abstract void buttonFivePressed();

    public abstract void buttonSixPressed();

    public void deviceFeedback(){
        if (deviceStatus > maxSetting || deviceStatus < 0){
            System.out.println("On " + deviceStatus);
        }
    }

    public void buttonSevenPressed(){

        volumeSetting++;
        System.out.println("Volume at : " + volumeSetting);
    }


    public void buttonEightPressed(){

        volumeSetting--;
        System.out.println("Volume at : " + volumeSetting);
    }

}
