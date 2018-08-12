package com.axxes.exercises;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice(basePackages = "com.axxes.exercises")
public class ExceptionAdvice {

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
}
