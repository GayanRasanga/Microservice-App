package com.UserService.service;

import com.UserService.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    //User Operation

    //create new user
    User saveuser(User user);

    //get All User
    List<User> getalluser();

    //get single user of given userId
    User getuser(String userid);


    //TODO:DELETE
    //TODO:UPDATE
}
