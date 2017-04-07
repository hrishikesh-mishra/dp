package com.hrishikesh.dp.singletonpattern.volitions;

import java.lang.reflect.Constructor;

/**
 * Singleton:
 * Singleton volitions through Reflection Example
 *
 * @author hrishikesh.mishra
 */
public class SingletonVolitionByReflection {

    private static SingletonVolitionByReflection instance = new SingletonVolitionByReflection();

    private SingletonVolitionByReflection() {
    }

    public static SingletonVolitionByReflection getInstance() {
        return instance;
    }
}

class SingletonVolitionByReflectionTest {

    public static void main(String[] args) throws Exception {

        /** Creating singleton instances **/
        SingletonVolitionByReflection instance1 = SingletonVolitionByReflection.getInstance();
        SingletonVolitionByReflection instance2 = SingletonVolitionByReflection.getInstance();

        print("instance1", instance1.hashCode());
        print("instance2", instance2.hashCode());

        /** Creating instance by reflection **/
        String className = "com.hrishikesh.dp.singletonpattern.volitions.SingletonVolitionByReflection";
        Class<SingletonVolitionByReflection> aClass = (Class<SingletonVolitionByReflection>) Class.forName(className);
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        SingletonVolitionByReflection instance3 = (SingletonVolitionByReflection) declaredConstructor.newInstance();

        print("instance3", instance3.hashCode());
    }


    public static void print(String name, int hashcode) {
        System.out.printf("Instance: %s, hashcode: %d \n", name, hashcode);
    }

}


