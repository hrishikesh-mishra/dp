package com.hrishikesh.dp.builderpattern;

/**
 * @author hrishikesh.mishra
 */
public class TestRobotBuilder {

    public static void main(String[] args) {
        RobotBuilder robotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
        robotEngineer.makeRobot();
        Robot robot = robotEngineer.getRobot();

        System.out.println("Robot: " + robot);
    }
}
