package com.hrishikesh.dp.adapterpattern;

import com.hrishikesh.dp.adapterpattern.adaptees.EnemyRobot;
import com.hrishikesh.dp.adapterpattern.adapters.EnemyRobotAdapter;
import com.hrishikesh.dp.adapterpattern.targets.EnemyAttacker;
import com.hrishikesh.dp.adapterpattern.targets.EnemyTank;

/**
 * @author hrishikesh.mishra
 */
public class TestEnemyAttackers {

    public static void main(String[] args) {
        EnemyAttacker tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();

        EnemyAttacker attacker = new EnemyRobotAdapter(robot);

        System.out.println("The Robot: ");
        robot.reactToHuman("Deen");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println("\n\nThe Enemy Tank: ");
        tank.assignDriver("Kumar");
        tank.driveForward();
        tank.fireWeapon();

        System.out.println("\n\nThe Robot Adapter : ");
        attacker.assignDriver("Alan");
        attacker.driveForward();
        attacker.fireWeapon();

    }
}
