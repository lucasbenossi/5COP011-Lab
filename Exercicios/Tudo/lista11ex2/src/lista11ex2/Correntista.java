package lista11ex2;

import java.util.LinkedList;
import java.util.Random;

public class Correntista implements Runnable {
	private LinkedList<ContaBancaria> contas;
	int origem;
	int destino;
	int i;
	int valor;
	Random r = new Random();
	
	public Correntista(LinkedList<ContaBancaria> contas) {
		this.contas = contas;
	}
	
	public void run() {
		synchronized(this) {
			for (i = 0; i < 20; i++ ) {
				origem = r.nextInt(10);
				destino = origem;
				while( destino == origem ) {
					destino = r.nextInt(10);
				}
				valor = r.nextInt(10000);
				ContaBancaria.movimentar(contas.get(origem), contas.get(destino), valor);
				System.out.println("Movimentado "+valor+" reais de "+contas.get(origem).getConta()+" para "+contas.get(destino).getConta()+"; Total do banco: "+this.getTotal(contas));
			}
		}
	}
	
	private int getTotal( LinkedList<ContaBancaria> contas ) {
		int total = 0;
		for( int i = 0; i < 10; i++ ) {
			total = total + contas.get(i).getSaldo();
		}
		return total;
	}
}
