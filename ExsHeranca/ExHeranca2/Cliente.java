
public class Cliente {
	
	private String nome;
	private int idade;
	private String endereco;
	private double valor_pedido;
	private double valor_promocional;
	
	// Construtores
	public Cliente(String nome, int idade, String endereco, double valor_pedido) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.valor_pedido = valor_pedido;
	}
	
	public Cliente() {
		
	}

	// Métodos Cliente
	public double calculaDesconto() {
		double novoValor = this.valor_pedido - (this.valor_pedido * 0.1); // 10%
		this.setValor_promocional(novoValor);
		return novoValor;
	}
	
	// Getters e Setters
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double getValor_pedido() {
		return this.valor_pedido;
	}
	
	public void setValor_pedido(double valor_pedido) {
		this.valor_pedido = valor_pedido;
	}
	
	public double getValor_promocional() {
		return this.valor_promocional;
	}
	
	protected void setValor_promocional(double valor_promocional) {
		this.valor_promocional = valor_promocional;
	}
}