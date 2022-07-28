package exercicios;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa("2", "Daniele Oliveira", 18, 1.72, 60);

        pessoa.id = "1";
        pessoa.nome = "Evelyn Cristini Oliveira";
        pessoa.idade = 18;
        pessoa.altura = 1.57;
        pessoa.peso = 63.8;

        // System.out.println(pessoa);
        // System.out.println("Você é maior de idade: " + pessoa.ehMaiorIdade(pessoa.idade));
        // System.out.println("Minha faixa do IMC corresponde a: " + pessoa.calcularIMC(pessoa.peso, pessoa.altura));
        // System.out.println("\n");

        // System.out.println(pessoa2);
        // System.out.println("Você é maior de idade: " + pessoa2.ehMaiorIdade(pessoa2.idade));

        if (pessoa2.calcularIMC() < 20.0) { System.out.println("Você está abaixo do peso!"); }
        else if (pessoa2.calcularIMC() > 20.0 && pessoa2.calcularIMC() <= 25.0) { System.out.println("Você está com o peso saúdavel!"); }
        else if (pessoa2.calcularIMC() > 25.0) { System.out.println("Você está acima do peso!"); }

        if (pessoa2.idade >= 18) { System.out.println("Você é maior de idade!\n" + pessoa2); }
        else { System.out.println("Você é menor de idade!\n" + pessoa2); }

        System.out.println("Minha faixa do IMC corresponde a " + pessoa2.calcularIMC());
    }
}
