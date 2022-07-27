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

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

        public double getAltura() {
                return altura;
        }

        public void setAltura(double altura) {
                this.altura = altura;
        }

        public double getPeso() {
                return peso;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }
}
