import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int res = 1, resCliente, cc = 0;

		while (res == 1) {
			System.out.println("Escolha seu plano: 0 - Cliente Comum | 1 - Cliente Premium");
			resCliente = ler.nextInt();
			System.out.println("Digite seu nome:");
			String nomeC = ler.next();
			System.out.println("Digite sua idade:");
			int idadeC = ler.nextInt();
			System.out.println("Digite seu endereço:");
			String enderecoC = ler.nextLine();
			ler.nextLine();
			System.out.println("Digite o valor do pedido:");
			double valor_pedidoC = ler.nextDouble();
			
			if(resCliente == 0) {
				Cliente c1 = new Cliente(nomeC, idadeC, enderecoC, valor_pedidoC);
				System.out.printf("Valor promocional: R$%.2f\n", c1.calculaDesconto());
			} else {
				ClientePremium cp1 = new ClientePremium(nomeC, idadeC, enderecoC, valor_pedidoC);
				System.out.printf("Valor promocional: R$%.2f\n", cp1.calculaDesconto());
			}
			
			System.out.println("Deseja continuar? 0 - Não | 1 - Sim");
			res = ler.nextInt();
		}
		
		System.out.println("... fim do programa");

		ler.close();
	}
}