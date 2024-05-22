
public class Carro extends Veiculo {
	
	private String qtde_portas;

	public String getQtde_portas() {
		return qtde_portas;
	}

	public void setQtde_portas(String qtde_portas) {
		this.qtde_portas = qtde_portas;
	}


	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Quantidade de portas: " + this.qtde_portas);
	}
}
