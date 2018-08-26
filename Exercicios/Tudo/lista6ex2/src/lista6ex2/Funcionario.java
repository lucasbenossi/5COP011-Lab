package lista6ex2;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {
	private String matricula;
	private BigDecimal salario;
	
	final private BigDecimal primeiraParcela = new BigDecimal("0.6");
	final private BigDecimal segundaParcela = new BigDecimal("0.4");
	
	public Funcionario(String nome, String sobrenome, String matricula, BigDecimal salario) {
		super(nome,sobrenome);
		this.matricula = matricula;
		this.salario = salario;
	}
	
	public BigDecimal getSalarioPrimeiraParcela(){
		return this.salario.multiply(primeiraParcela);
	}
	public BigDecimal getSalarioSegundaParcela() {
		return this.salario.multiply(segundaParcela);
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
}
