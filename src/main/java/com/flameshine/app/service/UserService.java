package com.flameshine.app.service;

import java.util.List;

import com.flameshine.app.model.User;

public interface UserService {

    User findById(Long id);

    List<User> findAll();

    void save(User user);

    void deleteById(Long id);
}