package ex.template;

public class Main {
	public static void main(String[] args) {
		Musica[] musicas = new Musica[5];
		musicas[0] = new Musica("When They Come For Me", "Linkin Park", "A Thousand Sums");
		musicas[1] = new Musica("Halls of Valhalla", "Judas Priest", "Redeemer of Souls");
		musicas[2] = new Musica("Painkiller", "Judas Priest", "Painkiller");
		musicas[3] = new Musica("Breaking the Law", "Judas Priest", "British Steel");
		musicas[4] = new Musica("Heaven", "Depeche Mode", "Delta Machine");
		
		System.out.println("Ordenando por Artista");
		Playlist playlist1 = new PlaylistArtista(musicas);
		playlist1.sort();
		playlist1.dumpMusicas();
		
		System.out.println("Ordenando por Nome");
		Playlist playlist2 = new PlaylistNome(musicas);
		playlist2.sort();
		playlist2.dumpMusicas();
	}

}
