
class Jogo {
    private String nome;
    private double preco;
    private String distribuidora;

    // Construtor
    public Jogo(String nome, double preco, String distribuidora) {
        this.nome = nome;
        this.preco = preco;
        this.distribuidora = distribuidora;
    }

    // Métodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Distribuidora: " + distribuidora);
    }
}