public class Gerente extends Funcionario {
	private int senha;
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	// M�todo que retorna o valor da bonifca��o do gerente @Override
	public double getBonificacao() {
		return super.salario * 0.15;
	}
}