package com.example.step12.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
class CommonExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public String exception(Exception e, Model model) {
        log.error("Exception: {}", e.getMessage());

        model.addAttribute("exception", e);

        return "error-page";
    }
}
