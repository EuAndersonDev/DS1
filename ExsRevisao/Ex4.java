import java.util.Scanner;
import java.time.localDate;
public class Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
  LocalDate data = LocalDate.now();
		int anoAtual, anoNasc, idade;
		String resposta = "sim";
		
		while(! resposta.equalsIgnoreCase("NÃO")) {
			System.out.print("Digite o ano atual: ");
			anoAtual = data.getYear();
			System.out.print("Digite o ano de nascimento: ");
			anoNasc = in.nextInt();
			idade = anoAtual-anoNasc;
			
			System.out.println("A pessoa tem "+idade+" anos");
			
			if(anoAtual-anoNasc>=18) {
				System.out.println("Maior de idade");
			} else {
				System.out.println("Menor de idade");
			}
			
			System.out.println("Deseja calcular a idade de mais uma pessoa? ");
			resposta = in.next();
		}
		
		
	}
}
