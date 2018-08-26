package lista10ex1;

import java.util.Scanner;
import java.util.LinkedList;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt;
		String nomeLoja;
		String descricao;
		String preco;
		String tipo;
		String autor;
		Produto produto;
		LinkedList<Produto> carrinho = new LinkedList<Produto>();
		
		System.out.print("Insira o nome da loja: ");
		nomeLoja = sc.nextLine();
		
		while(true) {
			System.out.println("1- Inserir mouse");
			System.out.println("2- Inserir livro");
			System.out.println("3- Inserir produto geral de informatica");
			System.out.println("4- Listar itens do carrinho");
			System.out.println("0- Sair");
			System.out.print("Insira a opção desejada: ");
			opt = sc.nextInt();
			sc.nextLine();
			System.out.println("");
			if( opt == 1 ) {
				System.out.print("Insira a descrição: ");
				descricao = sc.nextLine();
				System.out.print("Insira o tipo: ");
				tipo = sc.nextLine();
				System.out.print("Insira o preço: ");
				preco = sc.nextLine();
				produto = new Mouse(nomeLoja, new BigDecimal(preco), tipo, descricao);
				carrinho.add(produto);
			}
			else if( opt == 2 ) {
				System.out.print("Insira a descrição: ");
				descricao = sc.nextLine();
				System.out.print("Insira o autor: ");
				autor = sc.nextLine();
				System.out.print("Insira o preço: ");
				preco = sc.nextLine();
				produto = new Livro(nomeLoja, new BigDecimal(preco), autor, descricao);
				carrinho.add(produto);
			}
			else if( opt == 3 ) {
				System.out.print("Insira o preço: ");
				preco = sc.nextLine();
				produto = new Produto(nomeLoja, new BigDecimal(preco));
				carrinho.add(produto);
			}
			else if( opt == 4 ) {
				for( int i=0; i<carrinho.size(); i++) {
					produto = carrinho.get(i);
					System.out.println(produto.getNomeLoja()+"; "+produto.getDescricao()+"; "+produto.getPreco());
				}
			}
			else if( opt == 0 ) {
				System.out.println("Saindo...");
				break;
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
