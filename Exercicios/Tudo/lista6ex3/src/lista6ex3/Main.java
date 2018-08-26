package lista6ex3;

public class Main {

	public static void main(String[] args) {
		Equipamento eq = new Equipamento();
		EquipamentoSonoro eqs = new EquipamentoSonoro();
		
		System.out.println("eq");
		System.out.println(eq.ligar());
		System.out.println(eq.desligar());
		
		System.out.println("eqs");
		System.out.println(eqs.ligar()+" "+eqs.getVolume());
		System.out.println(eqs.desligar()+" "+eqs.getVolume());
	}

}
