package com.beans;

public class Article {
	
	private int id  ;
	private String nom ;
	private float prix ;
	private int note ;
	
	public Article(int id, String nom, float prix, int note){
		this.id = id ;
		this.nom = nom ;
		this.prix = prix ;
		this.note = note ; 
	}
	
	public Article()
	{
		
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

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

}
