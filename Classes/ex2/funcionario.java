package ex2;

public class funcionario {
    String nome;
    double salarioBruto;
    double imposto = 0.20;
    double salarioLiquido;

    double calcSalarioLiquido() {
        salarioLiquido = salarioBruto -(salarioBruto*imposto);
        return salarioLiquido;
    }

    double aumentaSalario(double aumenta){
        aumenta = aumenta/100;
        salarioBruto = salarioBruto+ (salarioBruto*aumenta);
        salarioLiquido = salarioBruto - (salarioBruto*imposto);
        return salarioLiquido;
        
    }

    
}
