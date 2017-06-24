package com.jun.model;

public class Relogio implements Runnable {

	private int hora;
	private int minuto;
	private int segundo;
	private boolean ligar = false;
	
	/**Construdor que já define a hora */
	public Relogio(int h,int m,int s) {
		this.setSegundo(s);
		this.setMinuto(m);
		this.setHora(h);
		
		Thread t = new Thread(this);
		t.start();
	}
	
	public Relogio(){
		this(0, 0, 0);
	}
	
	
	public String toString(){
		return  getHora()+":"+getMinuto()+":"+getSegundo();
	
	}
	/**
	 * @return the hora
	 */
	public int getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		
		this.hora = hora;
	}

	/**
	 * @return the minuto
	 */
	public int getMinuto() {
		return minuto;
	}

	/**
	 * @param minuto the minuto to set
	 */
	public void setMinuto(int minuto) {
		if(minuto < 0 || minuto > 59)throw new RuntimeException("Minuto fora do intervalo");
		this.minuto = minuto;
	}

	/**
	 * @return the segundo
	 */
	public int getSegundo() {
		return segundo;
	}

	/**
	 * @param segundo the segundo to set
	 */
	public void setSegundo(int segundo) {
		if(segundo < 0 || segundo > 59)throw new RuntimeException("Segundo fora do intervalo");
		this.segundo = segundo;
	}
	
	public void ligar(){
		ligar = true;
	}
	
	private void funcionamento_interno_do_relogio(){
		
		while(ligar){
			long clock = System.currentTimeMillis();
		
			while(System.currentTimeMillis()-clock < 1000);
			segundo++;
			if(segundo == 60){
				segundo = 0;
				minuto++;
				if(minuto == 60){
					hora++;
					minuto = 0;
				}
					
			}
		}
	}


	public void run() {
		funcionamento_interno_do_relogio();
	}
	
	
	
}
