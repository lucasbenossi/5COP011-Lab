package mensageiro;

public class MensageiroCesar extends MensageiroDecorator {
	private int key;
	
	public MensageiroCesar(Mensageiro mensageiro, int key){
		super(mensageiro);
		this.key = key % 26;
	}
	
	public void escrever(String mensagem){
		this.getMensageiro().escrever(encriptar(mensagem));
	}
	
	public String ler(){
		return decriptar(this.getMensageiro().ler());
	}
	
	private String encriptar(String mensagem){
		StringBuilder mensagemCifrada = new StringBuilder();
	      
		for( int i = 0; i < mensagem.length(); i++ ){
			int letra = (int)mensagem.charAt(i);
			if( letra >= 65 && letra <= 90 ){
				letra -= 65;
				letra = letra + this.key;
				letra %= 26;
				letra += 65;
			}
			else if( letra >= 97 && letra <= 122 ){
				letra -= 97;
				letra = letra + this.key;
				letra %= 26;
				letra += 97;
			}
			mensagemCifrada.append((char)letra);
		}
	      
		return mensagemCifrada.toString();
	}
	
	private String decriptar(String mensageCifrada){
		StringBuilder mensagem = new StringBuilder();
	      
		for( int i = 0; i < mensageCifrada.length(); i++ ){
			int letra = (int)mensageCifrada.charAt(i);
			if( letra >= 65 && letra <= 90 ){
				letra -= 65;
				letra = letra - this.key + 26;
				letra %= 26;
				letra += 65;
			}
			else if( letra >= 97 && letra <= 122 ){
				letra -= 97;
				letra = letra - this.key + 26;
				letra %= 26;
				letra += 97;
			}
			mensagem.append((char)letra);
		}
	      
		return mensagem.toString();
	}
}
