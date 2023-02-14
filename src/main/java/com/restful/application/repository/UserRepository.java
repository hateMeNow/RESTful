package com.restful.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.application.repository.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
