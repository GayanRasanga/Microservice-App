package com.UserService.reposetory;

import com.UserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface UserReposetory extends JpaRepository<User,String> {

}
