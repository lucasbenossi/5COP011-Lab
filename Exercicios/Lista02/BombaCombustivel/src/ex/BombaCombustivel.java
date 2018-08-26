package ex;

import java.util.LinkedList;

public class BombaCombustivel {
	private int idBomba;
	private LinkedList<Combustivel> combustiveis;
	
	public BombaCombustivel(int idBomba){
		this.idBomba = idBomba;
	}
	
	public double abastecerPorLitro(double litros, int idCombustivel){
		int size = this.combustiveis.size();
		double preco=-1;
		for( int i=0; i<size; i++ ){
			if( idCombustivel == this.combustiveis.get(i).getId() ){
				preco = litros * this.combustiveis.get(i).getPreco();
				break;
			}
		}
		return preco;
	}
	public double abastecerPorDinheiro(double dinheiro, int idCombustivel){
		int size = this.combustiveis.size();
		double litros=-1;
		for( int i=0; i<size; i++ ){
			if( idCombustivel == this.combustiveis.get(i).getId() ){
				litros = dinheiro / this.combustiveis.get(i).getPreco();
				break;
			}
		}
		return litros;
	}
	
	public int getIdBomba(){
		return this.idBomba;
	}
	public void setIdBomba(int idBomba){
		this.idBomba = idBomba;
	}
	public LinkedList<Combustivel> getCombustiveis() {
		return combustiveis;
	}
	public void setCombustiveis(LinkedList<Combustivel> combustiveis) {
		this.combustiveis = combustiveis;
	}
}
