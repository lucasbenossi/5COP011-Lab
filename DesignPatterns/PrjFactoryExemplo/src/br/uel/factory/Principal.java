package br.uel.factory;

public class Principal {

	public static void main(String[] args) {
		
		EmissorCreator emissorCreator = 
				new EmissorCreator();
		
		//SMS
		Emissor emissorSMS = emissorCreator.criar(EmissorCreator.SMS);
		emissorSMS.enviar("Teste!");
		
		//E-mail
		Emissor emissorEmail = emissorCreator.criar(EmissorCreator.EMAIL);
		emissorEmail.enviar("Teste!");
		
		//JMS
		Emissor emissorJMS = emissorCreator.criar(EmissorCreator.JMS);
		emissorJMS.enviar("Teste!");
	}

}
