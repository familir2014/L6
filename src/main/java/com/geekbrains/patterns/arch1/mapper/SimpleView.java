package com.geekbrains.patterns.arch1.mapper;

import lombok.Data;
import lombok.NoArgsConstructor;

// ApiModel
//
@Data
@NoArgsConstructor
public class SimpleView {

    //JsonValue
    private Long id;
    //JsonValue
    private String name;
    //JsonValue
    private Property property;

}
