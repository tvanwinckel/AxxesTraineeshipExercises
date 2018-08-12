package com.axxes.exercises.produce_consume;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProduceConsumeController {

    @PostMapping(path = "/consume", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String consumes(@RequestBody final SimpleObject simpleObject, final Model model) {
        model.addAttribute("message", simpleObject.toString());
        return "requestMappingView";
    }

    @GetMapping(path = "/produce", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public SimpleObject getSimpleObject() {
        return new SimpleObject("someString", 1);
    }
}
