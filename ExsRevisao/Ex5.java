import java.util.Scanner;
public class Ex5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int linhas = 3, colunas = 4;
        double v[][] = new double[linhas][colunas];
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
            	System.out.print("Insira nota: ");
                v[i][j] = in.nextDouble();
            }
        }
        
        // Imprimindo a matriz
        for (int i = 0; i < 3; i++) {
            System.out.println();
            System.out.print("Aluno "+(i+1)+": ");
            System.out.print("[ ");
            for (int j = 0; j < 4; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.print(" ]");
        }
        
	}
}
