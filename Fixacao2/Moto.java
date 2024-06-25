public class Moto extends Veiculo {

    public Moto(String modelo, double valorTabela, String cor, String combustivel) {
        super(modelo, valorTabela, cor, combustivel);
    }

    @Override
    public double calculaIpva() {
        return getValorTabela() * 0.02;
    }
}
