package com.example.myapp.controller;

import com.example.myapp.model.User;
import com.example.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller // Указывает, что это контроллер для HTML-шаблонов
@RequestMapping("/users")
public class UserViewController {

    @Autowired
    private UserService userService; // Экземпляр сервиса, который будет использоваться для вызова методов

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register"; // Возвращает шаблон register.html из папки templates
    }

    @GetMapping("/find")
    public String showFindForm() {
        return "find"; // Возвращает шаблон find.html из папки templates
    }

    @GetMapping("/findUser")
    public String findUser(String username, Model model) {
        // Ищем пользователя по имени
        User user = userService.findUserByUsername(username);
        
        if (user != null) {
            model.addAttribute("user", user); // Передаем найденного пользователя в модель
        } else {
            model.addAttribute("errorMessage", "Пользователь не найден");
        }
        
        return "find"; // Возвращаем тот же шаблон, где отобразим пользователя или сообщение об ошибке
    }
}
