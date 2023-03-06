package be.ifg.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class PersonTest {

    @Test
    void name() {
        Person person = Person.builder().name("John").build();
        assertThat(person.name()).isEqualTo("John");
    }
}