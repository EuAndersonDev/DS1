public class Filme {
    private String titulo;
    private int duracaoEmMinutos;

    public Filme(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirDuracaoEmHoras() {
        int horas = this.duracaoEmMinutos / 60;
		int minutos = this.duracaoEmMinutos % 60;
		
		if (this.duracaoEmMinutos < 60) {
			System.out.println("O filme"+titulo+" tem duração de " + minutos + " minutos.");
		} else if (minutos == 0) {
			System.out.println("O filme"+titulo+" tem duração de " + horas + " hora(s).");
		} else {
			System.out.println("O filme"+titulo+" tem duração de " + horas + " hora(s) e " + minutos + " minuto(s).");
		}
       
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
