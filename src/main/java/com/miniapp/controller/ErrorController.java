package com.miniapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorController {

    @GetMapping("/error")
    public String handleError(HttpServletRequest request) {
        Object error = request.getAttribute("javax.servlet.error.exception");
        request.setAttribute("error", error);
        return "error";
    }
} 