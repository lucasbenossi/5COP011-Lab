package br.uel.adapter;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		ControleDePonto controleDePonto = 
				new ControleDePontoAdapter("ponto1");
		Funcionario funcionario = 
				new Funcionario("João de Souza");
		System.out.println(controleDePonto.getNome());
		controleDePonto.registrarEntrada(funcionario);
		Thread.sleep(1000);
		controleDePonto.registrarSaida(funcionario);
		
		
	}

}
