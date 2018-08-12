package com.axxes.exercises;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExampleController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExampleController.class);

    @GetMapping("/test")
    public String exampleMethod(final Model model) {
        LOGGER.info("The request was received.");
        model.addAttribute("message", "The request was received.");
        return "exampleView";
    }
}
