package com.business_prodject.Business.Project.services;

import com.business_prodject.Business.Project.entities.user;
import com.business_prodject.Business.Project.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService (UserRepo userRepo)  { this.userRepo = userRepo; }

    public List<user> findAllUsers() {
        return userRepo.findAll();
    }

}
