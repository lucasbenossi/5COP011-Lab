package br.uel.adapter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePonto {
	private String nome;
	
	public ControleDePonto(String nome){
		this.nome = nome;
	}
	
	public void registrarEntrada(Funcionario f){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("dd/MM/yyy H :m :s");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println("Entrada: " + f.getNome() + " às "+ format);
	}
	
	public void registrarSaida(Funcionario f){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("dd/MM/yyy H :m :s");
		String format = simpleDateFormat.format(calendar.getTime());
		System.out.println("Saída: " + f.getNome() + " às "+ format);
	}
	
	public String getNome(){
		return this.nome;
	}
}
