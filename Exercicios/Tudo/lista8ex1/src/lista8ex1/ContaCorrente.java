package lista8ex1;

import java.math.BigDecimal;

public class ContaCorrente implements ContaBancaria{
	private String cliente;
	private String numeroConta;
	private BigDecimal saldo;
	private BigDecimal limite;
	
	public ContaCorrente(String cliente, String numeroConta, BigDecimal saldo, BigDecimal limite) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite.abs().multiply(new BigDecimal("-1"));
	}
	
	public void sacar(BigDecimal valor) {
		if( this.saldo.subtract(valor).compareTo(this.limite) >= 0 ) {
			this.saldo = this.saldo.subtract(valor);
		}
	}
	public void depositar(BigDecimal valor) {
		this.saldo = this.saldo.add(valor);
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
	public BigDecimal getLimite() {
		return limite;
	}
	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
}
