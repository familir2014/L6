package com.geekbrains.patterns.behavior;

import java.util.ArrayList;
import java.util.List;

public class Chain {

    private List<ChainItem> chain;

    public Chain() {
        chain = new ArrayList<>();
    }


    public void add(ChainItem ... items) {
        chain.addAll(List.of(items));
    }

    public Object process(Object o) {
        Object cur = o;
        for (ChainItem chainItem : chain) {
            cur = chainItem.consume(cur);
        }
        return cur;
    }


}
