package com.jun.criador;

import com.jun.produto.Automovel;
import com.jun.produto.Automovel.AUTOMOVEL;
import com.jun.produto.Caminhao;
import com.jun.produto.Carro;
import com.jun.produto.Moto;

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
