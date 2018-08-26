package lista8ex1;

import java.math.BigDecimal;
import java.util.LinkedList;

public class Contas {
	private LinkedList<ContaPoupanca> cps;
	private LinkedList<ContaCorrente> ccs;
	private LinkedList<ContaInvestimento> cis;
	
	public Contas() {
		this.cps = new LinkedList<ContaPoupanca>();
		this.ccs = new LinkedList<ContaCorrente>();
		this.cis = new LinkedList<ContaInvestimento>();
	}
	
	public void inserirContaPoupanca(String cliente, String numeroConta, BigDecimal saldo, int diaRendimento) {
		this.cps.add( new ContaPoupanca(cliente, numeroConta, saldo, diaRendimento) );
	}
	public void inserirContaCorrente(String cliente, String numeroConta, BigDecimal saldo, BigDecimal limite) {
		this.ccs.add( new ContaCorrente(cliente, numeroConta, saldo, limite) );
	}
	public void inserirContaInvestimento(String cliente, String numeroConta, BigDecimal saldo) {
		this.cis.add( new ContaInvestimento(cliente, numeroConta, saldo) );
	}
	
	public LinkedList<ContaPoupanca> getCps(){
		return this.cps;
	}
	public LinkedList<ContaCorrente> getCcs(){
		return this.ccs;
	}
	public LinkedList<ContaInvestimento> getCis() {
		return this.cis;
	}
}
