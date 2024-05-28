
public class Publicacao {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	//construtores
	public Publicacao(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	//gets e sets
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
		System.out.println("Ano da publicação: "+this.anoPublicacao);
	}
}
