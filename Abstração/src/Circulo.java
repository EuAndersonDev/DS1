class Circulo extends Figuras {
	private double raio;
	
    public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
