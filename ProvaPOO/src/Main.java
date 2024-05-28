import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Boolean a = false;
		
		Livro livro1 = new Livro(null, null, 0, 0, null);
		livro1.setAnoPublicacao(10);
		livro1.setAutor("u");
		livro1.setEditora("abc");
		livro1.setNumeroDePaginas(12);
		livro1.setTitulo("e");
		
		Revista revista1 = new Revista(null, null, 0, 0, null, 0, null);
		revista1.setAnoPublicacao(50);
		revista1.setAutor("aei");
		revista1.setEditora("abcdef");
		revista1.setNumeroDePaginas(15);
		revista1.setTitulo("a");
		revista1.setNumeroEdicao(500);
		revista1.setMesPublicacao("Dezembro");
		
		

		System.out.println("Livro: ");
		livro1.exibirDetalhes();
		System.out.println("-----------------------------");
		System.out.println("Revista: ");
		revista1.exibirDetalhes();
		System.out.println();
		System.out.println("Com editora");
		System.out.println();
		System.out.println("Livro: ");
		livro1.exibirDetalhes(false);
		System.out.println("-----------------------------");
		System.out.println("Revista: ");
		revista1.exibirDetalhes(false);
	
	}
}
