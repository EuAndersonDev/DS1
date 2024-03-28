package revisao;
import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		//criar objeto scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		 int numero = ler.nextInt();
		 
		 if(numero % 2 == 0 ) {
			 System.out.println("par");
			 
		 }else {
			 System.out.println("impar");
		 }
	}
}
