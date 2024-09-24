
public class Cliente {
	private String nome;
	private int idade;
	private String endereco; 
	private double valor_Pedido;
	private double valor_Promocional;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public double getValor_Pedido() {
		return valor_Pedido;
	}
	
	public void setValor_Pedido(double valor_Pedido) {
		this.valor_Pedido = valor_Pedido;
	}
	
	public double getValor_Promocional() {
		return valor_Promocional;
	}
	
	public void setValor_Promocional(double valor_Promocional) {
		this.valor_Promocional = valor_Promocional;
	}
	
    public double calculaDesconto(double preco) {
		double valorDesconto = preco - (preco*0.1);
		this.setValor_Promocional(valorDesconto);
		return valorDesconto;
	}
}
