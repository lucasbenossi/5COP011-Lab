package ex;

public class Pessoa {
	private String nome;
	private String servico;
	
	public Pessoa(String nome, String servico){
		this.nome = nome;
		this.servico = servico;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getServico(){
		return this.servico;
	}
	public void setServico(String servico){
		this.servico = servico;
	}
}
