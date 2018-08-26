package lista6ex3;

public class EquipamentoSonoro extends Equipamento {
	private short volume;
	private boolean stereo;
	
	public EquipamentoSonoro() {
		this.volume = 0;
		this.stereo = true;
	}
	
	public boolean stereo() {
		this.stereo = true;
		return this.stereo;
	}
	public boolean mono() {
		this.stereo = false;
		return this.stereo;
	}
	
	public boolean ligar() {
		this.volume = 5;
		return super.ligar();
	}
	public boolean desligar() {
		this.volume = 0;
		return super.desligar();
	}

	public short getVolume() {
		return volume;
	}
	public void setVolume(short volume) {
		if( volume>=0 && volume<=10 ) {
			this.volume = volume;
		}
	}
}
