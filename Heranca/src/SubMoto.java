
public class Moto extends Veiculo{
	
	private String cilindrada;

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
	
}
