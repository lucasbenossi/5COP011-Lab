package ex.singleton;

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Incremental inc = Incremental.getInstance();
			inc.incrementar();
			System.out.println(inc);
		}
	}
}
