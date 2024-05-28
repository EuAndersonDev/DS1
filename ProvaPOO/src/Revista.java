
public class Revista extends Livro {
	private int numeroEdicao;
	private String mesPublicacao;
	//construtor
	public Revista(String titulo, String autor, int anoPublicacao, int numeroDePaginas, String editora,
			int numeroEdicao, String mesPublicacao) {
		super(titulo, autor, anoPublicacao, numeroDePaginas, editora);
		this.numeroEdicao = numeroEdicao;
		this.mesPublicacao = mesPublicacao;
	}
	//gets e sets
	public int getNumeroEdicao() {
		return numeroEdicao;
	}


	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}


	public String getMesPublicacao() {
		return mesPublicacao;
	}


	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}

	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Numero da edição : "+this.numeroEdicao);

	}  
	public void exibirDetalhes(Boolean mesPublicacao) {
		super.exibirDetalhes();
		System.out.println("Numero de paginas: "+this.mesPublicacao);
	    if (mesPublicacao)
	            System.out.println("Editora: " + mesPublicacao);
	}
}
