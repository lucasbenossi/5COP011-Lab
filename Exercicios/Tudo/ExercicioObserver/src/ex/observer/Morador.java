package ex.observer;

public class Morador implements PortaObserver {
	private String nome;
	
	public Morador(String nome){
		this.nome = nome;
	}
	
	public void notificarAberto(Porta porta){
		System.out.println("Morador "+this.nome+" notificado que a porta foi aberta.");
	}
	public void notificarFechado(Porta porta){
		System.out.println("Morador "+this.nome+" notificado que a porta foi fechada.");
	}
	
	public String getNome(){
		return this.nome;
	}
}
