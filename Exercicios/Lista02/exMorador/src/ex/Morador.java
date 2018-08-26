package ex;

import java.util.LinkedList;

public class Morador {
	private String nome;
	private int apartamento;
	private LinkedList<Carro> carros;
	
	public Morador(String nome, int apartamento){
		this.nome = nome;
		this.apartamento = apartamento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getApartamento() {
		return apartamento;
	}
	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}
	public LinkedList<Carro> getCarros() {
		return carros;
	}
	public void setCarros(LinkedList<Carro> carros) {
		this.carros = carros;
	}
}
