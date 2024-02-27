package revisao;
import java.util.*;
public class ex3 {
	public static void main(String[] args) {
		//criar objeto scanner
		Scanner ler = new Scanner(System.in);
		int senha = 0;
	
		while(senha != 2002) {
			System.out.println("Digete a senha: ");
			senha = ler.nextInt();
			
			if(senha != 2002) {
				System.out.println("senha incorreta: "); 
			}
		}
		System.out.println("Acesso permitido");
	}

}
