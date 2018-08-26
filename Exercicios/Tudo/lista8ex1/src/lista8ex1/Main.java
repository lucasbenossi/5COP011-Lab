package lista8ex1;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Teste<ContaPoupanca> t = new Teste<ContaPoupanca>( new ContaPoupanca("fulano","123",new BigDecimal("1000"),15) );
		System.out.println(t.getObj().getCliente());
	}
}
