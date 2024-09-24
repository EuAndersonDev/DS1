import java.util.*;
public class Publicacao {

	Scanner in = new Scanner(System.in);
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Publicacao() {
		
	}
	
	public Publicacao(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public void exibirDetalhes() {
		System.out.println("Titulo: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		System.out.println("Ano de Publicacao: "+this.anoPublicacao);
	}
	
	public void cadastrarPublicacao() {
		System.out.print("Insira o título da publicacao: ");
	    this.setTitulo(in.next());
	    System.out.print("Insira o autor da publicacao: ");
	    this.setAutor(in.next());
	    System.out.print("Insira o ano de publicacao da publicacao: ");
	    this.setAnoPublicacao(in.nextInt());
	}
	
	
}
