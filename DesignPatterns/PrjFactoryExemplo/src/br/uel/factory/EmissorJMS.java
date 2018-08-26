package br.uel.factory;

public class EmissorJMS implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por JMS a mensagem: "+mensagem);
	}

}
