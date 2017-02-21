package com.tapdevs.backend.service;

import com.tapdevs.backend.model.User;

import java.util.List;

/**
 * Created by Tapdevs on 16/02/2017.
 */
public interface UserService {

    User findById(long id);

    User findByName(String name);

    User loginUser(String name, String password);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);

}