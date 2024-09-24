import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Instanciação do primeiro carro
        Carro carro1 = new Carro();
        System.out.println("Digite os dados do primeiro carro:");
        System.out.print("Modelo: ");
        carro1.setModelo(in.nextLine());
        System.out.print("Valor Tabela: ");
        carro1.setValorTabela(Double.parseDouble(in.nextLine()));
        System.out.print("Cor: ");
        carro1.setCor(in.nextLine());
        System.out.print("Combustível: ");
        carro1.setCombustivel(in.nextLine());
        carro1.setIpva(carro1.calculaIpva());

        // Instanciação do segundo carro
        Carro carro2 = new Carro();
        System.out.println("Digite os dados do segundo carro:");
        System.out.print("Modelo: ");
        carro2.setModelo(in.nextLine());
        System.out.print("Valor Tabela: ");
        carro2.setValorTabela(Double.parseDouble(in.nextLine()));
        System.out.print("Cor: ");
        carro2.setCor(in.nextLine());
        System.out.print("Combustível: ");
        carro2.setCombustivel(in.nextLine());
        carro2.setIpva(carro2.calculaIpva());

        // Instanciação da primeira moto
        Moto moto1 = new Moto();
        System.out.println("Digite os dados da primeira moto:");
        System.out.print("Modelo: ");
        moto1.setModelo(in.nextLine());
        System.out.print("Valor Tabela: ");
        moto1.setValorTabela(Double.parseDouble(in.nextLine()));
        System.out.print("Cor: ");
        moto1.setCor(in.nextLine());
        System.out.print("Combustível: ");
        moto1.setCombustivel(in.nextLine());
        moto1.setIpva(moto1.calculaIpva());

        // Instanciação da segunda moto
        Moto moto2 = new Moto();
        System.out.println("Digite os dados da segunda moto:");
        System.out.print("Modelo: ");
        moto2.setModelo(in.nextLine());
        System.out.print("Valor Tabela: ");
        moto2.setValorTabela(Double.parseDouble(in.nextLine()));
        System.out.print("Cor: ");
        moto2.setCor(in.nextLine());
        System.out.print("Combustível: ");
        moto2.setCombustivel(in.nextLine());
        moto2.setIpva(moto2.calculaIpva());

        // Imprimir a ficha técnica de todos os veículos
        System.out.println("\nFicha Técnica dos Veículos:");
        carro1.imprimirFicha();
        System.out.println("-------------------------");
        carro2.imprimirFicha();
        System.out.println("-------------------------");
        moto1.imprimirFicha();
        System.out.println("-------------------------");
        moto2.imprimirFicha();

        in.close();
    }
}