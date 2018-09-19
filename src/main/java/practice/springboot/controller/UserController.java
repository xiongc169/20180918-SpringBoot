package practice.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/user")
public class UserController {

    @ResponseBody
    @RequestMapping("/login")
    public String login(String name, String password) {
        if (name != null && name.equals("sa") && password != null && password.equals("123456")) {
            return "Login Success";
        }
        return "Login Failure";
    }
}
