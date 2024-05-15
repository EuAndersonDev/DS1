
public class Main {
	public static void main(String[] args) {
		
        Carro meuCarro = new Carro();
        meuCarro.setMarca("Toyota");
        meuCarro.setModelo("Corolla");
        meuCarro.setCor("Prata");
        meuCarro.setAno(2022);
        meuCarro.setQtde_portas("4");

        Moto minhaMoto = new Moto();
        minhaMoto.setMarca("Honda");
        minhaMoto.setModelo("CB500");
        minhaMoto.setCor("Vermelho");
        minhaMoto.setAno(2021);
        minhaMoto.setCilindrada("500cc");

        System.out.println("Informações do Carro:");
        meuCarro.imprime();
        System.out.println("------------------------------------------");
        System.out.println("Informações da Moto:");
        minhaMoto.imprime();
		
	}
}
