package com.hrishikesh.dp.singletonpattern;

import com.hrishikesh.dp.singletonpattern.volitions.SingletonVolitionByReflection;

/**
 * @author hrishikesh.mishra
 */
public class SingletonTest {

    public static void main(String[] args) {
        SingletonVolitionByReflection instance1 = SingletonVolitionByReflection.getInstance();
        SingletonVolitionByReflection instance2 = SingletonVolitionByReflection.getInstance();


        System.out.println("Instance 1 : " + instance1.hashCode());
        System.out.println("Instance 2 : " + instance2.hashCode());

    }
}
