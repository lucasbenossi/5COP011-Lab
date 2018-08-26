package ex;

public class Main {
	public static void main(String args[]){
		Recipiente a = new Recipiente(350);
		//Recipiente b = a;
		a.adicionar(50);
		System.out.println("a.capacidade "+a.getCapacidade());
		System.out.println("a.quantidade "+a.getQuantidade());
		a = null;
		System.out.println("a.capacidade "+a.getCapacidade());
		System.out.println("a.quantidade "+a.getQuantidade());
		//System.out.println("b.capacidade "+b.getCapacidade());
		//System.out.println("b.quantidade "+b.getQuantidade());
	}
}
