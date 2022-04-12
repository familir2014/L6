package com.geekbrains.patterns.creational.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User implements Cloneable {

    private String name;
    private char[] arr;
    private final String surname;
    private final String email;
    private final String address;
    private final String phone;
    private final int age;
    private final int weight;
    private final int height;

    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

}
