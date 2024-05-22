import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cliente cliente1 = new Cliente();
        ClientePremium cliente2 = new ClientePremium();

        // Definindo os atributos de cliente1
        System.out.print("Insira o nome do Cliente Normal: ");
        cliente1.setNome(in.nextLine());
        System.out.print("Insira a idade do Cliente Normal: ");
        cliente1.setIdade(in.nextInt());
        in.nextLine();
        System.out.print("Insira o endere�o do Cliente Normal: ");
        cliente1.setEndereco(in.nextLine());
        System.out.print("Insira o valor do pedido do Cliente Normal: ");
        cliente1.setValor_Pedido(in.nextDouble());
        in.nextLine();
        
        System.out.println();
        
        // Definindo os atributos de cliente2
        System.out.print("Insira o nome do Cliente Premium:");
        cliente2.setNome(in.nextLine());
        System.out.print("Insira a idade do Cliente Premium:");
        cliente2.setIdade(in.nextInt());
        in.nextLine();
        System.out.print("Insira o endere�o do Cliente Premium:");
        cliente2.setEndereco(in.nextLine());
        System.out.print("Insira o valor do pedido do Cliente Premium:");
        cliente2.setValor_Pedido(in.nextDouble());

        // Apresentção
        System.out.println("Cliente: " + cliente1.getNome() + ", Idade: " + cliente1.getIdade() + ", Endereço: " + cliente1.getEndereco());
        System.out.println("Cliente normal tem desconto de 10% porcento logo o preço final fica: " + cliente1.calculaDesconto(cliente1.getValor_Pedido()));
        System.out.println("-----------------------------------------------------------");
        System.out.println("Cliente Premium: " + cliente2.getNome() + ", Idade: " + cliente2.getIdade() + ", Endereço: " + cliente2.getEndereco());
        System.out.println("Cliente premium tem desconto de 15% porcento logo o preço final fica: " + cliente2.calculaDesconto(cliente2.getValor_Pedido()));
        
        in.close();
	}
}
