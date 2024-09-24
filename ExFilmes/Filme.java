
public class Filme {

	private String titulo;
	private int duracaoEmMinutos;
	
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
	
    public String exibirDuracaoEmHoras(){
    	int horas = 0;
    	int minutos = duracaoEmMinutos;;
    	if(minutos > 60) {
    		while(minutos >= 60) {
    			minutos -= 60;
    			horas++;
    		}
    		if(horas > 1) {
    			return String.format("O filme %s tem %d horas e %d minutos. Ou %.2f horas. %n", titulo, horas, minutos, (duracaoEmMinutos / 60.0));
    		} else {
    			return String.format("O filme %s tem %d hora e %d minutos. Ou %.2f horas. %n", titulo, horas, minutos, (duracaoEmMinutos / 60.0));
    		}
    		
    	} else {
    		return String.format("O filme %s tem %d minutos. Ou %.2f hora %n", titulo, minutos, (duracaoEmMinutos / 60.0));
    	}

    }
}
