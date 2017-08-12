package com.hrishikesh.dp.builderpattern;

/**
 * @author hrishikesh.mishra
 */
public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return robotBuilder.getRobot();
    }

    public void makeRobot(){
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotTorso();
        robotBuilder.buildRobotArms();
        robotBuilder.buildRobotLegs();
    }


}
