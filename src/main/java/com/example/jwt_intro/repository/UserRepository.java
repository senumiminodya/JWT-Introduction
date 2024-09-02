package com.example.jwt_intro.repository;

import com.example.jwt_intro.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

    User findByEmail(String username);

    boolean existsByEmail (String userName);

    int deleteByEmail(String userName);


}
