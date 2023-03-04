package be.ifg.model;

import lombok.Builder;
import lombok.Getter;

//
@Getter
public class Person {

    private final String name;

    @Builder
    public Person(String name) {
        this.name = name;
    }
}
