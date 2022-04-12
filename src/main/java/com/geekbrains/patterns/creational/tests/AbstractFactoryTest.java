package com.geekbrains.patterns.creational.tests;

import com.geekbrains.patterns.creational.factory.*;
import com.geekbrains.patterns.creational.factory_method.Pair;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executors;

public class AbstractFactoryTest {

    private static void createAnimalAndSay(AnimalFactory factory) {
        factory.getAnimal().say();
    }

    public static void main(String[] args) throws IOException {
        createAnimalAndSay(new CatFactory());
        createAnimalAndSay(new DogFactory());

        Logger logger = new Logger(new ConsoleResourceFactory());
        logger.log("Hello world");

        logger = new Logger(new FileResourceFactory("out.txt"));
        logger.log("Hello world");

        Executors.newFixedThreadPool(4);

        Pair<String, Integer> pair = Pair.of("Hello", 2);

        String left = pair.getLeft();
        Integer right = pair.getRight();

    }
}
