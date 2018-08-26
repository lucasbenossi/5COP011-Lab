package lista6ex3;

public class Equipamento {
	private boolean ligado;
	
	public Equipamento() {
		this.ligado = false;
	}
	
	public boolean ligar() {
		this.ligado = true;
		return this.ligado;
	}
	public boolean desligar() {
		this.ligado = false;
		return this.ligado;
	}
}
