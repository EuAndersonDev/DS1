
public class Principal {
    public static void main(String[] args) {
        // Instanciando e apresentando o aluno
        Aluno aluno = new Aluno("Rafael", "Rua 10", "(11) 99999-2222", "2344");
        aluno.apresentar();

        // Instanciando e apresentando o professor
        Professor professor = new Professor("Thayani", "Rua 3", "(11) 98888-2222", "Matemática");
        professor.apresentar();

        // Exemplo de polimorfismo com a interface Pessoa
        Pessoa pessoa = new Professor("Thayani", "Rua 3", "(11) 98888-2222", "Matemática");
        pessoa.apresentar();

        pessoa = new Aluno("Rafael", "Rua 10", "(11) 99999-2222", "2344");
        pessoa.apresentar();
    }
}