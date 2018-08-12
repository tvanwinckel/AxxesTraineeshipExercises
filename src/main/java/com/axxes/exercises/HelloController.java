package com.axxes.exercises;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public ModelAndView greetings(@RequestParam(name = "name", required = false, defaultValue = "World") final String name) {
        final ModelAndView view = new ModelAndView("helloView");
        view.addObject("name", name);
        return view;
    }
}
