//Classe Para controlar os gastos da empresa com Bonifica��o
public class ControleBonificacao {
	//atributo soma, server para soma cada uma das bonifica��es
	private double soma;
	//M�todo que recebe como parametro um objeto do tipo funcionario
	public void registra (Funcionario f) {
		//executando o getBonifica��o especifico de cada funcionario e armazenado o valor dentr double boni f.getBonificacao();
		double boni = f.getBonificacao();
		// somando a variavel boni dentro da variavel soma
		this.soma = this.soma + boni;
	}
	//m�todo getSoma();
	public double getSoma() {
		return this.soma;
	}
}