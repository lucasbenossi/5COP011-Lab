import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nivel: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.print("Quantidade: ");
		int q = sc.nextInt();
		sc.nextLine();
		for(int k=0;k<q;k++){
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		sc.close();
	}

}
