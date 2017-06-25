package com.jun.decorator;

import com.jun.model.Avatar;

public class PersonalidadeTriste extends PersonalidadeDecorator {
	private Avatar avatar;
	public  PersonalidadeTriste(Avatar a) {
		 this.avatar = a;
	}
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return avatar.getDescricao()+"Triste, ";
	}

}
