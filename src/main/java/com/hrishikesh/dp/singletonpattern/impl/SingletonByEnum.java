package com.hrishikesh.dp.singletonpattern.impl;

/**
 *  Singleton Pattern Using ENUM
 * @author hrishikesh.mishra
 */
public enum SingletonByEnum {
    INSTANCE;

    public String getData() {
        return "Dummy Data.";
    }
}


class SingletonByEnumTest {
    public static void main(String[] args) {
        SingletonByEnum instance1 = SingletonByEnum.INSTANCE;
        SingletonByEnum instance2 = SingletonByEnum.INSTANCE;

        print("instance1", instance1.hashCode());
        print("instance2", instance2.hashCode());

    }

    public static void print(String name, int hashcode) {
        System.out.printf("Instance: %s, hashcode: %d \n", name, hashcode);
    }
}