package br.uel.observer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Acao acao = new Acao("VALE5", 12.78);
		
		AcaoObserver corretora1 = new Corretora("Santander");
		
		AcaoObserver corretora2 = new Corretora("Itau");
		
		acao.registrarInteressado(corretora1);
		acao.registrarInteressado(corretora2);
		
		acao.setValor(15);
		
		acao.cancelarInteresse(corretora2);
		
		acao.setValor(11);
		

	}

}
