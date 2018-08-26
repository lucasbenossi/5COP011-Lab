package br.uel.factory;

public class EmissorEmail implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por E-mail a mensagem: "+mensagem);
	}

}
