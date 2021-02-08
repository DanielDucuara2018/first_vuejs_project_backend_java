package com.danob22.app.ws.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.danob22.app.ws.entity.User;
import com.danob22.app.ws.repository.UsersRepository;

@Component
public class UserService {
	
	private UsersRepository usersRepository;

    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> getUsers() {
        return usersRepository.findAll();
    }
    
    public User saveUser(User users) {
    	return usersRepository.save(users);
    }
}
