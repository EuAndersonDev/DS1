import java.util.*;
public class VetorMedia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 5;
        double numeros[] = new double[TAM];
        double soma = 0;

        for(int i = 0; i<numeros.length; i++){
            System.out.println("Insira os numeros para efetuarmos a soma: ");
            numeros[i] = in.nextInt();
        }
        // Calculando a soma dos elementos
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // Calculando a média
        double media = soma / numeros.length;
        System.out.println("A média dos elementos é: " + media);
    }
}

