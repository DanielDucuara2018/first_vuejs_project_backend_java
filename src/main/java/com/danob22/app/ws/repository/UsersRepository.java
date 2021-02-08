package com.danob22.app.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danob22.app.ws.entity.User;

public interface UsersRepository extends JpaRepository<User, Integer>{

}
