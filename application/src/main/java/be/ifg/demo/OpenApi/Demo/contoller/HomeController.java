package be.ifg.demo.OpenApi.Demo.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://localhost:8081/demo/home
 * <p>
 * SwaggerUi: http://localhost:8081/demo/swagger-ui/index.html
 */
@RestController
public class HomeController {

    @GetMapping(path = "/home")
    public String home() {
        return "Home";
    }
}
