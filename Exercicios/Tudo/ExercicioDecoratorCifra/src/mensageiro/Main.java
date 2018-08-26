package mensageiro;

public class Main {
	public static void main(String[] args) {
		Mensageiro mensageiro = new MensageiroBasico("/home/lucas/Desktop/mensagem.txt");
		
		mensageiro = new MensageiroVigenere(mensageiro, "lab2017");
		mensageiro = new MensageiroCesar(mensageiro, 19);
		mensageiro = new MensageiroVigenere(mensageiro, "whatever");
		mensageiro = new MensageiroCesar(mensageiro, 7);
		
		mensageiro.escrever("the lazy fox jumps over brown dog THE LAZY FOX JUMPS OVER BROWN DOG");
		System.out.println(mensageiro.ler());
	}

}
