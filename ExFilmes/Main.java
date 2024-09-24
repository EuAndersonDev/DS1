import java.util.*;
public class Main {

	public static void main(String[] args) {
		int i = 0;
		int k = 0;
		ArrayList<Filme> filmes = new ArrayList<>();
		String resp = "s";
		Scanner in = new Scanner(System.in);
		
		Filme filme1 = new Filme();
		filme1.setTitulo("Os vingadores");
		filme1.setDuracaoEmMinutos(142);
		System.out.printf(filme1.exibirDuracaoEmHoras());
		
		Filme filme2 = new Filme();
		filme2.setTitulo("Hotel TransilvÃ¢nia");
		filme2.setDuracaoEmMinutos(93);
		System.out.printf(filme2.exibirDuracaoEmHoras());
		
		System.out.println("Os filmes em cartaz sÃ£o "+ filme1.getTitulo() + " e " + filme2.getTitulo() + ".");
		System.out.println();
		
		while (!resp.equalsIgnoreCase("n")) {
		    filmes.add(cadastrarFilme());
		    if (filmes.size() % 2 == 0 && filmes.size() >= 2) {
		        System.out.println("Os filmes em cartaz são " +
		            filmes.get(filmes.size() - 1).getTitulo() + " e " +
		            filmes.get(filmes.size() - 2).getTitulo());
		        System.out.println();
		    }

		    System.out.print("Deseja cadastrar mais um filme? Digite S para continuar e N para parar. ");
		    resp = in.next();
		}
		
	}

	public static Filme cadastrarFilme() {
		String nome;
		
		Scanner in = new Scanner(System.in);
		
		Filme filmes = new Filme();
		
		System.out.print("Insira o nome do filme: ");
		filmes.setTitulo(in.nextLine());
		nome = filmes.getTitulo();
		
		System.out.print("Insira o tempo de duração do filme em minutos: ");
		filmes.setDuracaoEmMinutos(in.nextInt());
		
		System.out.println(filmes.exibirDuracaoEmHoras());
		
		
		return filmes;
	}
	
}
