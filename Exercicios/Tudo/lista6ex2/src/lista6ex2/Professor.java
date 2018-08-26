package lista6ex2;

import java.math.BigDecimal;

public class Professor extends Funcionario{
	
	public Professor(String nome, String sobrenome, String matricula, BigDecimal salario) {
		super(nome, sobrenome, matricula, salario);
	}
	
	public BigDecimal getSalarioPrimeiraParcela(){
		return this.getSalario();
	}
	public BigDecimal getSalarioSegundaParcela() {
		return BigDecimal.ZERO;
	}
}
