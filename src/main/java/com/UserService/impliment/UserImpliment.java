package com.UserService.impliment;
import com.UserService.entity.User;
import com.UserService.exception.ResourceNotFoundException;
import com.UserService.reposetory.UserReposetory;
import com.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class UserImpliment implements UserService {

    @Autowired
    private UserReposetory userReposetory;

    @Override
    public User saveuser(User user) {
        //generate unic userid
        String randomUserId = UUID.randomUUID().toString();
        user.setUserid(randomUserId);
        return userReposetory.save(user);
    }

    @Override
    public List<User> getalluser() {
        return userReposetory.findAll();
    }

    @Override
    public User getuser(String userid) {
        return userReposetory.findById(userid).orElseThrow(()->new ResourceNotFoundException("User with given id is not fount on server !!"+userid));
    }
}
