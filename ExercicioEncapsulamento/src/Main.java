
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Produto p1 = new Produto();
		String resposta = "SIM";
		
		while(! resposta.equalsIgnoreCase("NÃO")){
			System.out.println("Coloque o nome do produto:");
			p1.setNome(in.next());
			
			System.out.println("Coloque o preço de custo:");	
			p1.setPrecoCusto(in.nextDouble());
			
			System.out.println("Coloque o preço de venda:");
			p1.setPrecoVenda(in.nextDouble());
			while(p1.getPrecoVenda() < p1.getPrecoCusto()) {
				teste1.setPrecoVenda(in.nextDouble());
			}
		}
		
	System.out.println("");	
        System.out.println("Produto: " + p1.getNome());
        System.out.printf("Lucro: R$%.2f\n", p1.calcularMargemLucro());
        System.out.printf("Porcentagem de lucro: %.2f%%\n", p1.getMargemLucroPorcentagem());
	System.out.println("");
    }
}
