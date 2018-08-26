package ex;

public class ContaBancaria {
	private static int contador=0;
	private int numConta;
	private String nome;
	private Double saldo;
	private int numAgencia;
	
	public ContaBancaria(String nome, Double saldo, int numAgencia){
		incrementar();
		this.numConta = contador;
		this.nome = nome;
		this.saldo = saldo;
		this.numAgencia = numAgencia;
	}
	
	public static void incrementar(){
		contador++;
	}
	
	public void sacar(Double valor){
		this.saldo = this.saldo - valor;
	}
	
	public void depositar(Double valor){
		this.saldo = this.saldo + valor;
	}
	
	public static int getContador(){
		return contador;
	}
	public static void setContador(int pContador){
		contador = pContador;
	}
	public int getNumConta(){
		return this.numConta;
	}
	public void setNumConta(int numConta){
		this.numConta = numConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public int getNumAgencia() {
		return numAgencia;
	}
	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
}
