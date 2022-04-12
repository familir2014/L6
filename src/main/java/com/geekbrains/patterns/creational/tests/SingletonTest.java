package com.geekbrains.patterns.creational.tests;

import com.geekbrains.patterns.creational.singleton.Singleton;

public class SingletonTest {

    private static void foo() {
        Singleton.getInstance().printHello();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(SingletonTest::foo).start();
        }

    }
}
