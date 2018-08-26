import java.util.Scanner;
public class Principal {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int velocidade;
		String marca;
		String modelo;
		
		System.out.println("Escreva a marca:");
		marca = sc.next();
		
		System.out.println("Escreva a modelo:");
		modelo = sc.next();
		
		System.out.println("Escreva a velocidade:");
		velocidade = sc.nextInt();
		
		Carro carro1 = new Carro(modelo,marca);
		
		System.out.println("Marca: "+carro1.getMarca());
		System.out.println("Modelo: "+carro1.getModelo());
		System.out.println("Marcha: "+carro1.escolherMarcha(velocidade));

		sc.close();
	}
}
