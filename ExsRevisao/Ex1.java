import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um número inteiro: ");
		n = in.nextInt();
		
		if(n<0) {
			System.out.println("Número negativo");
		} else {
			System.out.println("Número positivo");
		}
	}
}
