package com.example.demo;

public class Cliente {
	
	private IDAOLivro idaoLivro;
	
	public Cliente() {
	}

	public IDAOLivro getIdaoLivro() {
		return idaoLivro;
	}

	public void setIdaoLivro(IDAOLivro idaoLivro) {
		this.idaoLivro = idaoLivro;
	}
	
	public void Busca() {
		
		System.out.print(idaoLivro.buscaAutor("João"));
	}
}
