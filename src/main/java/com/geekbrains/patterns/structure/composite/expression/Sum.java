package com.geekbrains.patterns.structure.composite.expression;

public class Sum extends BinaryExpression {

    protected Sum(Expression left, Expression right) {
        super(left, right, (l, r) -> l.eval() + r.eval());
    }

    @Override
    public String asString() {
        return String.format("(%s + %s)", getLeft().asString(), getRight().asString());
    }
}
