
public class Moto extends Veiculo{
	
	private String cilindrada;

	public Moto(String modelo, double valorTabela, String cor, String combustivel) {
        //TODO Auto-generated constructor stub
    }

    public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public void imprime() {
		super.imprime();
		System.out.println("Cilindrada: " + this.cilindrada);
	}

    public void imprimirFicha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirFicha'");
    }
	
}
