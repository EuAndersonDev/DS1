import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int senha = 0;
		
		while(senha!=2002) {
			System.out.print("Digite a senha: ");
			senha = in.nextInt();
			if(senha!=2002) {
				System.out.println("Senha incorreta");
			}	
		}
		
		System.out.println("Senha correta!");
	}
}
