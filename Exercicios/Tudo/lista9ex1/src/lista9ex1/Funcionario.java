package lista9ex1;

import java.math.BigDecimal;

public abstract class Funcionario {
	private String nome;
	private String matricula;
	private BigDecimal salario;
	private static BigDecimal salarioBase;
	
	public Funcionario(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public abstract void calcularSalario();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public BigDecimal getSalario() {
		return this.salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public static BigDecimal getSalarioBase() {
		return salarioBase;
	}
	public static void setSalarioBase(BigDecimal pSalarioBase) {
		salarioBase = pSalarioBase;
	}
	
}
