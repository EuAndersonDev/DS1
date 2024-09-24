
public class JogoFisico extends Jogo {

	private int quantidadeJogadores;
	private int tempoPartida;
	
	public int getQuantidadeJogadores() {
		return quantidadeJogadores;
	}
	
	public void setQuantidadeJogadores(int quantidadeJogadores) {
		this.quantidadeJogadores = quantidadeJogadores;
	}
	
	public int getTempoPartida() {
		return tempoPartida;
	}
	
	public void setTempoPartida(int tempoPartida) {
		this.tempoPartida = tempoPartida;
	}
	
	public int calcularTempoTotal(int quantidadePartidas) {
		int tempoTotal = quantidadePartidas * this.tempoPartida;
		return tempoTotal;
	}
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Quantidade de jogadores: " + this.quantidadeJogadores);
		System.out.println("Tempo da partida: " + this.tempoPartida);
	}
	
}
