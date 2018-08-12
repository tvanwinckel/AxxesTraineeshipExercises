package com.axxes.exercises;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VariableController {

    @PostMapping("/string")
    public String stringMapping(@RequestParam(name = "param", required = false, defaultValue = "DEFAULT") final String param,
                                final Model model) {
        model.addAttribute("message", "The request parameter is: " + param);
        return "requestMappingView";
    }

    @PostMapping("/int")
    public String intMapping(@RequestParam(name = "param") final int param,
                             final Model model) {
        model.addAttribute("message", "The request parameter is: " + param);
        return "requestMappingView";
    }

    @GetMapping("/{int}")
    public String postMapping(@PathVariable(name = "int") final int param,
                              final Model model) {
        model.addAttribute("message", "The request parameter is: " + param);
        return "requestMappingView";
    }
}
