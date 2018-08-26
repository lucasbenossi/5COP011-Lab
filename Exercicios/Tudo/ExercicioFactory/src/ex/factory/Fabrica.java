package ex.factory;

public class Fabrica {
	public final static int UNO = 1;
	public final static int HB20 = 2;
	public final static int PALIO = 3;
	public final static int CORSA = 4;
	public final static int CELTA = 5;
	
	public Carro criar(int modelo){
		if( modelo == Fabrica.UNO ){
			return new CarroUno();
		}
		else if( modelo == Fabrica.HB20 ){
			return new CarroHB20();
		}
		else if( modelo == Fabrica.PALIO ){
			return new CarroPalio();
		}
		else if( modelo == Fabrica.CORSA ){
			return new CarroCorsa();
		}
		else if( modelo == Fabrica.CORSA ){
			return new CarroCorsa();
		}
		else if( modelo == Fabrica.CELTA ){
			return new CarroCelta();
		}
		else {
			throw new IllegalArgumentException("Modelo não suportado");
		}
	}
}
