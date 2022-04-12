package com.geekbrains.patterns.arch1.mapper;

import lombok.Data;

@Data
// #Entity
public class SimpleEntity {

    // set in persistent context
    private Long id;
    private String name;
    private String property;

}
