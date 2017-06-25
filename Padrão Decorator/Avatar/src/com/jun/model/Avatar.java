package com.jun.model;

public abstract class Avatar {
	
	private String Nome;
	private int Idade;
	private GENERO Genero;
	public static enum GENERO {Masculino, Feminino}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return Nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		Nome = nome;
	}
	/**
	 * @return the idade
	 */
	public int getIdade() {
		return Idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		Idade = idade;
	}
	/**
	 * @return the genero
	 */
	public GENERO getGenero() {
		return Genero;
	}
	/**
	 * @param genero the genero to set
	 */
	public void setGenero(GENERO genero) {
		Genero = genero;
	}; 
	
	public abstract String getDescricao(); 
}
