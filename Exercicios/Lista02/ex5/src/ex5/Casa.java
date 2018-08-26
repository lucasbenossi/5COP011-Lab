package ex5;

public class Casa {
	private String cor;
	private boolean porta1;
	private boolean porta2;
	private boolean porta3;
	
	public Casa(String cor){
		this.cor = cor;
		this.porta1 = false;
		this.porta2 = false;
		this.porta3 = false;
	}
	
	public void pintar(String cor){
		this.cor = cor;
	}
	public void abrirPorta1(){
		this.porta1 = true;
	}
	public void abrirPorta2(){
		this.porta2 = true;
	}
	public void abrirPorta3(){
		this.porta3 = true;
	}
	
	public void mostrar(){
		System.out.println("Cor: "+cor);
		int abertas = 0;
		if(porta1 == true){
			abertas++;
		}
		if(porta2 == true){
			abertas++;
		}
		if(porta3 == true){
			abertas++;
		}
		System.out.println("Portas abertas: "+abertas);
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public boolean isPorta1() {
		return porta1;
	}
	public void setPorta1(boolean porta1) {
		this.porta1 = porta1;
	}
	public boolean isPorta2() {
		return porta2;
	}
	public void setPorta2(boolean porta2) {
		this.porta2 = porta2;
	}
	public boolean isPorta3() {
		return porta3;
	}
	public void setPorta3(boolean porta3) {
		this.porta3 = porta3;
	}
}
