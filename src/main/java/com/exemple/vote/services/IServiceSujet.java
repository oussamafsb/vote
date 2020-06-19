package com.exemple.vote.services;

import java.util.List;

import com.exemple.vote.entities.sujet;

public interface IServiceSujet {
	public void addSujet (sujet sujet);
	public List<sujet> getAll();
	public void voterPour(sujet sujet);
	public void voterContre(sujet sujet);
	
}
