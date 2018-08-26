package ex.decorator;

public class SucoDecoratorLeiteCondensado extends SucoDecorator {
	public SucoDecoratorLeiteCondensado(Suco suco){
		super(suco, 2.00);
	}
	
	@Override
	public void fazerSuco(){
		this.getSuco().fazerSuco();
		System.out.println("Adicionado leite condensado");
	}

}
