package com.jun.criador;

import com.jun.produto.Automovel;
import com.jun.produto.Automovel.AUTOMOVEL;

public abstract class Fabrica {
	
	public Automovel makeAutomovel(AUTOMOVEL a){
		return createAutomovel(a);
	}
	
	protected abstract Automovel createAutomovel(AUTOMOVEL a); 
}
