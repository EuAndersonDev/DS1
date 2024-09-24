
public class Main {
    public static void main(String[] args) {
        
    	
        Conta c1 = new Conta("Maria", "111.222.333-44", "12345-6", 1000.0);
        ContaPoupanca cp1 = new ContaPoupanca("João", "555.666.777-88", "54321-0", 2000.0);
        ContaCorrente cc1 = new ContaCorrente("Ana", "999.888.777-66", "67890-1", 3000.0, 20.0);

        // Exibindo informações das contas
        System.out.println("Nome: " + c1.getNome());
        System.out.println("CPF: " + c1.getCpf());
        System.out.println("Número da Conta: " + c1.getNumeroConta());
        c1.imprimirSaldo();

        System.out.println("------------------------------");

        System.out.println("Nome: " + cp1.getNome());
        System.out.println("CPF: " + cp1.getCpf());
        System.out.println("Número da Conta: " + cp1.getNumeroConta());
        cp1.imprimirSaldo();
        cp1.atualizarSaldo();
        System.out.println("Saldo após rendimento: ");
        cp1.imprimirSaldo();

        System.out.println("------------------------------");

        System.out.println("Nome: " + cc1.getNome());
        System.out.println("CPF: " + cc1.getCpf());
        System.out.println("Número da Conta: " + cc1.getNumeroConta());
        cc1.imprimirSaldo();
        System.out.println("Tarifa Mensal: " + cc1.getTarifaMensal());

        System.out.println("------------------------------");

        Lucros lucros = new Lucros();
        lucros.registra(c1);
        lucros.registra(cp1);
        lucros.registra(cc1);

        System.out.println("Lucro total registrado: " + lucros.getSoma());
    }
}
