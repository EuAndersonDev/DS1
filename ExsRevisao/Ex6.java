import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 6;
		int a[], i, j = 0;
		a = new int[TAM];

		//solução alternativa é já fazer o
  //Vetor já definido com os valores
  //int[] a = {3, 2, 8, 7, 5, 4};

		for(i=0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"o valor do vetor: ");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			System.out.println("Na posição "+i+" teremos o valor "+a[i]);
		}
	}
}
