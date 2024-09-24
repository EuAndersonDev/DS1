import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		String resposta;
		
		Scanner in = new Scanner(System.in);
		
		Livro livro1 = new Livro("Harry", "JK Rowling", 1999, 200, "RogerGuedes");
		Revista revista1 = new Revista("Revista do cesar", "Cesar", 2024, 3, "Maio");
		
		
		System.out.println("Quer ver a editora do livro? S para sim N para não");
		resposta = in.next();
		System.out.println("Detalhes do Livro: ");
		if(resposta.equalsIgnoreCase("S")) {
			livro1.exibirDetalhes();
		} else {
			livro1.exibirDetalhes(false);
		}
		
		System.out.println("------------------");
		
		System.out.println("Quer ver o mes de publicacao da revista? S para sim N para não");
		resposta = in.next();
		System.out.println("Detalhes da Revista: ");
		if(resposta.equalsIgnoreCase("S")) {
			revista1.exibirDetalhes();
		} else {
			revista1.exibirDetalhes(false);
		}
		
		Livro livro2 = new Livro();
		System.out.println("------------------");
		System.out.println("Agora com seus dados...");
		livro2.cadastrarPublicacao();
	    System.out.println("Agora vamos exibir os detalhes do livro...");
	    System.out.println("Quer ver a editora do livro? S para sim N para não");
		resposta = in.next();
		System.out.println("Detalhes do Livro: ");
		if(resposta.equalsIgnoreCase("S")) {
			livro2.exibirDetalhes();
		} else {
			livro2.exibirDetalhes(false);
		}
		
		Revista revista2 = new Revista();
	    
		System.out.println("------------------------------");
		System.out.println("Agora vamos cadastrar uma revista com seus dados...");
		
		in.close();
	}
	
	
}
