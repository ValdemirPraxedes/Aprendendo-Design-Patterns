package com.jun.decorator;

import com.jun.model.Avatar;

public class PersonalidadeSimpatico extends PersonalidadeDecorator {
	private Avatar avatar;
	public  PersonalidadeSimpatico(Avatar a) {
		 this.avatar = a;
	}
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return avatar.getDescricao()+"Simpatico, ";
	}

}
