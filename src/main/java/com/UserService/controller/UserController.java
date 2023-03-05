package com.UserService.controller;


import com.UserService.entity.User;
import com.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    /**
     *
     */
    @Autowired
    private UserService userService;

    //create new user
    @PostMapping
    public ResponseEntity<User> creatuser(@RequestBody User  user){
       User user1 =userService.saveuser(user);
       return ResponseEntity.status(HttpStatus.CREATED).body(user1);

    }


    //single user get
    @GetMapping("/{userId}")
    public ResponseEntity<User> getsingleuser(@PathVariable String userId){
        User user = userService.getuser(userId);
        return ResponseEntity.ok(user);

    }

    //all user get
    @GetMapping
    public ResponseEntity<List<User>> getalluser(){
        List<User> allUser = userService.getalluser();
        return ResponseEntity.ok(allUser);
    }

}
