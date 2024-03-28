
import java.util.Scanner;
public class main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        quadrado quadrado1 = new quadrado();
        System.out.println("Insira a altura do quadrado 1");
        quadrado1.altura = in.nextDouble();
        System.out.println("Insira a base do quadrado 1");
        quadrado1.base = in.nextDouble();

        quadrado quadrado2 = new quadrado();
        System.out.println("Insira a altura do quadrado 2");
        quadrado2.altura = in.nextDouble();
        System.out.println("Insira a base do quadrado 2");
        quadrado2.base = in.nextDouble();

        System.out.println("A area do quadrado 1 é: "+quadrado1.calcularArea()+", e a area do quadrado 2 é:"+quadrado2.calcularArea());
    }
}