
public class Serie extends Conteudo {

	private int duracao;
	private int quantEpisodios;
	private int quantTemps;
	
	public Serie(String categoria, String titulo, int duracao, int quantEpisodios, int quantTemps) {
		super(categoria, titulo);
		this.duracao = duracao;
		this.quantEpisodios = quantEpisodios;
		this.quantTemps = quantTemps;
	}
	
	@Override
	public void descricao() {
		super.descricao();
		System.out.println("Duração: " + this.duracao+" minutos");
		System.out.println("Quantidade de episodios: " + this.quantEpisodios);
		System.out.println("Quantidade de temporadas: " + this.quantTemps);
	}
	
}
