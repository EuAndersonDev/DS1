

public class ClientePremium extends Cliente {

	public ClientePremium(String nome, int idade, String endereco, double valor_pedido) {
		super(nome, idade, endereco, valor_pedido);
		// TODO Auto-generated constructor stub
	}
	
	public ClientePremium() {
		super();
	}

	@Override
	public double calculaDesconto() {
		double novoValor = super.getValor_pedido() - (super.getValor_pedido() * 0.15); // 15%
		super.setValor_promocional(novoValor);
		return novoValor;	
	}
}