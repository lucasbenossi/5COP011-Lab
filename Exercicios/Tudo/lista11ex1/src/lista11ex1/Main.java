package lista11ex1;

public class Main {
	public static void main(String[] args) {
		Carro felipeMassa = new Carro("Felipe Massa");
		Carro lewisHamilton = new Carro("Lewis Hamilton");
		
		Thread thFelipeMassa = new Thread(felipeMassa);
		Thread thLewisHamilton = new Thread(lewisHamilton);
		
		thFelipeMassa.start();
		thLewisHamilton.start();
		
		try {
			thFelipeMassa.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			thLewisHamilton.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		
		if( felipeMassa.getTempoTotal() < lewisHamilton.getTempoTotal() ) {
			System.out.println("Felipe Massa ganhou.");
		}
		else if( lewisHamilton.getTempoTotal() < felipeMassa.getTempoTotal() ) {
			System.out.println("Lewis Hamilton ganhou.");
		}
	}
}
