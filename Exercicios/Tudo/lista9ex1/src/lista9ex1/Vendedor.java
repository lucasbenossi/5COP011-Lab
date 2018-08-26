package lista9ex1;

import java.math.BigDecimal;

public class Vendedor extends Funcionario {
	private BigDecimal comissao;
	
	public Vendedor(String nome, String matricula, BigDecimal comissao) {
		super(nome,matricula);
		this.comissao = comissao;
		this.calcularSalario();
	}
	
	public void calcularSalario() {
		this.setSalario( Funcionario.getSalarioBase().add(comissao) );
	}
	
	public BigDecimal getComissao() {
		return this.comissao;
	}
	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}
}
