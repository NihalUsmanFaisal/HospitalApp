package com.puttuboi.EurekaClient.service;

import com.puttuboi.EurekaClient.model.common.UserRegistrationRequest;
import com.puttuboi.EurekaClient.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void addUser(UserRegistrationRequest registrationRequest){
        if(!registrationRequest.getPassword().equals(registrationRequest.getConfirmPassword())){
            throw new
        }
    }
}
