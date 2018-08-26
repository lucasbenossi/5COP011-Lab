package ex.template;

public class PlaylistNome extends Playlist {
	public PlaylistNome(Musica[] musicas){
		super(musicas);
	}
	
	@Override
	public int comparator(Musica musica1, Musica musica2){
		int ret;
		
		ret = musica1.getNome().compareTo(musica2.getNome());
		
		if(ret > 0){
			return 1;
		}
		if(ret < 0){
			return -1;
		}
		return 0;
	}
}
