package com.jun.model;

public class Pessoa extends Avatar {

	public Pessoa(String nome, int idade, GENERO genero) {
		
		setNome(nome);
		setIdade(idade);
		setGenero(genero);
		
	}
	@Override
	public String getDescricao() {
		
		return "Nome: "+getNome()+ " Idade: "+getIdade()+" Genero: "+getGenero()+ "\nPersonalidade: ";
	}

}
