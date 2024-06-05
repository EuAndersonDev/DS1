import java.util.Scanner;

public class VetorDeSoma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 5;
        int numero[] = new int[TAM];
        int soma = 0;

        for (int i = 0; i < TAM; i++) {
            System.out.println("Insira um número para ser somado: ");
            numero[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            soma += numero[i];
        }

        System.out.println("O valor final da soma é: " + soma);
    }
}
