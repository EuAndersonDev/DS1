package revisao;
import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		//criar objeto scanner
		Scanner ler = new Scanner(System.in);
		
		
		 System.out.println("Digite um numero: ");
		 int numero = ler.nextInt();
		 
		 if(numero >0 ) {
			 System.out.println("Positivo");
		 } else {
			 System.out.println("Negativo");
		 }
		 
	}
}
