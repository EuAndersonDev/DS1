
public class JogoEletronico extends Jogo {
	
	private String plataforma;
	private String genero;
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void jogarOnline(int quantidadeJogadores) {
		System.out.println("Jogando online com " + quantidadeJogadores + " jogadores");
	}
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Plataforma: " + this.plataforma);
		System.out.println("Genero: " + this.genero);
	}
}
