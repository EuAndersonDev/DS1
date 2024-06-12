import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class concurso{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        

        Integer[] notas = new Integer[N];
        for (int i = 0; i < N; i++) {
            notas[i] = scanner.nextInt();
        }
        

        Arrays.sort(notas, Collections.reverseOrder());

        int notaDeCorte = notas[K];

        System.out.println(notaDeCorte);
        
        scanner.close();
    }
}