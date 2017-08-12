package com.hrishikesh.dp.adapterpattern.adapters;

import com.hrishikesh.dp.adapterpattern.targets.EnemyAttacker;
import com.hrishikesh.dp.adapterpattern.adaptees.EnemyRobot;

/**
 * Adapter Class
 * @author hrishikesh.mishra
 */
public class EnemyRobotAdapter implements EnemyAttacker {

    private final EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot robot) {
        this.robot = robot;
    }

    @Override
    public void fireWeapon() {
        robot.smashWithHands();
    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {
        robot.reactToHuman(driverName);
    }
}
