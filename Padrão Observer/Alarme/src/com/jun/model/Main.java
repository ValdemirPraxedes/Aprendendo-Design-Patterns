package com.jun.model;

public class Main {

	public static void main(String[] args) {
		Relogio r = new Relogio();
		r.ligar();
		Alarme a = new Alarme(r, 0, 0, 5);
		Alarme b = new Alarme(r, 0, 0, 10);
		while(true)
			System.out.println(r);

	}

}
