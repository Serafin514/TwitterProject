package pl.sda.bestgroup.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.sda.bestgroup.domain.CreateUserRequest;
import pl.sda.bestgroup.domain.EditUserRequest;
import pl.sda.bestgroup.domain.User;
import pl.sda.bestgroup.service.UserService;

import javax.validation.Valid;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PutMapping("/user/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody @Valid CreateUserRequest request) {
        userService.createUser(request);
    }

    @GetMapping("/user/all")
    public Page<User> findAllUsers(@PageableDefault(size = 4) Pageable pageable) {
        return userService.findAllBy(pageable);
    }

    @GetMapping("/user/{login}")
    public User findUserByLogin(@PathVariable String login) {
        return userService.findByLogin(login);
    }


    @DeleteMapping("/delete")
    public Page<User> deleteUser(@RequestParam String id, @PageableDefault(size = 4) Pageable pageable) {
        return userService.deleteUserById(id, pageable);
    }

    @PutMapping("/update/{id}")
    public void editUser(@PathVariable @Valid String id, @RequestBody EditUserRequest request) {
        userService.editUser(id, request);
    }
}
