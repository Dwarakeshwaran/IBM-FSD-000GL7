package com.spring.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.user_service.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
