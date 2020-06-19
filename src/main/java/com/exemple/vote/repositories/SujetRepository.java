package com.exemple.vote.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.vote.entities.sujet;

@Repository
public interface SujetRepository extends JpaRepository<sujet, Long> {

}
