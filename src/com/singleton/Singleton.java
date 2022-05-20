package com.singleton;

import java.io.Serializable;

public class Singleton implements Cloneable, Serializable {
    private static boolean isFirstCallReflection = true;
    private static Singleton instance;

    private Singleton() {
        if (instance != null || isFirstCallReflection) {
            throw new IllegalStateException("Object can't be created using reflection for this class");
        }
    }

    public static Singleton getSingleton() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    isFirstCallReflection = false;
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
}
