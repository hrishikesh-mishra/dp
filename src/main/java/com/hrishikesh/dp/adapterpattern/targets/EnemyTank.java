package com.hrishikesh.dp.adapterpattern.targets;

import java.util.Random;

/**
 *  Target Object That Client Except
 * @author hrishikesh.mishra
 */
public class EnemyTank implements EnemyAttacker {

    private final Random random = new Random();


    @Override
    public void fireWeapon() {
        int attackDamage = random.nextInt(100) + 10;
        System.out.printf("Enemy Tank Does  %d Damages.\n" , attackDamage);
    }

    @Override
    public void driveForward() {
        int movement = random.nextInt(100) + 10;
        System.out.printf("Enemy Tank Moved %d .\n", movement);
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.printf("%s Drives the tank.\n", driverName);
    }
}
