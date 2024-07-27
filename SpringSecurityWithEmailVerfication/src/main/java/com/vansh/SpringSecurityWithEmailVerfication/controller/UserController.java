package com.vansh.SpringSecurityWithEmailVerfication.controller;

import com.vansh.SpringSecurityWithEmailVerfication.model.User;
import com.vansh.SpringSecurityWithEmailVerfication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public ResponseEntity<User> authenticateUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User currentUser = (User) authentication.getPrincipal();
        return ResponseEntity.ok(currentUser);
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(userService.getAllUser());
    }
}
