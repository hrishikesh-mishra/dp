package com.hrishikesh.dp.builderpattern;

/**
 * @author hrishikesh.mishra
 */
public interface RobotPlan {

    void setRobotHead(String head);

    void setRobotTorso(String torso);

    void setRobotArms(String arms);

    void setRobotLegs(String legs);
}
