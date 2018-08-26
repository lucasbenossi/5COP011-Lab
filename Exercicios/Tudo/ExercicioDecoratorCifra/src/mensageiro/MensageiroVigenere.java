package mensageiro;

public class MensageiroVigenere extends MensageiroDecorator {
	String key;
	
	public MensageiroVigenere(Mensageiro mensageiro, String key){
		super(mensageiro);
		this.key = key;
	}
	
	public void escrever(String mensagem){
		this.getMensageiro().escrever(encriptar(mensagem));
	}
	
	public String ler(){
		return decriptar(this.getMensageiro().ler());
	}
	
	private int getKeyChar(int i){
		int keyC = (int)this.key.charAt(i);
		if( keyC >= 65 && keyC <= 90 ){
			keyC -= 65;
		}
		else if( keyC >= 97 && keyC <= 122 ){
			keyC -= 97;
		}
		else{
			keyC = 0;
		}
		return keyC;
	}
	
	private String encriptar(String mensagem){
		StringBuilder mensagemCifrada = new StringBuilder();
		
		for( int i = 0; i < mensagem.length(); i++ ){
			int keyC = getKeyChar(i % key.length());
			
			int letra = (int)mensagem.charAt(i);
			if( letra >= 65 && letra <= 90 ){
				letra -= 65;
				letra = letra + keyC;
				letra %= 26;
				letra += 65;
			}
			else if( letra >= 97 && letra <= 122 ){
				letra -= 97;
				letra = letra + keyC;;
				letra %= 26;
				letra += 97;
			}
			
			mensagemCifrada.append((char)letra);
		}
			
		return mensagemCifrada.toString();
	}
	
	private String decriptar(String mensagemCifrada){
		StringBuilder mensagem = new StringBuilder();
		
		for( int i = 0; i < mensagemCifrada.length(); i++ ){
			int keyC = getKeyChar(i % key.length());
			
			int letra = (int)mensagemCifrada.charAt(i);
			if( letra >= 65 && letra <= 90 ){
				letra -= 65;
				letra = letra - keyC + 26;
				letra %= 26;
				letra += 65;
			}
			else if( letra >= 97 && letra <= 122 ){
				letra -= 97;
				letra = letra - keyC + 26;
				letra %= 26;
				letra += 97;
			}
			
			mensagem.append((char)letra);
		}
		
		return mensagem.toString();
	}
}
