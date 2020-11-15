package com.flameshine.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flameshine.app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}