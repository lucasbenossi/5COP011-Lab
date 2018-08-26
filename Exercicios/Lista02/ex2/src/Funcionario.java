public class Funcionario {
	private String nome;
	private double salario;
	private boolean ativo;
	
	//Construtor
	public Funcionario(String nome, int salario){
		this.nome = nome;
		this.salario = salario;
		this.ativo = true;
	}
	
	//Metodos
	public void inserirAumento(double aumento){
		this.salario = this.salario + (((double)aumento/100)*this.salario);
	}
	public void demitirFuncionario(){
		this.ativo = false;
	}
	public void mostrarAtributos(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Salário: "+this.salario);
		if( this.ativo == true ){
			System.out.println("Ativo: sim");
		}
		else{
			System.out.println("Ativo: não");
		}
		System.out.println("");
	}
	
	//Getter and Setters
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setSalario(int salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
	}
	public void setAtivo(boolean ativo){
		this.ativo = ativo;
	}
	public boolean getAtivo(){
		return this.ativo;
	}
}
