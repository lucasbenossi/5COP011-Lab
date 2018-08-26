package ex.template;

public abstract class Playlist {
	Musica[] musicas;
	 
	public Playlist(Musica[] musicas){
		this.musicas = musicas;
	}
	
	public void dumpMusicas(){
		int i;
		for(i = 0; i < this.musicas.length; i++){
			System.out.println("Nome: "+this.musicas[i].getNome()+"; Artista: "+this.musicas[i].getArtista()+"; Album: "+this.musicas[i].getAlbum());
		}
	}
	 
	public abstract int comparator(Musica musica1, Musica musica2);
	
	public void sort(){
		qSort(this.musicas,0,this.musicas.length-1);
	}
	 
	private void qSort(Musica[] musicas, int left, int right){
		int part;
		if( right-left > 0 ){
			part = partition(musicas, left, right);
			qSort(musicas, left, part-1);
			qSort(musicas, part+1, right);
		}
	}
	
	private int partition(Musica[] musicas, int left, int right){
		int i, j;
		Musica pivot;

		pivot = musicas[right];

		i = left;
		j = right - 1;

		while(true){
			while( comparator(musicas[i], pivot) == -1 ){
				i++;
			}

			while( j > i && comparator(musicas[j], pivot) == 1 ){
				j--;
			}

			if( i >= j ){
				break;
			}
			else{
				swap( musicas, i, j );
				i++;
				j--;
			}
		}

		swap( musicas, i, right );
		return i;
	 }
	 
	 private void swap(Musica[] musicas, int a, int b){
		 Musica temp;
		 if( a != b ){
			 temp = musicas[a];
			 musicas[a] = musicas[b];
			 musicas[b] = temp;
		 }
	 }
}
