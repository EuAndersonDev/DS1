import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		int operacao, n = 0;
		double num1, num2;
		
        System.out.println("Escolha sua operação");
        System.out.println("Digite 1 para soma de dois numeros");
        System.out.println("Digite 2 para subtracao de dois numeros");
        System.out.println("Digite 3 para a soma de uma lista de numeros");
        System.out.println("Digite 4 para a subtracao de uma lista de numeros");
        operacao = in.nextInt();
		
        
        switch(operacao) {
	        case 1:
	            System.out.println("Digite dois números para soma:");
	            num1 = in.nextDouble();
	            num2 = in.nextDouble();
	            calc.soma(num1, num2);
	            System.out.println("Soma: " + calc.getResultado());
	            break;
	        case 2:
	            System.out.println("Digite dois números para subtrai-los:");
	            num1 = in.nextDouble();
	            num2 = in.nextDouble();
	            calc.subtracao(num1, num2);
	            System.out.println("Subtracao: " + calc.getResultado());
	        	break;
	        case 3:
	            System.out.println("Soma de uma lista de numeros. Digite quantos números deseja somar:");
	            n = in.nextInt();
	            List<Double> numerosS = new ArrayList<>();
	            System.out.println("Digite os numeros:");
	            for (int i = 0; i < n; i++) {
	                numerosS.add(in.nextDouble());
	            }
	            calc.soma(numerosS);
	            System.out.println("Resultado: " + calc.getResultado());

	        	break;
	        case 4:
	            System.out.println("Subtração de uma lista de números. Digite quantos números deseja subtrair:");
	            n = in.nextInt();
	            List<Double> numerosSub = new ArrayList<>();
	            System.out.println("Digite os números:");
	            for (int i = 0; i < n; i++) {
	                numerosSub.add(in.nextDouble());
	            }
	            calc.subtracao(numerosSub);
	            System.out.println("Resultado: " + calc.getResultado());
	            break;
	        default:
	        	System.out.println("Essa opção não existe!");
	        	break;
        }

		
	}

}
