package com.geekbrains.patterns.structure.proxy;

public class Test {

    public static void main(String[] args) {

        LongGetter getter = new LongGetter() {};

        LongGetter proxy = new LongGetterCached(getter);

        for (int i = 0; i < 5; i++) {
            System.out.println(proxy.getLong(100));
        }

    }
}
