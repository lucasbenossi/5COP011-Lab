package br.uel.observer;

public class Corretora implements AcaoObserver {

	private String nome;
	
	public Corretora(String nome){
		this.nome = nome;
	}
	
	@Override
	public void notificarAlteracao(Acao acao) {
		System.out.println("Corretora " + this.nome + " sendo notificada");
		System.out.println("A ação " + acao.getCodigo() +" teve o seu valor alterado para "
							+ acao.getValor());
		
	}

}
