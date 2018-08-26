package ex.singleton;

public class Incremental {
	private static int count = 0;
	private int numero;
	public static Incremental instance;
	
	public static Incremental getInstance(){
		if (Incremental.instance == null){
			Incremental.instance = new Incremental();
		}
		Incremental.instance.setNumero(Incremental.count);
		return Incremental.instance;
	}
	
	public String toString(){
		return "Incremental "+this.numero;
	}
	
	public void incrementar(){
		count++;
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
}
