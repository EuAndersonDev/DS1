import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Instanciando 2 Carros
        System.out.println("Digite os dados do primeiro carro:");
        Carro carro1 = lerDadosCarro(in);

        System.out.println("Digite os dados do segundo carro:");
        Carro carro2 = lerDadosCarro(in);

        // Instanciando 2 Motos
        System.out.println("Digite os dados da primeira moto:");
        Moto moto1 = lerDadosMoto(in);

        System.out.println("Digite os dados da segunda moto:");
        Moto moto2 = lerDadosMoto(in);

        // Imprimindo a ficha técnica dos veículos
        System.out.println("\nFicha técnica do primeiro carro:");
        carro1.imprimirFicha();

        System.out.println("\nFicha técnica do segundo carro:");
        carro2.imprimirFicha();

        System.out.println("\nFicha técnica da primeira moto:");
        moto1.imprimirFicha();

        System.out.println("\nFicha técnica da segunda moto:");
        moto2.imprimirFicha();

        in.close();
    }

    private static Carro lerDadosCarro(Scanner in) {
        System.out.print("Modelo: ");
        String modelo = in.nextLine();
        System.out.print("Valor da Tabela: ");
        double valorTabela = in.nextDouble();
        in.nextLine();  // Consumir a quebra de linha
        System.out.print("Cor: ");
        String cor = in.nextLine();
        System.out.print("Combustível: ");
        String combustivel = in.nextLine();

        return new Carro(modelo, valorTabela, cor, combustivel);
    }

    private static Moto lerDadosMoto(Scanner in) {
        System.out.print("Modelo: ");
        String modelo = in.nextLine();
        System.out.print("Valor da Tabela: ");
        double valorTabela = in.nextDouble();
        in.nextLine();  // Consumir a quebra de linha
        System.out.print("Cor: ");
        String cor = in.nextLine();
        System.out.print("Combustível: ");
        String combustivel = in.nextLine();

        return new Moto(modelo, valorTabela, cor, combustivel);
    }
}
