package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class DAOLivroTxt implements IDAOLivro{

	private String arquivo;
	
	public List<String> buscaAutor(String nome) {
		List<String> livros = new ArrayList<String>();
		
		livros.add("Livro no txt!");
		
		return livros;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
}
