package br.uel.adapter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePontoNovo {
	String nome;
	
	public ControleDePontoNovo(String nome){
		this.nome = nome+" novo";
	}
	
	public void registrar(Funcionario f, boolean entrada){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("dd/MM/yyy H :m :s");
		String format = simpleDateFormat.format(calendar.getTime());
		
		if(entrada){
			System.out.println("Entrada: " + f.getNome() + " às "+ format);
		} else {
			System.out.println("Saída: " + f.getNome() + " às "+ format);
		}
		
		
	}
	
	public String getNome(){
		return this.nome;
	}
}
