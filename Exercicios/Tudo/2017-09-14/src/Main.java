import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira o numerador: ");
		int numerador = scanner.nextInt();
		
		System.out.println("Insira o denominador: ");
		int denominador = scanner.nextInt();
		
		try {
			int resultado = numerador/denominador;
		}
		catch( Exception e ) {
			System.out.println("Divisâo por zero!");
		}
		
		//System.out.printf("\nResult: %d / %d = %d\n", numerador, denominador, resultado);
		System.out.println("Chegou ao fim do programa.");
		
		scanner.close();
		
	}
}
