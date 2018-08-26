package ex.observer;

import java.util.LinkedList;

public class Porta {
	private boolean aberto;
	private LinkedList<PortaObserver> moradores;
	
	public Porta(){
		this.aberto = false;
		moradores = new LinkedList<PortaObserver>();
	}
	
	public void registrarMorador(PortaObserver morador){
		this.moradores.add(morador);
	}
	public void removerRegistro(PortaObserver morador){
		this.moradores.remove(morador);
	}
	
	public void abrir(){
		this.aberto = true;
		for( PortaObserver morador : moradores ){
			morador.notificarAberto(this);
		}
	}
	public void fechar(){
		this.aberto = false;
		for( PortaObserver morador : moradores ){
			morador.notificarFechado(this);
		}
	}
	
	public boolean estaAberto(){
		return this.aberto;
	}
}
