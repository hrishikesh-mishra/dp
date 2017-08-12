package com.hrishikesh.dp.bridgepattern;

/**
 * @author hrishikesh.mishra
 */
public class TestTheRemote {

    public static void main(String[] args) {
        RemoteControl theTV  = new TVRemoteControlWithMuteButton( new TVDevice(1, 200));
        RemoteControl theTV2  = new TVRemoteControlWithPauseButton( new TVDevice(1, 200));

        System.out.println("The TV with mute");
        theTV.buttonFivePressed();
        theTV.buttonSixPressed();
        theTV.buttonNinePressed();


        System.out.println("\nThe TV with pause");
        theTV2.buttonFivePressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonSixPressed();
        theTV2.buttonNinePressed();
        theTV2.deviceFeedback();
    }
}
