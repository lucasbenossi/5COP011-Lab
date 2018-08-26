package lista8ex1;

import java.math.BigDecimal;

public class ContaPoupanca implements ContaBancaria{
	private String cliente;
	private String numeroConta;
	private BigDecimal saldo;
	private int diaRendimento;
	
	public ContaPoupanca(String cliente, String numeroConta, BigDecimal saldo, int diaRendimento) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.diaRendimento = diaRendimento;
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
	public int getDiaRendimento() {
		return diaRendimento;
	}
	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
}
