package aws.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String main() {
        return "Main Page";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
