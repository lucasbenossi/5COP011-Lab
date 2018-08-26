package br.uel.template;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria contaCorrente = 
				new ContaCorrente();
		ContaBancaria contaPoupanca = 
				new ContaPoupanca();
		
		contaCorrente.depositar(100);
		contaCorrente.sacar(10);
		
		contaPoupanca.depositar(100);
		contaPoupanca.sacar(10);
		
		System.out.println("Saldo da conta corrente: "+contaCorrente.getSaldo());
		System.out.println("Saldo da conta poupança: "+contaPoupanca.getSaldo());

	}

}
