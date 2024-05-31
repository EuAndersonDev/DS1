import java.util.*;
public class VetorMedia {
    public static void main(String[] args) {
        final double TAM = 5;
        double numeros[] = new double[TAM];
        double soma = 0;

        // Calculando a soma dos elementos
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // Calculando a média
        double media = soma / numeros.length;
        System.out.println("A média dos elementos é: " + media);
    }
}

