package com.jun.produto;

import com.jun.criador.Fabrica;
import com.jun.produto.Automovel.AUTOMOVEL;

public class FabricaAutomovel extends Fabrica {

	@Override
	protected Automovel createAutomovel(AUTOMOVEL a) {
		
		switch (a) {
		case CARRO:
			return new Carro();
		case MOTO:
			return new Moto();
		case CAMINHÂO:
			return new Caminhao();
		}
		return null;
	}

	

}
