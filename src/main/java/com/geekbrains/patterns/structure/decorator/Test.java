package com.geekbrains.patterns.structure.decorator;

public class Test {

    public static void main(String[] args) {

        Tree tree = new Tree();

        TreeDecorator decorator = new BallsTreeDecorator(tree);

        decorator.decorate();

    }
}
