package com.hrishikesh.dp.singletonpattern.impl;

/**
 * Singleton Pattern Using static class
 *
 * @author hrishikesh.mishra
 */
public class SingletonByHolder {

    private SingletonByHolder() {
    }

    public static SingletonByHolder getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        static final SingletonByHolder INSTANCE = new SingletonByHolder();
    }
}


class SingletonByHolderTest {
    public static void main(String[] args) {
        SingletonByHolder instance1 = SingletonByHolder.getInstance();
        SingletonByHolder instance2 = SingletonByHolder.getInstance();

        print("instance1", instance1.hashCode());
        print("instance2", instance2.hashCode());


    }

    private static void print(String name, int hashcode) {
        System.out.printf("Instance: %s, hashcode: %d \n", name, hashcode);
    }
}