package ex.decorator;

public class SucoBasico implements Suco{
	private double preco;
	private String fruta;
	
	public SucoBasico(String fruta, double preco){
		this.fruta = fruta;
		this.preco = preco;
	}
	
	public void fazerSuco(){
		System.out.println("Feito suco de "+this.fruta);
	}
	
	public double getPreco(){
		return this.preco;
	}
}
