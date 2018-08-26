
public class Principal {
	public static void main(String args[]){
		Funcionario funcionario1 = new Funcionario("Malaquias",1000);
		funcionario1.mostrarAtributos();
		funcionario1.inserirAumento(20);
		funcionario1.mostrarAtributos();
		funcionario1.demitirFuncionario();
		funcionario1.mostrarAtributos();
	}
	
}
