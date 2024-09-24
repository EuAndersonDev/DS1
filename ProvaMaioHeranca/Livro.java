
public class Livro extends Publicacao{

	private int numeroPaginas;
	private String editora;

	public Livro() {
		
	}
	
	public Livro(String titulo, String autor, int anoPublicacao,int numeroPaginas, String editora) {
		super(titulo, autor, anoPublicacao);
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
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
		System.out.println("Numero de páginas: "+this.numeroPaginas);
		System.out.println("Editora: "+this.editora);
	}
	public void cadastrarPublicacao() {
		super.cadastrarPublicacao();
		System.out.print("Insira o numero de paginas da publicacao: ");
		this.setNumeroPaginas(in.nextInt());
		System.out.print("Insira a editora da publicacao: ");
		this.setEditora(in.next());
	}
	
	
	public void exibirDetalhes(boolean booleano) {
		if(booleano) {
			this.exibirDetalhes();
		} else {
			super.exibirDetalhes();
			System.out.println("Numero de páginas: "+this.numeroPaginas);
		}
	}
	
}
