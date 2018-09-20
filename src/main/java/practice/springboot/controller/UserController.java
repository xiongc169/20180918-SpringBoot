package practice.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping("/user")
public class UserController {

    /**
     * http://127.0.0.1:8080/user/welcome
     *
     * @return
     */
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @ResponseBody
    @RequestMapping("/login")
    public String login(String name, String password) {
        if (name != null && name.equals("sa") && password != null && password.equals("123456")) {
            return "Login Success";
        }
        return "Login Failure";
    }
}
