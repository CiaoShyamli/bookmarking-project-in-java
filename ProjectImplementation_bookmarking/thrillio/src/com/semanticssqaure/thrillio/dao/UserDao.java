package com.semanticssqaure.thrillio.dao;

import com.semanticssqaure.thrillio.DataStore;
import com.semanticssqaure.thrillio.entities.User;

public class UserDao {

	public User[] getUsers()
	{
		return DataStore.getUsers();
	}
}
