package exemplo.contador;

public class Contador {
	private static int count;
	
	public static synchronized int getContador(){
		count++;
		return count;
	}
}
