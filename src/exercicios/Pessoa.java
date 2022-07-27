package exercicios;

public class Pessoa {

        String nome, id;
        public int idade;
        double altura, peso;

        public Pessoa(){}
        public Pessoa(String id, String nome, int idade) {
                this.id = id;
                this.nome = nome;
                this.idade = idade;
        }

        public Pessoa(String id, String nome, int idade, double altura, double peso) {
                this.id = id;
                this.nome = nome;
                this.idade = idade;
                this.altura = altura;
                this.peso = peso;
        }
}
