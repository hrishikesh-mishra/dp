package com.hrishikesh.dp.prototypepattern;

/**
 * @author hrishikesh.mishra
 */
public class TestCloning {

    public static void main(String[] args) {
        CloneFactory cloneFactory = new CloneFactory();

        Sheep sheep1 =  new Sheep();

        Sheep sheepClone  = (Sheep) cloneFactory.getClone(sheep1);

        System.out.println(sheep1);
        System.out.println(sheepClone);

        System.out.println("Sheep1 hashcode: " + sheep1.hashCode());
        System.out.println("Clone Sheep " + sheepClone.hashCode());

    }

}
