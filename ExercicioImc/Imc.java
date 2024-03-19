
public class Imc {
	String nome;
	int idade;
	double peso;
	double altura;
	
	String calcularImc() {
		
		double resultImc = peso / (altura * altura);
		//Arredondar resultado para duas casas decimais
		resultImc = Math.round(resultImc * 100.0) / 100.0;
		
				
		if(resultImc < 18.5) {
			return "Seu IMC resultou em: "+resultImc+" logo você é Abaixo do peso";
		} else if(resultImc < 25.0) {
			return "Seu IMC resultou em: "+resultImc+" logo você tem Peso normal";
		} else if(resultImc < 30.0) {
			return "Seu IMC resultou em: "+resultImc+" logo você tem Sobrepeso";
		} else if(resultImc< 35.0) {
			return "Seu IMC resultou em: "+resultImc+" logo você tem Obesidade grau 1";
		} else if(resultImc < 40.0){
			return"Seu IMC resultou em: "+resultImc+" logo você tem Obesidade grau 2";
		} else {
			return "Seu IMC resultou em: "+resultImc+" logo você tem Obesidade grau 3";
		}
	}
}
