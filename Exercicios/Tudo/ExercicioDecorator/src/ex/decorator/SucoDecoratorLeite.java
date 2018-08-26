package ex.decorator;

public class SucoDecoratorLeite extends SucoDecorator {
	public SucoDecoratorLeite(Suco suco){
		super(suco, 1.00);
	}
	
	@Override
	public void fazerSuco(){
		this.getSuco().fazerSuco();
		System.out.println("Adicionado leite");
	}

}
