package com.axxes.exercises;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAll(final Exception e) {
        return new ResponseEntity<>("A general error occured", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ModelAndView handleSpecific(final Exception e) {
        final ModelAndView view = new ModelAndView("exceptionView");
        view.addObject("message", "An IllegalArgument occurred.");
        return view;
    }

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
