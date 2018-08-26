package ex.observer;

public class Main {
	public static void main(String[] args) {
		Porta porta = new Porta();
		Morador moradores[] = new Morador[4];
		
		moradores[0] = new Morador("Joao");
		moradores[1] = new Morador("Maria");
		moradores[2] = new Morador("Jose");
		moradores[3] = new Morador("Madalena");
		
		for (Morador morador : moradores) {
			porta.registrarMorador(morador);
		}
		
		porta.abrir();
		System.out.println();
		
		porta.fechar();
		System.out.println();
		
		porta.removerRegistro(moradores[2]);
		porta.removerRegistro(moradores[3]);
		
		porta.abrir();
		System.out.println();
		
		porta.fechar();
		System.out.println();
	}

}
