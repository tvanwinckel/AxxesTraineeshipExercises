package com.axxes.exercises.interception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/extra")
public class ExtraRequestController {

    @PostMapping
    public String postMapping(final Model model) {
        model.addAttribute("message", "POST mapping at the extra endpoint");
        return "requestMappingView";
    }

}
