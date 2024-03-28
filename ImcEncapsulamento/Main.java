import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		int idade;
		double peso, altura;
		
		Imc teste = new Imc();
		System.out.print("Digite seu nome: ");
		teste.setNome(in.next());
		System.out.print("Digite sua idade: ");
		teste.setIdade(in.nextInt());
		System.out.print("Digite seu peso: ");
		teste.setPeso(in.nextDouble());
		System.out.print("Digite sua altura em metros: ");
		teste.setAltura(in.nextDouble());
		teste.printFinal();
		
		System.out.println(teste.calcularImc());
		
		Imc teste2 = new Imc();
		System.out.print("Digite seu nome: ");
		teste2.setNome(in.next());
		System.out.print("Digite sua idade: ");
		teste2.setIdade(in.nextInt());
		System.out.print("Digite seu peso: ");
		teste2.setPeso(in.nextDouble());
		System.out.print("Digite sua altura em metros: ");
		teste2.setAltura(in.nextDouble());
		teste2.printFinal();
		
		in.close();
	}
}
