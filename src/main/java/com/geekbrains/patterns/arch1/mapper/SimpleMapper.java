package com.geekbrains.patterns.arch1.mapper;

public class SimpleMapper {

    public SimpleDomainModel mapViewToDomainModel(SimpleView view) {
        return SimpleDomainModel.builder()
                .id(view.getId())
                .name(view.getName())
                .property(view.getProperty())
                .build();
    }

}
