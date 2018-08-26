package mensageiro;

public abstract class MensageiroDecorator implements Mensageiro {
	Mensageiro mensageiro;
	
	public MensageiroDecorator(Mensageiro mensageiro){
		this.mensageiro = mensageiro;
	}
	
	public abstract void escrever(String mensagem);
	
	public abstract String ler();
	
	public Mensageiro getMensageiro(){
		return this.mensageiro;
	}
}
