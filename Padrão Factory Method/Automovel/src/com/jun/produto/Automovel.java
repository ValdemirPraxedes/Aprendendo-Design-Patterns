package com.jun.produto;

public abstract class Automovel {
	
	private int kilometragem;
	private int velocidade;
	public static enum AUTOMOVEL {CARRO,MOTO,CAMINHÂO};
	/**
	 * @return the kilometragem
	 */
	public int getKilometragem() {
		return kilometragem;
	}
	/**
	 * @param kilometragem the kilometragem to set
	 */
	public void setKilometragem(int kilometragem) {
		this.kilometragem = kilometragem;
	}
	/**
	 * @return the velocidade
	 */
	public int getVelocidade() {
		return velocidade;
	}
	/**
	 * @param velocidade the velocidade to set
	 */
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public abstract String descricao();
}
