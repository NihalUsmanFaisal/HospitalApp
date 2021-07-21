package com.puttuboi.EurekaClient.repository;

import com.puttuboi.EurekaClient.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    
}
