package com.jun.decorator;

import com.jun.model.Avatar;

public class PersonalidadeAlegre extends PersonalidadeDecorator {
	private Avatar avatar;
	public  PersonalidadeAlegre(Avatar a) {
		 this.avatar = a;
	}
	@Override
	public String getDescricao() {
		// TODO Auto-generated method stub
		return avatar.getDescricao()+"Alegre, ";
	}

}
