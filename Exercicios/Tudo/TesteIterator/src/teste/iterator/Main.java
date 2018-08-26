package teste.iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		for( int i = 0; i < 20; i++ ){
			list.add( String.valueOf(i) );
		}
		
		Iterator<String> it = list.iterator();
		while( it.hasNext() ){
			System.out.print(it.next()+" ");
			System.out.print(it.next()+" ");
			it.remove();
		}
		
		System.out.println("");
		System.out.println(list.size());

	}

}
