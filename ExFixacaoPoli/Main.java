import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
        ArrayList<Conteudo> catalogo = new ArrayList<>();
		
        catalogo.add(new Filme("A��o", "Vingadores: Ultimato", 181));
        catalogo.add(new Filme("Drama", "A Espera de um Milagre", 189));
        catalogo.add(new Filme("Com�dia", "Os Ca�a-Fantasmas", 105));
        catalogo.add(new Filme("Terror", "It: A Coisa", 135));
        catalogo.add(new Filme("Fic��o Cient�fica", "Interstellar", 169));
        catalogo.add(new Serie("Com�dia", "Friends", 20, 10, 236));
        catalogo.add(new Serie("Drama", "Breaking Bad", 45, 5, 62));
        catalogo.add(new Serie("Fantasia", "Game of Thrones", 60, 8, 73));
        catalogo.add(new Serie("Aventura", "Stranger Things", 50, 4, 34));
        catalogo.add(new Serie("Fic��o Cient�fica", "Black Mirror", 60, 5, 22));
		
        for(int i = 0; i < catalogo.size(); i++) {
        	catalogo.get(i).descricao();
        	System.out.println("--------------------------------------");
        }
	}
}
