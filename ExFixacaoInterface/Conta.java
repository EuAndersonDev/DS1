
public abstract class Conta implements OperacoesConta {
	
	private double saldo = 0;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void verificarSaldo() {
		System.out.println("Seu saldo � de R$ " + saldo);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
