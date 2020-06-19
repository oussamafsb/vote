package com.exemple.vote.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.vote.entities.ConfirmationToken;



public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long>  {
	
	ConfirmationToken findByConfirmationToken(String confirmationToken);
	
	
}
