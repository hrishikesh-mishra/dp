package com.hrishikesh.dp.singletonpattern.impl;

import java.io.Serializable;

/**
 * Singleton Pattern
 *
 * @author hrishikesh.mishra
 */
public class Singleton implements Cloneable, Serializable {

    private static volatile Singleton instance;

    private Singleton() {
        /** Fix for reflection but not for all cases **/
        if (instance != null) {
            throw new RuntimeException("Creating of this object is not allowed.");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            /** Fix for multi-threading **/
            synchronized (Singleton.class) {
                /** Double checking **/
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /**
     * Fix for cloning
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone not support for Singleton ");
    }

    /**
     * @return
     */
    private Object readResolve() {
        return instance;
    }
}

class SingletonTest {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        print("instance1", instance1.hashCode());
        print("instance2", instance2.hashCode());
    }

    public static void print(String name, int hashcode) {
        System.out.printf("Instance: %s, hashcode: %d \n", name, hashcode);
    }
}
