
public class Filme extends Conteudo {

	private int duracao;

	public Filme(String categoria, String titulo, int duracao) {
		super(categoria, titulo);
		this.duracao = duracao;
	}
	
	@Override
	public void descricao() {
		super.descricao();
		System.out.println("Duração: "+this.duracao+" minutos");
	}
	
}
