package lista6ex2;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Mario","Lopes");
		Funcionario pessoa2 = new Funcionario("Lucas","Mendes","",new BigDecimal("2000.00"));
		Professor pessoa3 = new Professor("Rafael","Lira","",new BigDecimal("500.00"));
		
		System.out.println(pessoa1.getNomeCompleto());
		System.out.println(pessoa2.getNomeCompleto());
		System.out.println(pessoa3.getNomeCompleto());
		
		System.out.println("");
		
		System.out.println("pessoa2:");
		System.out.println(pessoa2.getSalarioPrimeiraParcela());
		System.out.println(pessoa2.getSalarioSegundaParcela());
		
		System.out.println("");
		
		System.out.println("pessoa3:");
		System.out.println(pessoa3.getSalarioPrimeiraParcela());
		System.out.println(pessoa3.getSalarioSegundaParcela());
	}

}
