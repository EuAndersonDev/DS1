
public class Carro extends Veiculo {

    public Carro() {

    }

    public Carro(String modelo, double valorTabela, String cor, String combustivel) {
        super(modelo, valorTabela, cor, combustivel);
    }

    @Override
    public double calculaIpva() {
        return getValorTabela() * 0.04;
    }
}