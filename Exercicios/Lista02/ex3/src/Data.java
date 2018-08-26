
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void printData(){
		System.out.println(dia+"/"+mes+"/"+ano);
	}
	public void printDataFull(){
		System.out.println(dia+" de "+nomeMes(mes)+" de "+ano);
	}
	
	private String nomeMes(int mes){
		String nome;
		nome = "";
		if( mes == 1 ){
			nome = "janeiro";
		}
		else if( mes == 2 ){
			nome = "fevereiro";
		}
		else if( mes == 3 ){
			nome = "março";
		}
		else if( mes == 4 ){
			nome = "abril";
		}
		else if( mes == 5 ){
			nome = "maio";
		}
		else if( mes == 6 ){
			nome = "junho";
		}
		else if( mes == 7 ){
			nome = "julho";
		}
		else if( mes == 8 ){
			nome = "agosto";
		}
		else if( mes == 9 ){
			nome = "setembro";
		}
		else if( mes == 10 ){
			nome = "outubro";
		}
		else if( mes == 11 ){
			nome = "novembro";
		}
		else if( mes == 12 ){
			nome = "dezembro";
		}
		return nome;
	}

	public int getAno(){
		return ano;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	public int getDia(){
		return dia;
	}
	public void setDia(int dia){
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	
}
