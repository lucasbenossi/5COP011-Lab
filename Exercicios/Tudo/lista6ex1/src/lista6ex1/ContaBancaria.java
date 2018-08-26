package lista6ex1;

import java.math.BigDecimal;

public class ContaBancaria {
	private String cliente;
	private String numeroConta;
	private BigDecimal saldo;
	
	public ContaBancaria( String cliente, String numeroConta, BigDecimal saldo ) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public boolean sacar( BigDecimal valor ) {
		if( this.saldo.subtract(valor).compareTo(BigDecimal.ZERO) > 0 ) {
			saldo = this.saldo.subtract(valor);
			return true;
		}
		return false;
	}
	
	public void depositar( BigDecimal valor ) {
		saldo = this.saldo.add(valor);
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
