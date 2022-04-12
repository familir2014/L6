package com.geekbrains.patterns.structure.composite.expression;

public class Test {

    public static void main(String[] args) {

        Expression expression = new Multiply(
                new Sum(
                        new Const(2),
                        new Multiply(new Const(3), new Const(4))),
                new Sum(new Const(5), new Const(7))
        );

        expression.print();

    }
}
