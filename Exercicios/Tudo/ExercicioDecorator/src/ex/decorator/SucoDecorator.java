package ex.decorator;

public abstract class SucoDecorator implements Suco {
	private Suco suco;
	private double preco;
	
	public SucoDecorator(Suco suco, double preco){
		this.suco = suco;
		this.preco = suco.getPreco() + preco;
	}
	
	public abstract void fazerSuco();
	
	public double getPreco(){
		return this.preco;
	}
	
	public Suco getSuco(){
		return this.suco;
	}
}
