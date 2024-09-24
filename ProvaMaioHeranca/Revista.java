
public class Revista extends Publicacao {

	private int numeroEdicao;
	private String mesPublicacao;
	
	public Revista() {
		
	}
	
	public Revista(String titulo, String autor, int anoPublicacao, int numeroEdicao, String mesPublicacao) {
		super(titulo, autor, anoPublicacao);
		this.numeroEdicao = numeroEdicao;
		this.mesPublicacao = mesPublicacao;
	}
	
	
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
		System.out.println("Numero da edicao: "+this.numeroEdicao);
		System.out.println("Mes de publicaca: "+this.mesPublicacao);
	}
	public void cadastrarPublicacao() {
		super.cadastrarPublicacao();
		System.out.print("Insira o numero da edicao da publicacao: ");
		this.setNumeroEdicao(in.nextInt());
		System.out.print("Insira o mes de publicacao da publicacao: ");
		this.setMesPublicacao(in.next());
	}
	
	
	public void exibirDetalhes(boolean booleano) {
		if(booleano) {
			this.exibirDetalhes();
		} else {
			super.exibirDetalhes();
			System.out.println("Numero da edicao: "+this.numeroEdicao);
		}
	}
	
}
