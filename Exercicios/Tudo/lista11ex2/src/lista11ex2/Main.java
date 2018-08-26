package lista11ex2;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		int i;
		
		LinkedList<ContaBancaria> contas = new LinkedList<ContaBancaria>();
		
		for( i = 0; i < 10; i++ ) {
			contas.add(new ContaBancaria("conta"+String.valueOf(i),"conta"+String.valueOf(i),10000));
		}
		
		Thread c1 = new Thread(new Correntista(contas));
		Thread c2 = new Thread(new Correntista(contas));
		Thread c3 = new Thread(new Correntista(contas));
		Thread c4 = new Thread(new Correntista(contas));
		Thread c5 = new Thread(new Correntista(contas));
		
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		
		try {
			c1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			c2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			c3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			c4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			c5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
