package com.hrishikesh.dp.singletonpattern.volitions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Singleton:
 * Singleton volitions through Serialize And Deserialize Example
 *
 * @author hrishikesh.mishra
 */
public class SingletonVolitionBySerializeAndDeserialize implements Serializable {

    private static SingletonVolitionBySerializeAndDeserialize instance =
            new SingletonVolitionBySerializeAndDeserialize();


    private SingletonVolitionBySerializeAndDeserialize() {
    }

    public static SingletonVolitionBySerializeAndDeserialize getInstance() {
        return instance;
    }
}


class SingletonVolitionBySerializeAndDeserializeTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /** Fetching instance **/
        SingletonVolitionBySerializeAndDeserialize instance1 = SingletonVolitionBySerializeAndDeserialize.getInstance();
        SingletonVolitionBySerializeAndDeserialize instance2 = SingletonVolitionBySerializeAndDeserialize.getInstance();

        print("instance1", instance1.hashCode());
        print("instance2", instance2.hashCode());

        /** Create instance from Serialize And Deserialize **/
        String fileName = "/tmp/singleton.obj";
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        outputStream.writeObject(instance1);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
        SingletonVolitionBySerializeAndDeserialize instance3 =
                (SingletonVolitionBySerializeAndDeserialize) inputStream.readObject();

        print("instance3", instance3.hashCode());
    }

    public static void print(String name, int hashcode) {
        System.out.printf("Instance: %s, hashcode: %d \n", name, hashcode);
    }

}