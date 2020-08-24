package com.javabycode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    public class HelloWorldController {

@RequestMapping("/")
@ResponseBody
public String sayHello() {
return "Hello World Developer!!!";
}
}
