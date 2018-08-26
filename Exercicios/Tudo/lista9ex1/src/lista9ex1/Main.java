package lista9ex1;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
		String nome, matricula, comissao;
		Scanner sc = new Scanner(System.in);
		int opt;
		
		Funcionario.setSalarioBase(new BigDecimal("1000"));
		
		while(true) {
			System.out.println("1 - Cadastrar Gerente");
			System.out.println("2 - Cadastrar Assistente");
			System.out.println("3 - Cadastrar Vendedor");
			System.out.println("4 - Imprimir lista de funcionarios");
			System.out.println("0 - Sair");
			opt = sc.nextInt();
			sc.nextLine();
			if( opt == 1 ) {
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Matricula: ");
				matricula = sc.nextLine();
				funcionarios.add( new Gerente(nome,matricula) );
			}
			else if( opt == 2 ) {
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Matricula: ");
				matricula = sc.nextLine();
				funcionarios.add( new Assistente(nome,matricula) );
			}
			else if( opt == 3 ) {
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Matricula: ");
				matricula = sc.nextLine();
				System.out.print("Comissao: ");
				comissao = sc.nextLine();
				funcionarios.add( new Vendedor(nome,matricula,new BigDecimal(comissao)) );
			}
			else if( opt == 4 ) {
				for(int i=0; i<funcionarios.size(); i++) {
					Funcionario func = funcionarios.get(i);
					System.out.println(func.getNome()+"; "+func.getSalario());
				}
			}
			else if( opt == 0 ) {
				System.out.println("Saindo...");
				break;
			}
		}
		
		sc.close();
	}
}
