package com.beans;

public class Client {
	
	int id ;
	String nom ;
	String prenom ;
	String email ;
	
	public Client( int id , String nom , String prenom , String email ) {
		
		this.id = id ;
		this.nom = nom ;
		this.prenom = prenom ;
		this.email = email ;
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
