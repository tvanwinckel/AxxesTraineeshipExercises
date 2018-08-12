package com.axxes.exercises;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
public class ModelController {

    @GetMapping("/model")
    public String model(final Model model) {
        model.addAttribute("message", "modelAttribute");
        return "requestMappingView";
    }

    @GetMapping("/modelWithMap")
    public String modelWithMap(final Model model) {
        final HashMap<String, String> map = new HashMap<>();
        map.put("message", "modelWithMap");
        model.mergeAttributes(map);
        return "requestMappingView";
    }

    @GetMapping("/modelMap")
    public String modelMap(final ModelMap modelMap) {
        modelMap.addAttribute("message", "modelMap");
        return "requestMappingView";
    }

    @GetMapping("/modelAndView")
    public ModelAndView modelAndView() {
        final ModelAndView view = new ModelAndView("requestMappingView");
        view.addObject("message", "modelAndView");
        return view;
    }
}
