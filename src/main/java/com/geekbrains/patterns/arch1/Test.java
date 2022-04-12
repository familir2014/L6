package com.geekbrains.patterns.arch1;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        Pair<Integer, Integer> p1 = new Pair<>(1, 1);
        Pair<Integer, Integer> p2 = new Pair<>(1, 1);

        Map<Pair<Integer, Integer>, Integer> map = new HashMap<>();

        map.put(p1, 4);
        map.put(p2, 5);

        System.out.println(map.size());

        System.out.println(map.get(p1));

        System.out.printf("%.16f", 1/6.);
        System.out.printf("%.16f", 1/6f);

        // 42 000 000 000 000
    }
}
