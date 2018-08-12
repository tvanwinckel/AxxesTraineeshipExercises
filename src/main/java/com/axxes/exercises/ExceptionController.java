package com.axxes.exercises;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExceptionController {

    @GetMapping("/illegalException")
    public String illegalException(final Model model) {
        throw new IllegalArgumentException();
    }

    @GetMapping("/exception1")
    public String exception1(final Model model) throws Exception {
        throw new Exception();
    }

    @GetMapping("/exception2")
    public String exception2(final Model model) {
        throw new ArrayStoreException();
    }

    @GetMapping("/exception3")
    public String exception3(final Model model) throws Exception {
        throw new IllegalAccessException();
    }
}
