package be.ifg.demo.OpenApi.Demo.contoller;

import be.vlaanderen.ajh.ifg.api.server.UserApi;
import be.vlaanderen.ajh.ifg.api.server.transferobjects.UserDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Override
    public ResponseEntity<UserDTO> saveUser(@Valid @RequestBody UserDTO userDTO) {
        // TODO check this
        return ResponseEntity.ok(
                new UserDTO()
                        .email("email@host.com")
                        .firstName("John")
                        .lastName("Doe")
        );
    }
}
