public abstract class Veiculo {
    private String modelo;
    private double valorTabela;
    private String cor;
    private String combustivel;
    private double ipva;

    public Veiculo(String modelo, double valorTabela, String cor, String combustivel) {
        this.modelo = modelo;
        this.valorTabela = valorTabela;
        this.cor = cor;
        this.combustivel = combustivel;
        this.ipva = calculaIpva();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorTabela() {
        return valorTabela;
    }

    public void setValorTabela(double valorTabela) {
        this.valorTabela = valorTabela;
        this.ipva = calculaIpva(); // Recalcula o IPVA quando o valor da tabela é alterado
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getIpva() {
        return ipva;
    }

    public abstract double calculaIpva();

    public void imprimirFicha() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor da Tabela: R$ " + valorTabela);
        System.out.println("Cor: " + cor);
        System.out.println("Combustível: " + combustivel);
        System.out.println("IPVA: R$ " + ipva);
    }
}
