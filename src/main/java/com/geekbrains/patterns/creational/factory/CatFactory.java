package com.geekbrains.patterns.creational.factory;

import com.geekbrains.patterns.creational.model.Cat;

public class CatFactory extends AnimalFactory {

    @Override
    public Cat getAnimal() {
        return new Cat();
    }
}
