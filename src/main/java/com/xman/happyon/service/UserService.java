package com.xman.happyon.service;

import com.xman.happyon.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();
        User user1=new User(1,"Hans",23,"hans@email.com");
        User user2=new User(2,"Ben",52,"Bens@email.com");
        User user3=new User(3,"Adam",32,"Adam@email.com");
        User user4=new User(4,"Eva",32,"Eva@email.com");
        userList.addAll(Arrays.asList(user1,user2,user3,user4));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }

        }
        return optional;
    }
}
