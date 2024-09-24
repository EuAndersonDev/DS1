public class Quadrado extends Figuras {
	private double comprimento;

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public Quadrado(double comprimento) {
		this.comprimento = comprimento;
	}
	
	@Override
	double calcularArea() {
		return comprimento*comprimento;
	}
	
	
}
