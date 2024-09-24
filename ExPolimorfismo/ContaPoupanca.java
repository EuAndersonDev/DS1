
public class ContaPoupanca extends Conta{
	private double percentualRendimento = 0.01;
	
    public ContaPoupanca(String nome, String cpf, String numeroConta, double saldo) {
        super(nome, cpf, numeroConta, saldo);
    }
	
	public double atualizarSaldo() {
		super.setSaldo(super.getSaldo() + (super.getSaldo()*percentualRendimento));
		return super.getSaldo();
	}
}
