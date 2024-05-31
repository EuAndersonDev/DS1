import java.util.*;
public class EncontrarO_Maior {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maior;
        final int TAM = 5;
        int a[] = new int[TAM];
        maior = a[0];

        for (int i = 0; i < TAM; i++) {
            System.out.println("Insira um número: ");
            a[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            if (a[i]>maior) {
                maior=a[i];
            }
        }
        System.out.println("O maior numero é: "+maior);

    }
}
