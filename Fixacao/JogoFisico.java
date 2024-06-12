class JogoFisico extends Jogo {
    private int quantidadeJogadores;
    private int tempoPartida;

    // Construtor
    public JogoFisico(String nome, double preco, String distribuidora, int quantidadeJogadores, int tempoPartida) {
        super(nome, preco, distribuidora);
        this.quantidadeJogadores = quantidadeJogadores;
        this.tempoPartida = tempoPartida;
    }

    // Métodos acessores
    public int getQuantidadeJogadores() {
        return quantidadeJogadores;
    }

    public void setQuantidadeJogadores(int quantidadeJogadores) {
        this.quantidadeJogadores = quantidadeJogadores;
    }

    public int getTempoPartida() {
        return tempoPartida;
    }

    public void setTempoPartida(int tempoPartida) {
        this.tempoPartida = tempoPartida;
    }

    // Método para calcular tempo total
    public int calcularTempoTotal(int quantidadePartidas) {
        return tempoPartida * quantidadePartidas;
    }

    // Sobrescrevendo método para exibir informações
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quantidade de Jogadores: " + quantidadeJogadores);
        System.out.println("Tempo de Partida: " + tempoPartida + " minutos");
    }
}
