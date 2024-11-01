import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class toupeira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int T = scanner.nextInt();
        List<List<Integer>> array = new ArrayList<>(S + 1);
        
        for (int i = 0; i <= S; i++) {
            array.add(new ArrayList<>());
        }

        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            array.get(X).add(Y);
            array.get(Y).add(X);
        }

        int P = scanner.nextInt();
        int cc = 0;

        for (int i = 0; i < P; i++) {
            int n = scanner.nextInt();
            int[] caminho = new int[n];
            for (int j = 0; j < n; j++) {
                caminho[j] = scanner.nextInt();
            }

            boolean flag = true;
            for (int j = 0; j < n - 1; j++) {
                int valorSalaoAtual = caminho[j];
                int valorProxSalao = caminho[j + 1];

                if (!array.get(valorSalaoAtual).contains(valorProxSalao)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                cc++;
            }
        }

        System.out.println(cc);
        scanner.close();
    }
}