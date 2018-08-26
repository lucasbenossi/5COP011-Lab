package br.uel.singleton;

public class Principal {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++){
			Incremental inc = new Incremental();
			inc.incrementar();
			System.out.println(inc);
		}

	}

}
