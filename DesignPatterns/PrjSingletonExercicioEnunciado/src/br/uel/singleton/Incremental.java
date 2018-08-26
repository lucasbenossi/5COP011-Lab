package br.uel.singleton;

public class Incremental {
	
	private static int count = 0;
	
	private int numero;
	
	public Incremental(){
		this.numero = count;
	}
	
	public String toString(){
		return "Incremental "+this.numero;
	}
	
	public void incrementar(){
		count++;
	}

}
