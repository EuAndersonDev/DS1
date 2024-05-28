

public class Livro extends Publicacao{
	private int numeroDePaginas;
	private String editora;
	
	//construtores
	public Livro(String titulo, String autor, int anoPublicacao, int numeroDePaginas, String editora) {
		super(titulo, autor, anoPublicacao);
		this.numeroDePaginas = numeroDePaginas;
		this.editora = editora;
	}
	
	//gets e sets
	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}


	 @Override
	    public void exibirDetalhes() {
	        super.exibirDetalhes();
	        System.out.println("Número de Páginas: " + numeroDePaginas);
	        System.out.println("Editora: " + editora);
	    }
	 
	    public void exibirDetalhes(boolean incluirEditora) {
	        super.exibirDetalhes();
	        System.out.println("Número de Páginas: " + numeroDePaginas);
	        if (incluirEditora) {
	            System.out.println("Editora: " + editora);
	        }
	    }
	}
	
