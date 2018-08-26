
public class Main {
	public static int finallyVsReturn() {
		int valor = 0;
		try {
			int numerador = 10;
			int denominador = 10;
			int resultado = numerador/denominador;
			return resultado;
		} catch(ArithmeticException arithmeticException) {
			System.out.println("Exceção: "+arithmeticException+"\n");
		} finally {
			System.out.println("O finally executa mesmo não ocorrendo exceção.");
			System.out.println("O finally executa mesmo com o comando return.");
		}
		return valor;
	}

	public static void main(String[] args) {
		int retorno = finallyVsReturn();
		System.out.println("\nRetornou o valor: "+retorno);
	}

}
