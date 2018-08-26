package ex.morador;

public class Morador {
	private String nome;
	private int numeroApto;
	
	public Morador(String nome, int numeroApto){
		this.nome = nome;
		this.numeroApto = numeroApto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroApto() {
		return numeroApto;
	}
	public void setNumeroApto(int numeroApto) {
		this.numeroApto = numeroApto;
	}
}
