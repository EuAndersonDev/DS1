import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Calculo Sal�rio Liquido de Pedro
		Funcionario pedro = new Funcionario();
		System.out.print("Insira o salario bruto de Pedro: ");
		pedro.salarioBruto = in.nextDouble();
		System.out.println("O sal�rio liquido de Pedro �: "+pedro.calcSalarioLiquido());
		
		//Aumento no sal�rio de Pedro
		System.out.print("Insira a porcentagem de aumento no sal�rio de Pedro: ");
		double valor = in.nextDouble();
		pedro.aumentaSalario(valor);
		System.out.println("O sal�rio l�quido de Pedro ap�s reajuste ficou em: "+pedro.salarioLiquido);

		//Calculo Sal�rio Liquido de Vagner
		Funcionario vagner = new Funcionario();
		System.out.print("Insira o salario bruto de Vagner: ");
		vagner.salarioBruto = in.nextDouble();
		System.out.println("O sal�rio liquido de Vagner �: "+vagner.calcSalarioLiquido());
		
		//Aumentor no sal�rio de Vagner
		System.out.print("Insira a porcentagem de aumento no sal�rio de Vagner: ");
		valor = in.nextDouble();
		vagner.aumentaSalario(valor);
		System.out.println("O sal�rio l�quido de Vagner ap�s reajuste ficou em: "+vagner.salarioLiquido);
	}
}
