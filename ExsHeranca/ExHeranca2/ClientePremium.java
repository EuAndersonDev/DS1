
public class ClientePremium extends Cliente {
	
	@Override
    public double calculaDesconto(double preco) {
        double valorDesconto = preco - (preco*0.15);
        this.setValor_Promocional(valorDesconto);
        return valorDesconto;
	}
}
