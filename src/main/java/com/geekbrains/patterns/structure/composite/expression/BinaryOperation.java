package com.geekbrains.patterns.structure.composite.expression;

public interface BinaryOperation {

    int apply(Expression left, Expression right);

}
