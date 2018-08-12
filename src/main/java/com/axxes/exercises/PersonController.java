package com.axxes.exercises;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    @GetMapping("/person")
    public String personForm(final Model model) {
        model.addAttribute("person", new Person());
        return "personForm";
    }

    @PostMapping("/person")
    public String personSubmit(@ModelAttribute final Person person) {
        return "personView";
    }
}
