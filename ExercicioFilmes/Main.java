public class Main {
        public static void main(String[] args) {
            // Criando objeto filme1
            Filme filme1 = new Filme("Os Vingadores", 142);
            filme1.exibirDuracaoEmHoras();
    
            // Criando objeto filme2
            Filme filme2 = new Filme("Hotel Transilvânia", 93);
            filme2.exibirDuracaoEmHoras();
    
            // Exibindo os títulos dos filmes em cartaz
            System.out.println("Os filmes em cartaz são " + filme1.getTitulo() + " e " + filme2.getTitulo());
    
            // Instanciando outros 3 filmes e realizando as mesmas ações
            Filme filme3 = new Filme("Avatar", 178);
            filme3.exibirDuracaoEmHoras();
    
            Filme filme4 = new Filme("Toy Story", 81);
            filme4.exibirDuracaoEmHoras();
    
            Filme filme5 = new Filme("Interestelar", 169);
            filme5.exibirDuracaoEmHoras();
    
            Filme filme6 = new Filme("O Rei Leão", 118);
            filme6.exibirDuracaoEmHoras();
    
            Filme filme7 = new Filme("Jurassic Park", 127);
            filme7.exibirDuracaoEmHoras();
    
            // Exibindo os títulos dos novos filmes em cartaz
            System.out.println("Os filmes em cartaz são " + filme3.getTitulo() + ", " + filme4.getTitulo() + " e " + filme5.getTitulo());
        }
}
