package lista11ex1;

import java.util.Random;

public class Carro implements Runnable {
	private int i;
	private long tempo;
	private long tempoTotal;
	private String nome;
	private Random r = new Random();
	
	public Carro(String nome) {
		this.nome = nome;
		tempoTotal = 0;
	}
	
	@Override
	public void run() {
		for(i=0;i<65;i++) {
			System.out.println(nome+"; volta "+i);
			tempo = (long)(r.nextDouble()*1000);
			tempoTotal+=tempo;
			try {
				Thread.sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public long getTempoTotal() {
		return this.tempoTotal;
	}
}
