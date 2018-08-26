package ex;

public class Recipiente {
	private int capacidade;
	private int quantidade;
	
	public Recipiente(int capacidade){
		this.capacidade = capacidade;
		this.quantidade = 0;
	}
	public void adicionar(int adicionar){
		this.quantidade +=adicionar;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
}
