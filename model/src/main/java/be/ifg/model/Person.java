package be.ifg.model;

import lombok.Builder;

public class Person {

    private String name;

    @Builder
    public Person(String name) {
        this.name = name;
    }
}
