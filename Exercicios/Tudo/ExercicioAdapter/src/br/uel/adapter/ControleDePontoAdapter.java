package br.uel.adapter;

public class ControleDePontoAdapter extends ControleDePonto {
	ControleDePontoNovo novo;
	
	public ControleDePontoAdapter(String nome){
		super(nome);
		novo = new ControleDePontoNovo(nome);
	}
	
	@Override
	public void registrarEntrada(Funcionario f){
		novo.registrar(f,true);
	}
	
	@Override
	public void registrarSaida(Funcionario f){
		novo.registrar(f,false);
	}
	
	@Override
	public String getNome(){
		return novo.getNome();
	}
}
