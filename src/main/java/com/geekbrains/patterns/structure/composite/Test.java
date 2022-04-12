package com.geekbrains.patterns.structure.composite;

import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {

        Item root = new Dir(
                List.of(
                        new ImageFile("1"),
                        new ImageFile("2"),
                        new ImageFile("3"),
                        new ImageFile("4"),
                        new Dir(
                                List.of(
                                        new ImageFile("1"),
                                        new ImageFile("2"),
                                        new Dir(
                                                List.of(
                                                        new ImageFile("1"),
                                                        new ImageFile("2")
                                                )
                                        )
                                )
                        )
                )
        );

        System.out.println(root);
    }
}
