
public class ContaCorrente extends Conta{
	private double tarifaMensal;
	
    public ContaCorrente(String nome, String cpf, String numeroConta, double saldo, double tarifaMensal) {
        super(nome, cpf, numeroConta, saldo);
        this.tarifaMensal = tarifaMensal;
    }
	
    public double getTarifaMensal() {
    	return this.tarifaMensal;
    }
    
}
