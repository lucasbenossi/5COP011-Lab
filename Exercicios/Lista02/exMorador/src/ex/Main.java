package ex;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Morador morador = new Morador("lucas",102);
		LinkedList<Carro> carros = new LinkedList<Carro>();
		morador.setCarros(carros);
		
		Carro carro;
		
		carro = new Carro("Fiat","Uno","branco","ahv-0000");
		morador.getCarros().addLast(carro);
		
		carro = new Carro("Fiat","Punto","prata","avb-4321");
		morador.getCarros().addLast(carro);
		
		System.out.println("Nome: "+morador.getNome());
		System.out.println("Apartamento: "+morador.getApartamento());
		System.out.println("");
		
		for(int i=0;i<=1;i++){
			System.out.println("Marca: "+morador.getCarros().get(i).getMarca());
			System.out.println("Modelo: "+morador.getCarros().get(i).getModelo());
			System.out.println("Cor: "+morador.getCarros().get(i).getCor());
			System.out.println("Placa: "+morador.getCarros().get(i).getPlaca());
			System.out.println("");
		}
		
		sc.close();
	}
}
