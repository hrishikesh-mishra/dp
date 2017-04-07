package com.hrishikesh.dp.singletonpattern.volitions;

/**
 * Singleton:
 * Singleton volitions through Clone Example
 *
 * @author hrishikesh.mishra
 */
public class SingletonVolitionByClone implements Cloneable {

    private static SingletonVolitionByClone instance = new SingletonVolitionByClone();

    private SingletonVolitionByClone() {
    }

    public static SingletonVolitionByClone getInstance() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class SingletonVolitionByCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        /** Fetching instances **/
        SingletonVolitionByClone instance1 = SingletonVolitionByClone.getInstance();
        SingletonVolitionByClone instance2 = SingletonVolitionByClone.getInstance();
        print("instance1", instance1.hashCode());
        print("instance2", instance2.hashCode());

        /** Creating object through clone **/
        SingletonVolitionByClone instance3 = (SingletonVolitionByClone) instance1.clone();
        print("instance3", instance3.hashCode());

    }

    private static void print(String name, int hashcode) {
        System.out.printf("Instance: %s, hashcode: %d \n", name, hashcode);
    }

}

