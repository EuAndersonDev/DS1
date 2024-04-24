
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Produto p1 = new Produto();
		String resposta = "SIM";

		while(! resposta.equalsIgnoreCase("NÃO")){
		System.out.print("Coloque o id do produto: ");
		p1.setId(in.nextInt());
		
		System.out.print("Coloque o nome do produto: ");
		p1.setNome(in.next());
		
		System.out.print("Coloque o preço original: ");	
		p1.setPreco(in.nextDouble());
		
		System.out.println("Estas são as informações do produto e esse foi o desconto: ");
		System.out.println("ID: "+p1.getId());
		System.out.println("Nome Produto: "+p1.getNome());
		System.out.println("Preço original: "+p1.getPreco());
		System.out.println("Preço com desconto: "+ p1.calcularDesconto(10.0));
		System.out.println("");
		System.out.print("Deseja cadastrar outro produto? ");
		resposta = in.next();
		System.out.println();
		}
		
	}
}
