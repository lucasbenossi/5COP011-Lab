package br.uel.template;

public class ContaPoupanca extends ContaBancaria {

	@Override
	public double calcularTaxa() {
		return 1;
	}

}
