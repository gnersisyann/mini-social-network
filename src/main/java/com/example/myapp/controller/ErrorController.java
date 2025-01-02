package com.example.myapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(Exception.class) // Обрабатывает все исключения
    public String handleException(Exception e, Model model) {
        model.addAttribute("errorMessage", e.getMessage()); // Добавляем сообщение ошибки в модель
        return "error"; // Возвращаем имя страницы ошибки (error.html)
    }
}
