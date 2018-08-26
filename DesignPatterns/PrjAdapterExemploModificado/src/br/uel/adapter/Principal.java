package br.uel.adapter;

public class Principal {
	
	public static void main(String args[]){
		
		/*TomadaDeDoisPinos tomada2Pinos = 
				new TomadaDeDoisPinos();
		
		tomada2Pinos.ligarNaTomadaDeDoisPinos();*/
		
		TomadaDeDoisPinos tomada2Pinos = 
				new TomadaAdapter();
		
		tomada2Pinos.ligarNaTomadaDeDoisPinos();
	}

}
