package com.exemple.vote.services;

import java.util.List;

import com.exemple.vote.entities.User;

public interface IServiceUser {

	public void register(User u);
	public List<User> getAll();
	public void delete(int id);
    public User findById(int id);
    public User finByUsername(String username);
    public User finByEmail(String email);
}
