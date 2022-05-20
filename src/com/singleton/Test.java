package com.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) throws Exception {


        Singleton singleton = Singleton.getSingleton();

        //Reflection
//        Constructor constructor = Singleton.class.getDeclaredConstructors()[0];
//        constructor.setAccessible(true);
//        Singleton singleton1 = (Singleton) constructor.newInstance();
//        Singleton singleton = Singleton.getSingleton();

        // Clone
       Singleton singleton1 = (Singleton) singleton.clone();

        //  Serialization and Deserialization
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("obj.ser"));
//        out.writeObject(singleton);
//        out.close();
//
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.ser"));
//        Singleton singleton1 = (Singleton) in.readObject();
//        in.close();

        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
