package ex;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		BombaCombustivel bomba1 = new BombaCombustivel(1);
		bomba1.setCombustiveis( new LinkedList<Combustivel>() );
		
		bomba1.getCombustiveis().add( new Combustivel("alcool",			1, 2.40) );
		bomba1.getCombustiveis().add( new Combustivel("alcoolAdt",		2, 2.60) );
		bomba1.getCombustiveis().add( new Combustivel("gasolina",		3, 3.20) );
		bomba1.getCombustiveis().add( new Combustivel("gasolinaAdt",	4, 3.50) );
		
		System.out.println( bomba1.abastecerPorLitro(35, 1) );
		
		sc.close();
	}
}
