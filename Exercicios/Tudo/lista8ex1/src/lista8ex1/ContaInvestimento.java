package lista8ex1;

import java.math.BigDecimal;

public class ContaInvestimento implements Tributavel,ContaBancaria {
	private String cliente;
	private String numeroConta;
	private BigDecimal saldo;
	
	public ContaInvestimento(String cliente, String numeroConta, BigDecimal saldo) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void sacar(BigDecimal valor) {
		if( this.saldo.subtract(valor).compareTo(BigDecimal.ZERO) >= 0 ) {
			this.saldo = this.saldo.subtract(valor);
		}
	}
	public void depositar(BigDecimal valor) {
		this.saldo = this.saldo.add(valor);
	}
	public void calcularNovoSaldo(BigDecimal taxa) {
		this.saldo = this.saldo.add(this.saldo.multiply( taxa.divide(new BigDecimal("100")) ));
	}
	public BigDecimal calcularTaxaAdministracao(BigDecimal taxa) {
		return this.saldo.multiply(taxa.divide(new BigDecimal("100"))).multiply(new BigDecimal("0.01"));
	}
	public BigDecimal calcularTributo(BigDecimal taxa) {
		return this.saldo.multiply(taxa.divide(new BigDecimal("100"))).multiply(new BigDecimal("0.005"));
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
}
