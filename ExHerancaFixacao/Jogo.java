
public class Jogo {

	private String nome;
	private double preco;
	private String distribuidora;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDistribuidora() {
		return distribuidora;
	}
	
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	
	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Preco: " + this.preco);
		System.out.println("Distribuidora: " + this.distribuidora);
	}
	
	
}
