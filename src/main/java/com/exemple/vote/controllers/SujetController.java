package com.exemple.vote.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.vote.entities.sujet;
import com.exemple.vote.services.ServiceSujetIMPL;
@CrossOrigin(origins = "*")
@RestController
public class SujetController {
	@Autowired
	private ServiceSujetIMPL sujetService ;
	
	
	@PostMapping(value = "/ajoutersujet")
	public void addSujet(sujet sujet) {
		sujetService.addSujet(sujet);
	}
	
	@GetMapping(value = "/sujets")
	public List<sujet> listeSujets(){
		return sujetService.getAll();
	}
	

	
	@PostMapping(value = "/voterpour")
	public void voterPour(sujet sujet) {
		sujetService.voterPour(sujet);
	}
	
	
	@PostMapping(value = "/votercontre")
	public void voterContre(sujet sujet) {
		sujetService.voterContre(sujet);
	}
	
}
