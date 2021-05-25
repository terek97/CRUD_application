package ru.kurbanmagomedov.springCRUD.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import ru.kurbanmagomedov.springCRUD.models.User;
import ru.kurbanmagomedov.springCRUD.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("new_user", new User());
        return "users";
    }

    @GetMapping("/{id}")
    public String getUserByID(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
//        System.out.println(userService.getUserById(id));

        return "one_user";
    }

    @PostMapping()
    public RedirectView createUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return new RedirectView("/");
    }

    @PatchMapping("/change_user")
    public RedirectView changeUser(@ModelAttribute("user") User user) {
        userService.setUser(user);

        return new RedirectView("/");
    }

    @DeleteMapping("/{id}")
    public RedirectView removeUser(@PathVariable("id") int id) {
//        System.out.println(user.getId());
        userService.removeUser(id);
        return new RedirectView("/");
    }
}
