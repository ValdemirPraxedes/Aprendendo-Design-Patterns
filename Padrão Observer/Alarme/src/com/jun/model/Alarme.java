package com.jun.model;

import com.jun.observer.Observer;
import com.jun.observer.Subject;

public class Alarme implements Display, Observer {

	private final int hora,minutos, segundos;
	private Subject relogio;
	private static int contagem = 0;
	private int id;
	private boolean alarmeDisparado = false;
	
	public Alarme(Subject r,int hora,int minutos,int segundos) {
		this.relogio = r;
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
		this.id = ++contagem;
		this.relogio.registerObserver(this);
	}
	
	private void compare(int hora,int minutos,int segundos){
		if(this.hora == hora && this.minutos == minutos && this.segundos == segundos)
			alarmeDisparado = true;
		else alarmeDisparado = false;
	}
	
	public String disparaAlarme(){
		if(alarmeDisparado)
		return "Alarme "+id+" disparado";
		else return "";
	}

	public void update(int hora, int minuto, int segundo) {
		compare(hora, minuto, segundo);	
	}

}
