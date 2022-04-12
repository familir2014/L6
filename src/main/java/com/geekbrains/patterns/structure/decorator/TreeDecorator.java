package com.geekbrains.patterns.structure.decorator;

public class TreeDecorator extends Tree {

    private final Tree tree;

    public TreeDecorator(Tree tree) {
        this.tree = tree;
    }

    @Override
    void decorate() {
        tree.decorate();
    }
}
