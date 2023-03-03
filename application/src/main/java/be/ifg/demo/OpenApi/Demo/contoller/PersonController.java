package be.ifg.demo.OpenApi.Demo.contoller;

import be.ifg.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @GetMapping("/api/persons")
    public ResponseEntity<List<Person>> findPersons() {
        List<Person> result = List.of(
                Person.builder().name("John").build(),
                Person.builder().name("Mark").build()
        );

        return ResponseEntity.ok(result);
    }
}
