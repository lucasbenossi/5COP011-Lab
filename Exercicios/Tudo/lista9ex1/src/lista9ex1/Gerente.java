package lista9ex1;

import java.math.BigDecimal;

public class Gerente extends Funcionario {
	
	public Gerente(String nome, String matricula) {
		super(nome,matricula);
		this.calcularSalario();
	}
	
	public void calcularSalario() {
		this.setSalario( Funcionario.getSalarioBase().multiply(new BigDecimal("2")) );
	}
}
