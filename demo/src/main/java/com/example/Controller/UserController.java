package main.java.com.example.Controller;

import com.example.userservice.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
                new User(1, "Alice"),
                new User(2, "Bob")
        );
    }
}
