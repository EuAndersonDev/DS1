public class Main {
    public static void main(String[] args) {
        // Criando objeto da classe JogoEletronico
        JogoEletronico jogoEletronico = new JogoEletronico("Super Mario", 59.99, "Nintendo", "Switch", "Plataforma");
        jogoEletronico.exibirInformacoes();
        jogoEletronico.jogarOnline(4);

        System.out.println();

        // Criando objeto da classe JogoFisico
        JogoFisico jogoFisico = new JogoFisico("Monopoly", 39.99, "Hasbro", 6, 120);
        jogoFisico.exibirInformacoes();
        int tempoTotal = jogoFisico.calcularTempoTotal(3);
        System.out.println("Tempo Total de Jogo: " + tempoTotal + " minutos");
    }
}
