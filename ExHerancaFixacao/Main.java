import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
        JogoEletronico jogoEletronico = new JogoEletronico();
        jogoEletronico.setNome("Cyberpunk 2077");
        jogoEletronico.setPreco(199.99);
        jogoEletronico.setDistribuidora("CD Projekt");
        jogoEletronico.setPlataforma("PC");
        jogoEletronico.setGenero("RPG");

        System.out.println("Informa��es do Jogo Eletr�nico:");
        jogoEletronico.imprime();
        jogoEletronico.jogarOnline(5);
        

        JogoFisico jogoFisico = new JogoFisico();
        jogoFisico.setNome("Banco Imobili�rio");
        jogoFisico.setPreco(99.99);
        jogoFisico.setDistribuidora("Estrela");
        jogoFisico.setQuantidadeJogadores(4);
        jogoFisico.setTempoPartida(60);

        System.out.println("\nInforma��es do Jogo F�sico:");
        jogoFisico.imprime();

        int tempoTotal = jogoFisico.calcularTempoTotal(3);
        System.out.println("Tempo total de jogo para 3 partidas: " + tempoTotal + " minutos");
        
        System.out.println("-------------------------------------");
        System.out.println("Agora teste por si s�!");
        System.out.println();
        
        JogoEletronico jogoEletronico2 = new JogoEletronico();
        
        System.out.println("Informe os dados do Jogo Eletr�nico:");
        System.out.print("Nome: ");
        jogoEletronico2.setNome(in.nextLine());
        
        System.out.print("Pre�o: ");
        jogoEletronico2.setPreco(in.nextDouble());
        in.nextLine();
        
        System.out.print("Distribuidora: ");
        jogoEletronico2.setDistribuidora(in.nextLine());
        
        System.out.print("Plataforma: ");
        jogoEletronico2.setPlataforma(in.nextLine());
        
        System.out.print("G�nero: ");
        jogoEletronico2.setGenero(in.nextLine());
        
        System.out.print("Quantidade de jogadores online: ");
        int quantidadeJogadoresOnline = in.nextInt();
        in.nextLine();
        
        System.out.println("\nInforma��es do Jogo Eletr�nico:");
        jogoEletronico2.imprime();
        jogoEletronico2.jogarOnline(quantidadeJogadoresOnline);

        System.out.println("-------------------------------------");
        
        JogoFisico jogoFisico2 = new JogoFisico();
        
        System.out.println("Informe os dados do Jogo F�sico:");
        
        System.out.print("Nome: ");
        jogoFisico2.setNome(in.nextLine());
        
        System.out.print("Pre�o: ");
        jogoFisico2.setPreco(in.nextDouble());
        in.nextLine();
        
        System.out.print("Distribuidora: ");
        jogoFisico2.setDistribuidora(in.nextLine());
        
        System.out.print("Quantidade de jogadores: ");
        jogoFisico2.setQuantidadeJogadores(in.nextInt());
        
        System.out.print("Tempo da partida (em minutos): ");
        jogoFisico2.setTempoPartida(in.nextInt());
        System.out.print("Quantidade de partidas: ");
        int quantidadePartidas = in.nextInt();
        
        System.out.println("\nInforma��es do Jogo F�sico:");
        jogoFisico2.imprime();

        tempoTotal = jogoFisico2.calcularTempoTotal(quantidadePartidas);
        System.out.println("Tempo total de jogo para " + quantidadePartidas + " partidas: " + tempoTotal + " minutos");

    }
}
