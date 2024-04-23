import java.util.ArrayList;
import java.util.List;
public class Calculadora {
	
    private String nome;
    private double resultado;
    
    //gets e sets
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
    
    // Metodos de soma
    public void soma(int n1, int n2) {
        resultado = n1 + n2;
    }
    public void soma(double n1, double n2){
        resultado = n1 + n2;
    }
    
    public void soma(Number n1, Number n2){
        resultado = n1.doubleValue() + n2.doubleValue();
    }
    
    public void soma(List<Double> numeros) {
        double sum = 0;
        for (double num : numeros) {
            sum += num;
        }
        resultado = sum;
    }
    
    //Metodo de subtracao
    public void subtracao(int n1, int n2){
        resultado = n1 - n2;
    }
    public void subtracao(double n1, double n2){
        resultado = n1 - n2;
    }
    
    public void subtracao(Number n1, Number n2){
        resultado = n1.doubleValue() - n2.doubleValue();
    }
    
    public void subtracao(List<Double> numeros) {
        if (numeros.size() > 0) {
            double sub = numeros.get(0);
            for (int i = 1; i < numeros.size(); i++) {
                sub -= numeros.get(i);
            }
            resultado = sub;
        } else {
            System.out.println("Lista de números vazia ou inválida");
            resultado = 0;
        }
    }
    
    
	
}
