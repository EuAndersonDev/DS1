package revisao;
import java.util.*;
public class ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int anoNas, anoAt,idade;
		String resposta = "sim";
		
		while(! resposta.equalsIgnoreCase("NÃO")) {
			
		
		System.out.println("digite o ano atual: ");
		anoAt = ler.nextInt();
		
		System.out.println("Entre com o ano de nascimento: ");
		anoNas = ler.nextInt();
		idade = anoAt - anoNas;
		
		System.out.println("A pessoa tem "+idade+ " anos");
		
		if(anoAt - anoNas>=18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		System.out.println("Deseja continuar calculando: ");
		resposta = ler.next();
		}
	
	}
			
		
}
