package br.uel.singleton;

public class Principal {

	public static void main(String[] args) {
		Configuracao configuracao = 
				Configuracao.getInstance();
		
		System.out.println(configuracao.getPropriedade("time-zone"));
		System.out.println(configuracao.getPropriedade("currency-code"));

	}

}
