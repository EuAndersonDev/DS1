
public class Imc {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	void setNome(String nome) {
		this.nome = nome;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}
	
	void setPeso(double peso) {
		this.peso = peso;
	}
	
	void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Métodos Get criados apenas para treinar sintaxe (Não os utilizamos)
	String getNome() {
		return nome;
	}
	
	int getIdade() {
		return idade;
	}
	
	double getPeso() {
		return peso;
	}
	
	double getAltura() {
		return altura;
	}
	
	
	
	String calcularImc() {
		
		double resultImc = this.peso / (this.altura * this.altura);
		//Arredondar resultado para duas casas decimais
		resultImc = Math.round(resultImc * 100.0) / 100.0;
		
				
		if(resultImc < 18.5) {
			return "Seu IMC resultou em: "+resultImc+" logo você é Abaixo do peso\n";
		} else if(resultImc < 25.0) {
			return "Seu IMC resultou em: "+resultImc+" logo você tem Peso normal\n";
		} else if(resultImc < 30.0) {
			return "Seu IMC resultou em: "+resultImc+" logo você tem Sobrepeso\n";
		} else if(resultImc< 35.0) {
			return "Seu IMC resultou em: "+resultImc+" logo você tem Obesidade grau 1\n";
		} else if(resultImc < 40.0){
			return"Seu IMC resultou em: "+resultImc+" logo você tem Obesidade grau 2\n";
		} else {
			return "Seu IMC resultou em: "+resultImc+" logo você tem Obesidade grau 3\n";
		}
	}
	
	String printFinal() {
		System.out.println(this.nome+" sua idade é: "+this.idade+",\nSeu peso: "+this.peso+", \nSua altura é de "+this.altura+"mt e:");
		return calcularImc();
	}
}
