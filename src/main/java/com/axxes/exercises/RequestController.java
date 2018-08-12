package com.axxes.exercises;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestController {
    
    @PostMapping
    public String postMapping(final Model model) {
        model.addAttribute("message", "POST mapping");
        return "requestMappingView";
    }

    @RequestMapping(path = "/old-post", method = RequestMethod.POST)
    public String oldPostMapping(final Model model) {
        model.addAttribute("message", "old POST mapping");
        return "requestMappingView";
    }

    @GetMapping
    public String getMapping(final Model model) {
        model.addAttribute("message", "GET mapping");
        return "requestMappingView";
    }

    @PutMapping
    public String putMapping(final Model model) {
        model.addAttribute("message", "PUT mapping");
        return "requestMappingView";
    }

    @DeleteMapping
    public String deleteMapping(final Model model) {
        model.addAttribute("message", "DELETE mapping");
        return "requestMappingView";
    }

    @PatchMapping
    public String patchMapping(final Model model) {
        model.addAttribute("message", "PATCH mapping");
        return "requestMappingView";
    }
}
