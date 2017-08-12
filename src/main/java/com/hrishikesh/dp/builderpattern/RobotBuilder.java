package com.hrishikesh.dp.builderpattern;

/**
 * BluePrint of robot
 * @author hrishikesh.mishra
 */
public interface RobotBuilder {

    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotArms();
    void buildRobotLegs();
    Robot getRobot();
}
