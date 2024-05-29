import java.util.*;
public class InicializaçãoAcesso{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
    int[] numeros = new int[10];

    //inicializando
    for (int i = 0; i< numeros.length; i++){
        System.out.println("Insira um numero!!: ");
        numeros[i] = in.nextInt();
    }

    //apresentando
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }

    }
}