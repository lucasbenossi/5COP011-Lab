package mensageiro;
import java.io.*;
import java.util.Scanner;

public class MensageiroBasico implements Mensageiro {
	String path;
	
	public MensageiroBasico(String path){
		this.path = path;
	}
	
	public void escrever(String mensagem){
		FileWriter out;
		try {
			out = new FileWriter(this.path);
			out.write(mensagem);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String ler(){
		FileReader in;
		Scanner sc;
		String mensagem = null;
		try {
			in = new FileReader(this.path);
			sc = new Scanner(in);
			mensagem = sc.nextLine();
			sc.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mensagem;
	}
}
