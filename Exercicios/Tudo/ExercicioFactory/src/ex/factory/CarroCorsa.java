package ex.factory;

public class CarroCorsa implements Carro {
	public void fabricar(String cor){
		System.out.println("Fabricando Corsa na cor "+cor);
	}
}
