package com.jun.decorator;

import com.jun.model.Avatar;

public class PersonalidadeCiumento extends PersonalidadeDecorator {
	private Avatar avatar;
	public  PersonalidadeCiumento(Avatar a) {
		 this.avatar = a;
	}
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return avatar.getDescricao()+"Ciumento, ";
	}

}
