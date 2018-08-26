package br.uel.decorator;

public class Principal {

	public static void main(String[] args) {
		String mensagem = "teste";
		Emissor emissor = new EmissorBasico();
		
		Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
		
		System.out.println("======== Emissor básico");
		emissor.enviar(mensagem);
		
		System.out.println("======== Emissor com criptografia");
		emissorCript.enviar(mensagem);
		
		System.out.println("======== Emissor com duas criptografias");
		
		Emissor emissorCript2 = 
				new EmissorDecoratorComCriptografia(
						new EmissorDecoratorComCriptografia(new EmissorBasico()));
		
		emissorCript2.enviar("teste2");
		
		System.out.println("======== Emissor duplicador");
		
		Emissor emissordupl = new EmissorDecoratorMsgDuplicada(new EmissorBasico());
		emissordupl.enviar("Acorda, pessoal!");
		
		System.out.println("======== Emissor duplicador com criptografia");
		
		Emissor emissorDuplCript = 
				new EmissorDecoratorMsgDuplicada(
						new EmissorDecoratorComCriptografia(
								new EmissorBasico()));
		
		emissorDuplCript.enviar("Acorda, pessoal!");

	}
}
