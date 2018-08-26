package ex4;

public class Principal {
	public static void main(String args[]){
		Pessoa pessoa = new Pessoa("fulano",18);
		System.out.println("Nome: "+pessoa.getNome());
		System.out.println("Idade: "+pessoa.getIdade());
		for(int i=0;i<5;i++){
			pessoa.fazAniversario();
		}
		System.out.println("Nome: "+pessoa.getNome());
		System.out.println("Idade: "+pessoa.getIdade());
	}
}
