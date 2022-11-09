package com.javaprogram.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaprogram.lms.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
