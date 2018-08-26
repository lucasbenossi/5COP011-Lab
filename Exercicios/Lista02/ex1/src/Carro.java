
public class Carro {
	private String modelo;
	private String marca;
	private int marcha;
	public Carro(String pModelo, String pMarca){
		this.modelo = pModelo;
		this.marca = pMarca;
	}
	public int escolherMarcha(int velocidade){
		if( velocidade > 0 && velocidade <= 20 ){
			this.marcha = 1; 
		}
		else if( velocidade > 20 && velocidade <= 40 ){
			this.marcha = 2;
		}
		else if( velocidade > 40 && velocidade <= 60 ){
			this.marcha = 3;
		}
		else if( velocidade > 60 && velocidade <= 80 ){
			this.marcha = 4;
		}
		else{
			this.marcha = 5;
		}
		return this.marcha;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String pModelo) {
		this.modelo = pModelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String pMarca) {
		this.marca = pMarca;
	}
}
