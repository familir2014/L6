package com.geekbrains.patterns.arch1;

import lombok.Data;
import lombok.Value;

@Value
public class Pair<L, R> {

    L left;
    R right;

}
