import java.util.*;

public class MainCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  soma = 1, subtracao = 2, operacao;
        // Testando a classe Calculadora
        Calculadora calc = new Calculadora();

        System.out.println("Você deseja fazer que operação, digite 1 para soma e 2 para subtração: ");
        operacao = in.nextInt();

        if (operacao <= soma) {
            // soma de inteiros
            calc.soma(5, 3);
            System.out.println("Soma de inteiros: " + calc.getResultado());
            // soma de decimais
            calc.soma(5.5, 3.7);
            System.out.println("Soma de decimais: " + calc.getResultado());

        } else {
            // subtração de inteiros
            calc.subtracao(10, 3);
            System.out.println("Subtração de inteiros: " + calc.getResultado());
            // subtração de decimais
            calc.subtracao(10.5, 3.2);
            System.out.println("Subtração de decimais: " + calc.getResultado());
        }
        
        //soma de uma lista de números
        //calc.soma(List.of(1.5, 2.5, 3.5));
        //System.out.println("Soma da lista de números: " + calc.getResultado());

        //subtração de uma lista de números
        //calc.subtracao(List.of(10.0, 2.5, 1.5));
        //System.out.println("Subtração da lista de números: " + calc.getResultado());
    }
}
