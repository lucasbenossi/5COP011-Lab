package ex.factory;

public class Main {
	public static void main(String[] args) {
		Fabrica fabrica = new Fabrica();
		
		Carro uno = fabrica.criar(1);
		uno.fabricar("branco");
		
		Carro hb20 = fabrica.criar(2);
		hb20.fabricar("vermelho");
		
		Carro palio = fabrica.criar(3);
		palio.fabricar("prata");
		
		Carro corsa = fabrica.criar(4);
		corsa.fabricar("azul");
		
		Carro celta = fabrica.criar(5);
		celta.fabricar("preto");
	}

}
