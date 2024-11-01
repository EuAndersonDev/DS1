import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int soma = a + b;
		int c =  m - soma;
		System.out.println( Math.max(a, Math.max(b, c)) );

	}
}