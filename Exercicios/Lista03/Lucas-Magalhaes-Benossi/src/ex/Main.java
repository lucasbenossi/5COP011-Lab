package ex;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Fila fila1 = new Fila();
		
		int opcao;
		String nome;
		String servico;
		
		while(true){
			System.out.println("1 - Entrar na fila");
			System.out.println("2 - Sair da fila");
			System.out.println("3 - Atender cliente");
			System.out.println("4 - Imprimir lista");
			System.out.println("0 - Sair");
			System.out.print("Opcao: ");
			opcao = sc.nextInt();
			sc.nextLine();
			System.out.println("");
			if( opcao == 1 ){
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Servico: ");
				servico = sc.nextLine();
				System.out.println("");
				fila1.entrarFila(nome, servico);
				
			}
			else if( opcao == 2 ){
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.println("");
				if( fila1.sairFila(nome) == true ){
					System.out.println("Cliente "+nome+" deixou a fila");
					System.out.println("");
				}
				else{
					System.out.println("Cliente "+nome+" não encontrado");
					System.out.println("");
				}
			}
			else if( opcao == 3 ){
				nome = fila1.atenderCliente();
				if( nome.isEmpty() == true ){
					System.out.println("Nenhum cliente na fila");
					System.out.println("");
				}
				else{
					System.out.println("Cliente "+nome+" atendido");
					System.out.println("");
				}
			}
			else if( opcao == 4 ){
				fila1.dumpFila();
			}
			else if( opcao == 0 ){
				System.out.println("Saindo...");
				System.out.println("");
				break;
			}
		}
		
		sc.close();
	}
}
