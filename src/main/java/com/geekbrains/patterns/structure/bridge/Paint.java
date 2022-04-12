package com.geekbrains.patterns.structure.bridge;

public interface Paint {

    void fill(Shape shape);

    void stroke(Shape shape);

    void drawPoint(int x, int y);

}
