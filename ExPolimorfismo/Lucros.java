
public class Lucros {
	private double soma;
	
	public void registra(Conta c) {
		double lucro = c.getSaldo();
		
		this.soma = this.soma + lucro;
	}
	
	public double getSoma(){
		return this.soma;
	}
}
