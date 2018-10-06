package pl.sda.bestgroup.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.sda.bestgroup.service.UserService;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody CreateUserRequest request) {
        userService.createUser(request);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam String id) {
        userService.deleteUser(id);
    }

    @PutMapping("/update/{id}")
    public void editUser(@PathVariable String id, RequestBody) {
        userService.editUser(id, request);
    }

}
