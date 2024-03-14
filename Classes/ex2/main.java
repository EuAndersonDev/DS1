package ex2;
import java.util.Scanner;
public class main {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        //Calculo a salario liquido
        funcionario pedro = new funcionario();
        System.out.println("Insira o salario bruto de Pedro");
        pedro.salarioBruto = in.nextDouble();
        System.out.println("O salario liquido de Pedro é:"+pedro.calcSalarioLiquido());
        //Calculo aumento de Pedro
        System.out.println("Me fale quantos porcento você deseja aumentar o salario de pedro");
        double valor = in.nextDouble();
        pedro.aumentaSalario(valor);
        System.out.println("salario bruto atual: "+pedro.salarioBruto);
        System.out.println("O salario liquido atual de Pedro é de: "+pedro.salarioLiquido);
        

        //Calculo Salário Liquido de Vagner
		funcionario vagner = new funcionario();
		System.out.print("Insira o salario bruto de Vagner: ");
		vagner.salarioBruto = in.nextDouble();
		System.out.println("O salário liquido de Vagner é: "+vagner.calcSalarioLiquido());
		
		//Aumentor no salário de Vagner
		System.out.print("Insira a porcentagem de aumento no salário de Vagner: ");
		valor = in.nextDouble();
		vagner.aumentaSalario(valor);
        System.out.println("salario bruto atual: "+pedro.salarioBruto);
  		System.out.println("O salário líquido de Vagner após reajuste ficou em: "+vagner.salarioLiquido);
    }
}
