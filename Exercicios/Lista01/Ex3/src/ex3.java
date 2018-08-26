import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		System.out.println("Digite o numero:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();
		for(int i=0;i<n;i++){
			System.out.println(i+" "+nome);
		}
		sc.close();
	}

}
