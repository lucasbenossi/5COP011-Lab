package ex;

public class Gerente {
	private String nome;
	private double salario;
	
	public Gerente(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	public void aumentarSalario(){
		salario = salario + (10.0/100.0)*salario;
	}
	
	public void aumentarSalario(double porcentagem){
		salario = salario + (porcentagem/100.0)*salario;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public double getSalario(){
		return this.salario;
	}
	public void setNome(double salario){
		this.salario = salario;
	}
}
