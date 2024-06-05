import java.util.*;
public class ContagemDeElementos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 5;
        int numeros[] = new int[TAM];
        int positivos = 0, negativos = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Insira os numeros negativos e posistivos para a contagem: ");
            numeros[i] = in.nextInt();
        }

        for(int j = 0; j < numeros.length; j++){
            if (numeros[j]>= 0) {
                positivos++;
            }else{
                negativos++;
            }
        }
        System.out.println("Está é a quantidade de numeros positivos "+positivos+" e essa é a quantidade de numeros negativos "+negativos);

    }
}
