
public class Produto {
	private int id;
	private String nome;
	private double preco;
	
	//gets e sets
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	//valor obtido = (valor obtido x 100)/valorTotal
	//metodos
	public double calcularDesconto (double desconto) {
		double precoDesconto = preco - (preco * (desconto / 100));
		return precoDesconto;
		
	}

}
