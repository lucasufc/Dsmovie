package com.lucasmartins.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmartins.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
