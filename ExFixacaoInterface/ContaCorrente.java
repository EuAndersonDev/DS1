
public class ContaCorrente extends Conta{
	
	private double limiteEspecial;
	
	public ContaCorrente(double saldo, double limiteEspecial) {
		super(saldo);
		this.limiteEspecial = limiteEspecial;
	}
	
	public void depositarValor(double valor) {
		System.out.println("Voc� depositou R$ "+ valor);
		valor += this.getSaldo();
		this.setSaldo(valor);
	}
	
	public void sacarValor(double valor) {
	    if (this.getSaldo() - valor >= -limiteEspecial) {
	        double temp = this.getSaldo() - valor;
	        this.setSaldo(temp);
	        System.out.println("Você sacou R$ " + valor + " e seu saldo atual é: " + temp);
	    } else {
	        // calcula o valor que pode ser sacado até atingir o limite
	        double valorPermitido = this.getSaldo() + limiteEspecial; // quanto ainda pode ser sacado
	        this.setSaldo(-limiteEspecial); // ajusta o saldo ao limite especial
	        System.out.println("Você tentou sacar R$ " + valor + ", mas só pôde sacar R$ " + valorPermitido 
	                            + " devido ao limite. Seu saldo agora é: " + this.getSaldo());
	    }
	}

	
	public void verificarSaldo() {
		System.out.println("Seu saldo �: "+ this.getSaldo());
	}

}
