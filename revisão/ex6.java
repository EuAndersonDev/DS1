package revisao;
import java.util.*;
public class ex6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 6;
		int a[], i, j = 0;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"o valor do vetor: ");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Na posição "+i+" teremos o valor "+a[i]);
		}
		}
}
