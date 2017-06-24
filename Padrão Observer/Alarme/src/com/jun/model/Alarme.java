package com.jun.model;

public class Alarme implements Display {

	private final int hora,minutos, segundos;
	private Relogio relogio;
	private static int contagem = 0;
	private boolean alarmeDisparado = false;
	
	public Alarme(Relogio r,int hora,int minutos,int segundos) {
		this.relogio = r;
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	private void compare(int hora,int minutos,int segundos){
		if(this.hora == hora && this.minutos == minutos && this.segundos == segundos)
			alarmeDisparado = true;
		else alarmeDisparado = false;
	}
	
	public String disparaAlarme(){
		if(alarmeDisparado)
		return "Alarme "+contagem+" disparado";
		else return "";
	}

}
