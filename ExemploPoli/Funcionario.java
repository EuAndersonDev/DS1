
public class Funcionario {
 
	private String nome;
	private String cpf;
	protected int salario;

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
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	// Metodo que retorna a bonificacao do funcionario 
	public double getBonificacao (){
		return salario * 0.10;
	}
}