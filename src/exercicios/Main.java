package exercicios;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        pessoa.id = "1";
        pessoa.nome = "Evelyn Cristini Oliveira";
        pessoa.idade = 18;
        pessoa.altura = 1.57;
        pessoa.peso = 63.8;

        Pessoa pessoa2 = new Pessoa(pessoa.getId(), pessoa.getNome(), pessoa.getIdade());

        System.out.println(pessoa);
        System.out.println("Você é maior de idade: " + pessoa.ehMaiorIdade(pessoa.idade));
        System.out.println("Minha faixa do IMC corresponde a: " + pessoa.calcularIMC(pessoa.peso, pessoa.altura));

    }
}
