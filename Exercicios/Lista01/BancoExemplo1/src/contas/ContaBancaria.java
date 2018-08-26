package contas;
public class ContaBancaria {
	String agencia;
	String nome;
	String numero;
	double saldo = 0;
	double limite = 1000;
	public void sacarDinheiro(double valor){
		if(valor<limite){
			saldo -= valor;
		}
	}
}
