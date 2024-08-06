import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Figuras> figuras = new ArrayList<>();

        System.out.print("Quantas figuras deseja inserir? ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o tipo de figura (circulo ou quadrado): ");
            String tipo = in.next().toLowerCase();

            switch (tipo) {
                case "circulo":
                    System.out.print("Digite o raio do círculo: ");
                    double raio = in.nextDouble();
                    figuras.add(new Circulo(raio));
                    break;
                case "quadrado":
                    System.out.print("Digite o lado do quadrado: ");
                    double comprimento = in.nextDouble();
                    figuras.add(new Quadrado(comprimento));
                    break;
                default:
                    System.out.println("Tipo de figura desconhecido.");
                    i--; 
                    break;
            }
        }

        System.out.println("Áreas das figuras:");
        for (Figuras figura : figuras) {
            System.out.println(figura.calcularArea());
        }

        in.close();
    }
}

