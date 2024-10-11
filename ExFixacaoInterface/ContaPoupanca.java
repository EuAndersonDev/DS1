
public class ContaPoupanca extends Conta{

	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	public void depositarValor(double valor) {
		System.out.println("Voc� depositou R$ "+ valor);
		valor += this.getSaldo();
		this.setSaldo(valor);
	}
	
	public void sacarValor(double valor) {
		double temp = this.getSaldo() - valor;
		this.setSaldo(temp);
		System.out.println("Voc� sacou R$ "+ valor + " logo seu saldo atual �: " + temp);
	}
	
	public void verificarSaldo() {
		System.out.println("Seu saldo �: "+ this.getSaldo());
	}
	
	public void aplicarTaxa(double taxa) {
		double saldoFinal = this.getSaldo() + (this.getSaldo()*taxa);
		this.setSaldo(saldoFinal);
		System.out.println("Voc� aplicou uma taxa de "+(taxa*100)+"% no seu saldo, ent�o seu saldo final �: "+ this.getSaldo());
	}
}
