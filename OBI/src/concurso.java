import java.util.Arrays;
import java.util.Scanner;

public class concurso{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int[] notas = new int[n];
        
        for (int i = 0; i < n; i++) {
            notas[i] = in.nextInt();
        }

        Arrays.sort(notas);

        System.out.printf("%d\n",notas[n - k]);
        
    }
}