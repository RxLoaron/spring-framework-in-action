package springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lyp3314@gmail.com on 2017/9/7.
 */

@Controller
public class Hello {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "jsp/hello";
    }
}
