package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class DAOLivroBanco implements IDAOLivro{
	
	private String tipoDoBanco;
	
	public List<String> buscaAutor(String nome) {
		List<String> livros = new ArrayList<String>();
		
		livros.add("Livro banco de dados");
				
		return livros;
	}

	public String getTipoDoBanco() {
		return tipoDoBanco;
	}

	public void setTipoDoBanco(String tipoDoBanco) {
		this.tipoDoBanco = tipoDoBanco;
	}
	
}
