package com.jarana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping
    @ResponseBody
    public String sayHello(Model model) {

            model.addAttribute("greeting", "Hello World from Controller");
            return "Welcome_to_my_first_web_services";
    }

}
