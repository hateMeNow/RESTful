package com.restful.application.service;

import java.util.List;

import com.restful.application.repository.entity.User;

public interface RestService {

    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
	
}
