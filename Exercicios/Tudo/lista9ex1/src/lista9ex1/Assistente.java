package lista9ex1;

import java.math.BigDecimal;

public class Assistente extends Funcionario {
	
	public Assistente(String nome, String matricula) {
		super(nome,matricula);
		this.calcularSalario();
	}
	
	public void calcularSalario() {
		this.setSalario( Funcionario.getSalarioBase().multiply(new BigDecimal("1")) );
	}
}
