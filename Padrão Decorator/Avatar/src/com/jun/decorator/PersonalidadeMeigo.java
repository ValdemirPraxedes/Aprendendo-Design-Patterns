package com.jun.decorator;

import com.jun.model.Avatar;

public class PersonalidadeMeigo extends PersonalidadeDecorator {
	private Avatar avatar;
	public  PersonalidadeMeigo(Avatar a) {
		 this.avatar = a;
	}
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return avatar.getDescricao()+"Meigo, ";
	}

}
