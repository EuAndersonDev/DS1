import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//Calculo Salário Liquido de Pedro
		Funcionario pedro = new Funcionario();
		System.out.print("Insira o salario bruto de Pedro: ");
		pedro.salarioBruto = in.nextDouble();
		System.out.println("O salário liquido de Pedro é: "+pedro.calcSalarioLiquido());
		
		//Aumento no salário de Pedro
		System.out.print("Insira a porcentagem de aumento no salário de Pedro: ");
		double valor = in.nextDouble();
		pedro.aumentaSalario(valor);
		System.out.println("O salário líquido de Pedro após reajuste ficou em: "+pedro.salarioLiquido);

		//Calculo Salário Liquido de Vagner
		Funcionario vagner = new Funcionario();
		System.out.print("Insira o salario bruto de Vagner: ");
		vagner.salarioBruto = in.nextDouble();
		System.out.println("O salário liquido de Vagner é: "+vagner.calcSalarioLiquido());
		
		//Aumentor no salário de Vagner
		System.out.print("Insira a porcentagem de aumento no salário de Vagner: ");
		valor = in.nextDouble();
		vagner.aumentaSalario(valor);
		System.out.println("O salário líquido de Vagner após reajuste ficou em: "+vagner.salarioLiquido);
	}
}
