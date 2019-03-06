package com.dao;

import java.util.ArrayList;

import com.beans.Article;


public interface IArticle {
	
	public int AddArticle( Article article);
	public int AddArticle(String nom,float prix,int note);
	public Article FindArticle(int id);
	public int deleteArticle(int id);
	public int updateArticle(int id,Article article);
	public ArrayList<Article> AllProduit();

}
