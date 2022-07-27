package exercicioI;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa pessoa;
        pessoa = new Pessoa();

        pessoa.id = "10";
        pessoa.nome = "Evelyn Cristini Oliveira";
        pessoa.idade = 25;
        pessoa.altura = 1.54;
        pessoa.peso = 63.5;

        System.out.println("O Id é " + pessoa.id);
        System.out.println("O nome é " + pessoa.nome);
        System.out.println("A idade é " + pessoa.idade);
        System.out.println("A altura é " + pessoa.altura);
        System.out.println("O peso é " + pessoa.peso);
    }
}
