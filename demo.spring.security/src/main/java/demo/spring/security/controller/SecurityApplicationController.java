package demo.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityApplicationController {

    @RequestMapping("/")
    public String home(){
        return "<h1>Welcome</h1>";
    }

    @RequestMapping("/user")
    public String user(){
        return "<h1>Welcome User</h1>";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "<h1>Welcome Admin</h1>";
    }

}
