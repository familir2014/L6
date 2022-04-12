package com.geekbrains.patterns.creational.factory;

import com.geekbrains.patterns.creational.model.Dog;

public class DogFactory extends AnimalFactory {

    @Override
    public Dog getAnimal() {
        return new Dog();
    }

}
