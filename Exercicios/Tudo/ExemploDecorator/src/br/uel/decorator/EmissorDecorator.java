package br.uel.decorator;

public abstract class EmissorDecorator implements Emissor {

	private Emissor emissor;
	
	public EmissorDecorator(Emissor emissor){
		this.emissor = emissor;
	}
	
	@Override
	public abstract void enviar(String mensagem);
	
	public Emissor getEmissor(){
		return this.emissor;
	}
	
	
	
	

}
