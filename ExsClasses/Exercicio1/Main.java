import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Quadrado quadrado1 = new Quadrado();
		System.out.print("Insira a altura do quadrado 1: ");
		quadrado1.altura = in.nextDouble();
		System.out.print("Insira a base do quadrado 1: ");
		quadrado1.base = in.nextDouble();
		
		Quadrado quadrado2 = new Quadrado();
		System.out.print("Insira a altura do quadrado 2: ");
		quadrado2.altura = in.nextDouble();
		System.out.print("Insira a base do quadrado 2: ");
		quadrado2.base = in.nextDouble();
		
		System.out.println("A �rea do quadrado 1 �: "+quadrado1.calcularArea()+" e a �rea do quadrado 2 �: "+quadrado2.calcularArea());
				
		
	}

}
