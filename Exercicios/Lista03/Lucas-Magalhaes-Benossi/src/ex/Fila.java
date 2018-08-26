package ex;

import java.util.LinkedList;

public class Fila {
	private LinkedList<Pessoa> fila = new LinkedList<Pessoa>();
	
	public void entrarFila(String nome, String servico){
		this.fila.add( new Pessoa(nome,servico) );
	}
	
	public boolean sairFila(String nome){
		int size = this.fila.size();
		for( int i=0; i<size; i++ ){
			if( nome.equals( this.fila.get(i).getNome() ) ){
				this.fila.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public String atenderCliente(){
		String nome;
		if( this.fila.isEmpty() == false ){
			nome = this.fila.getFirst().getNome();
			this.fila.removeFirst();
			return nome;
		}
		else{
			nome = "";
			return nome;
		}
	}
	
	public void dumpFila(){
		int size = this.fila.size();
		if( size != 0 ){
			for(int i=0; i<size; i++){
				System.out.println("["+i+"] ["+this.fila.get(i).getNome()+"] ["+this.fila.get(i).getServico()+"]");
			}
			System.out.println("");
		}
		else{
			System.out.println("Fila Vazia");
			System.out.println("");
		}
	}
	
	public void setFila(LinkedList<Pessoa> fila){
		this.fila = fila;
	}
	public LinkedList<Pessoa> getFila(){
		return this.fila;
	}
}
