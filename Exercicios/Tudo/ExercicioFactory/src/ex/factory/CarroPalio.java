package ex.factory;

public class CarroPalio implements Carro {
	public void fabricar(String cor){
		System.out.println("Fabricando Palio na cor "+cor);
	}
}
