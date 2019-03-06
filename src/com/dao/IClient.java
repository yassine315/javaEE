package com.dao;

import com.beans.Client;

public interface IClient {

	public void AddClient(Client client);
	public Client Auth(String log,String pass);

}
