package com.hrishikesh.dp.adapterpattern.adaptees;

import java.util.Random;

/**
 * Adaptee Class
 * @author hrishikesh.mishra
 *
 */
public class EnemyRobot {

    private final Random random = new Random();

    public void smashWithHands(){
        int attachDamage = random.nextInt(100) + 5;
        System.out.printf("Enemy Robot cause %d damages with hands.\n", attachDamage);
    }


    public void walkForward(){
        int movements = random.nextInt(100) + 18;
        System.out.printf("Enemy Robot  %d moves forward.\n", movements);
    }

    public void reactToHuman(String humanName){
        System.out.printf("Enemy Robot Tramps on %s \n", humanName);
    }

}
