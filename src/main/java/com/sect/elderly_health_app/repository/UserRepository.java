package com.sect.elderly_health_app.repository;

import com.sect.elderly_health_app.model.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<LoginUser, Long> {
    LoginUser findByUsername(String username);

}