package ex.template;

public class Musica {
	String nome;
	String artista;
	String album;
	
	public Musica(String nome, String artista, String album){
		this.nome = nome;
		this.artista = artista;
		this.album = album;
	}
	
	public String getNome(){
		return this.nome;
	}
	public String getArtista(){
		return this.artista;
	}
	public String getAlbum(){
		return this.album;
	}
}
