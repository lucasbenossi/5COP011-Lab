package contas;
public class Principal {
	public static void main(String[] args) {
		ContaBancaria conta1 = 
				new ContaBancaria();
		conta1.agencia = "001x";
		conta1.numero = "001x-03";
		conta1.nome = "Matusalém";
		conta1.saldo = 10000;
		System.out.println("Agencia da cona 1: "+conta1.agencia);
		conta1.agencia = "0010x";
		System.out.println("Agencia da cona 1: "+conta1.agencia);
		ContaBancaria conta2 = conta1;
		System.out.println(conta2.agencia);
		conta2.agencia = "002x";
		System.out.println(conta1.agencia);
		System.out.println(conta2.agencia);
		System.out.println("Saldo"+conta2.saldo);
		conta1.sacarDinheiro(1000);
		System.out.println("Saldo"+conta2.saldo);
	}

}
