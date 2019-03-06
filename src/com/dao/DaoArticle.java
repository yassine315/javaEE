package com.dao;

import java.util.ArrayList;

import com.beans.Article;
import com.utile.DBInteraction;

public class DaoArticle implements IArticle {

	@Override
	public int AddArticle(Article article) {
		DBInteraction.connect();
		String sql="insert into achat (article,prix,note) values('"+article.getNom()+"',"+article.getPrix()+","+article.getNote()+");";
		int n = DBInteraction.modifier(sql);
		DBInteraction.disconnect();
		return n;
	}

	@Override
	public int AddArticle(String nom, float prix, int note) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Article FindArticle(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteArticle(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateArticle(int id, Article article) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Article> AllProduit() {
		// TODO Auto-generated method stub
		return null;
	}

}
