package com.app.feedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.feedback.entity.User;

public interface UserRepository extends JpaRepository< User, Integer>{

    
} 