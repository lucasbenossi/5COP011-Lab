package ex.template;

public class PlaylistArtista extends Playlist {
	public PlaylistArtista(Musica[] musicas){
		super(musicas);
	}
	
	@Override
	public int comparator(Musica musica1, Musica musica2){
		int ret;
		
		ret = musica1.getArtista().compareTo(musica2.getArtista());
		
		if(ret > 0){
			return 1;
		}
		if(ret < 0){
			return -1;
		}
		return 0;
	}
}
