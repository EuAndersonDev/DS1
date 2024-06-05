import java.util.Scanner;

public class VetorInvertido {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 5;
        int numeros[] = new int[TAM];

        // Leitura dos números
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Insira o número: ");
            numeros[i] = in.nextInt();
        }

        // Invertendo os valores
        for(int j = 0; j < numeros.length / 2; j++){ // Percorre até a metade do array
            int temp = numeros[j]; // Armazena o valor do início na variável temporária
            numeros[j] = numeros[numeros.length - 1 - j]; // Troca o valor do início pelo valor do fim
            numeros[numeros.length - 1 - j] = temp; // Coloca o valor armazenado no final
        }

        // Imprimindo o vetor invertido
        System.out.println("Vetor invertido:");
        for (int k = 0; k < numeros.length; k++) {
            System.out.println("Elemento na posição " + k + ": " + numeros[k]);
        }
    }
}
