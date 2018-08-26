import java.util.Scanner;
import java.io.File;

public class Main {
	public static int[] readFile(String path) {
		int[] inteiros = new int[2];
		Scanner inFile = null;
		
		try {
			inFile = new Scanner(new File(path));
			inteiros[0] = inFile.nextInt();
			inteiros[1] = inFile.nextInt();
			return inteiros;
		} catch (Exception e) {
			System.out.println("Exceção: "+e.getMessage());
		} finally {
			inFile.close();
		}
		
		return null;
	}

	public static void main(String[] args) {
		int[] inteiros = readFile("/home/lucas/Files/Uel/2017/Lab de Prog/Java/doisInt.txt");
		for(int i=0; i<2; i++) {
			System.out.println(inteiros[i]);
		}
	}

}
