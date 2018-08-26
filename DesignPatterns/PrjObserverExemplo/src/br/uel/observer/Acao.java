package br.uel.observer;

import java.util.HashSet;
import java.util.Set;

public class Acao {
	
	private String codigo;
	
	private double valor;
	
	public Acao(String codigo, double valor){
		this.codigo = codigo;
		this.valor = valor;
	}
	
	private Set<AcaoObserver> interessados = 
			new HashSet<AcaoObserver>();
	
	public void registrarInteressado(AcaoObserver interessado){
		this.interessados.add(interessado);
	}
	
	public void cancelarInteresse(AcaoObserver interessado){
		this.interessados.remove(interessado);
	}
	
	public double getValor(){
		return this.valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
		for(AcaoObserver interessado : this.interessados){
			interessado.notificarAlteracao(this);
		}
	}
	
	public String getCodigo() {
		return codigo;
	}
	

}
