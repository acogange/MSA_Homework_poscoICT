package com.example.userService.UserRepository;

import com.example.userService.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    UserEntity findUserByUseridAndPassword(String userid, String password);



}
