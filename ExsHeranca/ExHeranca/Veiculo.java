
public class Veiculo {
	
	private String marca;
	private String modelo;
	private String cor;
	private int ano;

	public Veiculo(String marca2, String modelo2, String cor2, int ano2, String combustivel, Double valorTabela,
            int ipva) {
        //TODO Auto-generated constructor stub
    }

    public Veiculo(String modelo2, double valorTabela, String cor2, String combustivel) {
        //TODO Auto-generated constructor stub
    }

    public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
    public void imprime() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
    }

    public void imprime(Double calculaIPVA) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprime'");
    }
	
}
