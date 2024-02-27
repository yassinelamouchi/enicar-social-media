package Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/User")
public class UserController {

    //Create random user
    @RequestMapping("/create")
    public String createUser() {
        return "User created";
    }



}