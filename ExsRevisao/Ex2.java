import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um número inteiro: ");
		n = in.nextInt();
		
		if(n%2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}
	}
}
