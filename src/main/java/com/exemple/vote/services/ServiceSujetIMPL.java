package com.exemple.vote.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.exemple.vote.entities.sujet;
import com.exemple.vote.repositories.SujetRepository;

public class ServiceSujetIMPL implements IServiceSujet {
	
	@Autowired
	private SujetRepository sujetRepository;

	@Override
	public void addSujet(sujet sujet) {
		sujetRepository.save(sujet);
		
	}

	@Override
	public List<sujet> getAll() {
		return sujetRepository.findAll();
	}

	@Override
	public void voterPour(sujet sujet) {
		sujet.setVotePour(sujet.getVotePour() +1);
	}

	@Override
	public void voterContre(sujet sujet) {
		sujet.setVoteContre(sujet.getVoteContre() +1);
	}

}
