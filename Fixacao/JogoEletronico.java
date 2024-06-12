class JogoEletronico extends Jogo {
    private String plataforma;
    private String genero;

    // Construtor
    public JogoEletronico(String nome, double preco, String distribuidora, String plataforma, String genero) {
        super(nome, preco, distribuidora);
        this.plataforma = plataforma;
        this.genero = genero;
    }

    // Métodos acessores
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método para jogar online
    public void jogarOnline(int quantidadeJogadores) {
        System.out.println("Jogando online com " + quantidadeJogadores + " jogadores");
    }

    // Sobrescrevendo método para exibir informações
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Gênero: " + genero);
    }
}

