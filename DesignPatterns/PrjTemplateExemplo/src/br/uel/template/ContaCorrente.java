package br.uel.template;

public class ContaCorrente extends ContaBancaria {

	@Override
	public double calcularTaxa() {
		return 3;
	}

}
