package com.UserService.reposetory;

import com.UserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserReposetory extends JpaRepository<User,String> {

}
