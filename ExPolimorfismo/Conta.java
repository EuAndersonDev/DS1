
public class Conta {
	private String nome;
	private String cpf;
	private String numeroConta;
	private double saldo;
	
    public Conta(String nome, String cpf, String numeroConta, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double depositar(double quantia) {
		this.saldo += quantia; 
		return this.saldo;
	}
	
	public double sacar(double quantia) {
		this.saldo -= quantia;
		return this.saldo;
	}
	
	public void imprimirSaldo() {
		System.out.println("Saldo: "+this.saldo);
	}
	
}
