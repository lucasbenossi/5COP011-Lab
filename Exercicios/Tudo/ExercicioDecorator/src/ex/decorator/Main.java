package ex.decorator;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String fruta;
		Scanner sc;
		Suco suco;
		
		sc = new Scanner(System.in);
		
		while(true){
			System.out.print("Digite a fruta escolhida: ");
			fruta = sc.nextLine();
			System.out.println();
			
			suco = new SucoBasico(fruta,3.00);
			
			System.out.println("Inserir leite?");
			System.out.print("Digite 1 para sim e 0 para não: ");
			if( sc.nextInt() == 1 ){
				suco = new SucoDecoratorLeite(suco);
			}
			sc.nextLine();
			System.out.println();
			
			System.out.println("Inserir leite condesado?");
			System.out.print("Digite 1 para sim e 0 para não: ");
			if( sc.nextInt() == 1 ){
				suco = new SucoDecoratorLeiteCondensado(suco);
			}
			sc.nextLine();
			System.out.println();
			
			suco.fazerSuco();
			System.out.println();
			
			System.out.println("Valor do suco: "+suco.getPreco());
			System.out.println();
			
			System.out.println("Sair?");
			System.out.print("Digite 1 para sim ou 0 para não e fazer um novo suco: ");
			if( sc.nextInt() == 1 ){
				break;
			}
			sc.nextLine();
			System.out.println();
		}
		
		sc.close();
	}
}
