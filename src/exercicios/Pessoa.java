package exercicios;

public class Pessoa {

        String nome, id;
        public int idade;
        double altura, peso;

        public boolean ehMaiorIdade(int idade) {
              if (idade >= 18) { return true; } return false;
        }
        public double calcularIMC() {
                double imc = peso / (altura * altura);

                if (imc < 20.0 && ehMaiorIdade(idade)) return -1;
                else if (imc > 20.0 && imc <= 25.0 && ehMaiorIdade(idade)) return 0;
                else if (imc > 25.0 && ehMaiorIdade(idade)) return -1;

                return imc;
        }

        @Override
        public String toString() {
                return "O Id é: " + id +
                        "\nO meu nome é: " + nome +
                        "\nA minha idade é: " + idade +
                        " anos \nA altura é: " + altura +
                        " metros \nO peso é: " + peso + " kg";
        };

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
