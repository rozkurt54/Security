package com.rozkurt.Security.controller.user;

import com.rozkurt.Security.business.abstracts.UserService;
import com.rozkurt.Security.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable Long id) {
        return userService.getOne(id);
    }

    @PostMapping
    public User addOne(@RequestBody User user) {
        return userService.add(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

    @DeleteMapping("/{id}")
    public Boolean deActivate(@PathVariable Long id) {
        return userService.deActivate(id);
    }


}
