package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import app.services.UserService;
import app.models.User;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/home")
    public String findAll(Model model) {
        model.addAttribute("users", userService.findAll());
        return "home";
    }

    @GetMapping(value = "/add")
    public String addUserForm(User user) {
        return "add";
    }

    @PostMapping(value = "/add")
    public String addUser(User user) {
        userService.save(user);
        return "redirect:/home";
    }

    @GetMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/home";
    }

    @GetMapping(value = "/update/{id}")
    public String editUserForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "update";
    }

    @PostMapping(value = "/update")
    public String updateUser(User user) {
        userService.save(user);
        return "redirect:/home";
    }

    @ExceptionHandler
    public String error() {
        return "error";
    }
}