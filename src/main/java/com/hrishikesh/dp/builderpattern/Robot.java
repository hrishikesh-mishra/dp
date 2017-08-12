package com.hrishikesh.dp.builderpattern;

/**
 * @author hrishikesh.mishra
 */

public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;


    @Override
    public void setRobotHead(String head) {
        robotHead = head;
    }

    @Override
    public void setRobotTorso(String torso) {
        robotTorso = torso;
    }

    @Override
    public void setRobotArms(String arms) {
        robotArms = arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        robotLegs = legs;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotLegs() {
        return robotLegs;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + robotHead + '\'' +
                ", torso='" + robotTorso + '\'' +
                ", arms='" + robotArms + '\'' +
                ", legs='" + robotLegs + '\'' +
                '}';
    }
}
