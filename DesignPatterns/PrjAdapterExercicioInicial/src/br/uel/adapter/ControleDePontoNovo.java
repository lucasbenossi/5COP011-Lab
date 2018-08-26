package br.uel.adapter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePontoNovo {
	public void registrar(Funcionario f, boolean entrada){
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat simpleDateFormat = 
				new SimpleDateFormat("dd/MM/yyy H :m :s");
		String format = simpleDateFormat.format(calendar.getTime());
		
		if(entrada){
			System.out.println("Entrada: " + f.getNome() + " �s "+ format);
		} else {
			System.out.println("Sa�da: " + f.getNome() + " �s "+ format);
		}
		
		
	}
}
