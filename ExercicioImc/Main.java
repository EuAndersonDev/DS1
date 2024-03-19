import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Imc teste = new Imc();
		System.out.print("Digite seu nome: ");
		teste.nome = in.next();
		System.out.print("Digite sua idade: ");
		teste.idade = in.nextInt();
		System.out.print("Digite seu peso: ");
		teste.peso = in.nextDouble();
		System.out.print("Digite sua altura em metros: ");
		teste.altura = in.nextDouble();
		
		System.out.println(teste.calcularImc());
		
		Imc teste2 = new Imc();
		System.out.print("Digite seu nome: ");
		teste2.nome = in.next();
		System.out.print("Digite sua idade: ");
		teste2.idade = in.nextInt();
		System.out.print("Digite seu peso: ");
		teste2.peso = in.nextDouble();
		System.out.print("Digite sua altura em metros: ");
		teste2.altura = in.nextDouble();
		
		System.out.println(teste2.calcularImc());
		
	}
}
