package ex;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		LinkedList<Gerente> gerentes = new LinkedList<Gerente>();
		Scanner sc = new Scanner(System.in);
		int opt;
		String nome;
		double salario;
		int size;
		int i;
		double porcentagem;
		boolean encontrado=false;
		
		while(true){
			encontrado = false;
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar gerente");
			System.out.println("2 - Demitir gerente");
			System.out.println("3 - Aumentar salario em 10%");
			System.out.println("4 - Aumentar salario");
			System.out.println("5 - Listar gerentes");
			System.out.print("Opção: ");
			opt = sc.nextInt();
			sc.nextLine();
			System.out.print("\n");
			if( opt == 0 ){
				System.out.println("Saindo...\n");
				break;
			}
			else if( opt == 1 ){
				System.out.print("Nome: ");
				nome = sc.nextLine();
				System.out.print("Salaro: ");
				salario = sc.nextDouble();
				sc.nextLine();
				gerentes.add( new Gerente(nome,salario) );
				System.out.println("");
			}
			else if( opt == 2 ){
				size = gerentes.size();
				if( size>0 ){
					System.out.print("Nome: ");
					nome = sc.nextLine();
					System.out.println("");
					for( i=0; i<size; i++ ){
						if( nome.equals( gerentes.get(i).getNome() ) ){
							System.out.println("Gerente "+gerentes.get(i).getNome()+" demitido");
							gerentes.remove(i);
							encontrado = true;
							break;
						}
					}
					if( encontrado == false ){
						System.out.println("Gerente "+nome+" não encontrado");
					}
					System.out.println("");
				}
				else{
					System.out.println("Nenhum cliente cadastrado");
					System.out.println("");
				}
				
			}
			else if( opt == 3 ){
				size = gerentes.size();
				if( size>0 ){
					System.out.print("Nome: ");
					nome = sc.nextLine();
					System.out.println("");
					for( i=0; i<size; i++ ){
						if( nome.equals( gerentes.get(i).getNome() ) ){
							gerentes.get(i).aumentarSalario();
							System.out.println("Salario de "+gerentes.get(i).getNome()+" aumentado em 10%");
							encontrado = true;
							break;
						}
					}
					if( encontrado == false ){
						System.out.println("Gerente "+nome+" não encontrado");
					}
					System.out.println("");
				}
				else{
					System.out.println("Nenhum cliente cadastrado");
					System.out.println("");
				}
			}
			else if( opt == 4 ){
				size = gerentes.size();
				if( size>0 ){
					System.out.print("Nome: ");
					nome = sc.nextLine();
					System.out.println("");
					for( i=0; i<size; i++ ){
						if( nome.equals( gerentes.get(i).getNome() ) ){
							System.out.print("Porcentagem do aumento: ");
							porcentagem = sc.nextDouble();
							sc.nextLine();
							System.out.println("");
							gerentes.get(i).aumentarSalario(porcentagem);
							System.out.println("Salario de "+gerentes.get(i).getNome()+" aumentado em "+porcentagem+"%");
							encontrado = true;
							break;
						}
					}
					if( encontrado == false ){
						System.out.println("");
						System.out.println("Gerente "+nome+" não encontrado");
					}
					System.out.println("");
				}
				else{
					System.out.println("Nenhum cliente cadastrado");
					System.out.println("");
				}
			}
			else if( opt == 5 ){
				size = gerentes.size();
				if( size>0 ){
					for( i=0; i<size; i++ ){
						System.out.println("["+i+"] ["+gerentes.get(i).getNome()+"] ["+gerentes.get(i).getSalario()+"]");
					}
				}
				else{
					System.out.println("Nenhum gerente cadastrado");
					
				}
				System.out.println("");
			}
		}
		
		sc.close();
	}
}
