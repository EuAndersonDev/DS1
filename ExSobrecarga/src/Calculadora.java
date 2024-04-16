import java.util.List;
public class Calculadora {
    // Atributos
    private String nome;
    private double resultado;
    
    // Métodos get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    // Método de soma inteiros e decimais
    public void soma(int n1, int n2) {
        resultado = n1 + n2;
    }
    public void soma(double n1, double n2){
        resultado = n1 + n2;
    }

    //Método de subtração inteiros e decimais
    public void subtracao(int n1, int n2){
        resultado = n1 - n2;
    }
    public void subtracao(double n1, double n2){
        resultado = n1 - n2;
    }

    // Método de soma para uma lista de números
    public void soma(List<Double> numeros) {
        resultado = 0;
        for (Double num : numeros) {
            resultado += num;
        }
    }

    // Método de subtração para uma lista de números
    public void subtracao(List<Double> numeros) {
        if ( ! numeros.isEmpty() ) {
            resultado = numeros.get(0);
            for (int i = 1; i < numeros.size(); i++) {
                resultado -= numeros.get(i);
            }
        }
    }


}

