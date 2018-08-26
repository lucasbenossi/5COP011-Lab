package ex;

public class Main {
	public static void main(String args[]){
		ContaBancaria a = new ContaBancaria("nome1",1000.0,101);
		ContaBancaria b = new ContaBancaria("nome2",999.98,101);
		ContaBancaria c = new ContaBancaria("nome3",100.21,101);
		
		System.out.println(ContaBancaria.getContador());
		
		System.out.println(a.getNome()+" "+a.getNumConta()+" "+a.getSaldo());
		System.out.println(b.getNome()+" "+b.getNumConta()+" "+b.getSaldo());
		System.out.println(c.getNome()+" "+c.getNumConta()+" "+c.getSaldo());
		
		a.sacar(100.0);
		b.depositar(101.20);
		c.sacar(0.10);
		
		System.out.println("");
		System.out.println(a.getNome()+" "+a.getNumConta()+" "+a.getSaldo());
		System.out.println(b.getNome()+" "+b.getNumConta()+" "+b.getSaldo());
		System.out.println(c.getNome()+" "+c.getNumConta()+" "+c.getSaldo());
	}
}
