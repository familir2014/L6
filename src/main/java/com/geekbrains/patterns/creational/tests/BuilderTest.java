package com.geekbrains.patterns.creational.tests;

import com.geekbrains.patterns.creational.builder.User;

public class BuilderTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        User user = User.builder()
                .name("Ivan")
                .surname("Ivanov")
                .email("d@f.ch")
                .arr(new char[]{'a','b', 'c'})
                .phone("89112221111")
                .address("asfasf")
                .age(15)
                .height(180)
                .weight(80)
                .build();

        User clone = user.clone();
        System.out.println(clone);
        clone.getArr()[1] = '1';
        System.out.println(user);
    }
}
