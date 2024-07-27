package com.vansh.SpringSecurityWithEmailVerfication.service;

import com.vansh.SpringSecurityWithEmailVerfication.model.User;
import com.vansh.SpringSecurityWithEmailVerfication.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUser(){

        return userRepo.findAll();
    }
}
