package com.hrishikesh.dp.singletonpattern.volitions;

/**
 * Singleton:
 * Singleton volition through Multi-threading Example
 *
 * @author hrishikesh.mishra
 */
public class SingletonVolitionByMultiThreading {

    private static SingletonVolitionByMultiThreading instance;

    private SingletonVolitionByMultiThreading() {
    }

    public static SingletonVolitionByMultiThreading getInstance() {

        if (instance == null) {
            instance = new SingletonVolitionByMultiThreading();
        }

        return instance;
    }
}

class SingletonVolitionByMultiThreadingTest {

    public static void main(String[] args) throws InterruptedException {

        /** Sometime instance will same and sometime different **/
        Thread thread1 = new Thread(() -> {
            SingletonVolitionByMultiThreading instance1 = SingletonVolitionByMultiThreading.getInstance();
            print("instance1", instance1.hashCode());
        });

        Thread thread2 = new Thread(() -> {
            SingletonVolitionByMultiThreading instance2 = SingletonVolitionByMultiThreading.getInstance();
            print("instance2", instance2.hashCode());
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    private static void print(String name, int hashcode) {
        System.out.printf("Instance: %s, hashcode: %d \n", name, hashcode);
    }
}


