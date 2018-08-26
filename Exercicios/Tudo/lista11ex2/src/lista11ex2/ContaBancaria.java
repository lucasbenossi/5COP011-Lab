package lista11ex2;

public class ContaBancaria{
	private String cliente;
	private String conta;
	private int saldo;
	
	public ContaBancaria(String cliente, String conta, int saldo) {
		this.cliente = cliente;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public void retirar(int valor) {
		this.saldo = this.saldo - valor;
	}
	public void depositar(int valor) {
		this.saldo = this.saldo + valor;
	}
	
	public static void movimentar(ContaBancaria origem, ContaBancaria destino, int valor) {
		origem.retirar(valor);
		destino.depositar(valor);
	}
	
	public String getCliente() {
		return this.cliente;
	}
	public String getConta() {
		return this.conta;
	}
	public int getSaldo() {
		return this.saldo;
	}
}
