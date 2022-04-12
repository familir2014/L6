package com.geekbrains.patterns.behavior;

import com.geekbrains.patterns.behavior.listener.Event;
import com.geekbrains.patterns.behavior.listener.EventPool;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.function.Consumer;

public class Main {


    static void foo(Consumer<Integer> consumer, int x) {
        consumer.accept(x);
    }

    void chain() {
        Chain chain = new Chain();

        chain.add(
                object -> {
                    System.out.println(object);
                    return "123";
                },
                object -> {
                    String str = (String) object;
                    System.out.println(str);
                    return str.length();
                },
                object -> {
                    int len = (int) object;
                    len++;
                    System.out.println(len);
                    return len;
                }
        );

        chain.process("Hello world");
    }

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        EventPool eventPool = new EventPool();

        eventPool.registerListener(System.out::println);

        eventPool.start();


        while (in.hasNext()) {
            String s = in.next();
            eventPool.publishEvent(new Event(s));
        }

        Files.walkFileTree(Path.of(""), new SimpleFileVisitor<Path>() {

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                return super.visitFile(file, attrs);
            }
        });

        HashSet set;
        TreeSet set1;


    }
}
