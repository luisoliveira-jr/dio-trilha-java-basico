public class TiposVariaveis {

    /**
     * @param args
     * @throws Exception
     */
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {

        int idade; // Tipo "int", nome "idade", com nenhum valor atribuído.
        int anoFabricacao = 2021; // tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2.500; // tipo "double", nome "salarioMinimo", valor 2.500. "dois ponto cinco"

        double correto = 2500.33; // tipo "double", nome "salarioMinimo", valor 2500.33. "dois mil quinhetos ponto
                                  // trita e três"

        byte idadeExemplo = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo / Tipo long o valor deve
                                 // ser finalizado sempre com um "L"
        float pi = 3.14F; // Tipo float o valor deve ser finalizado sempre com um "F"
        double salario = 1275.33;

        /*
         * esta linha é considerada como declaração de variável iniciamos a existência
         * variavel numero com valor 5 regra: tipo + nome + valor
         */
        int numero = 5;

        /*
         * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
         * não é mais necessário, pois a variável já foi declarada anteriormente
         */
        numero = 10;

        /*
         * ao usar a palavra reservada final, você determina que jamais
         * esta variavel poderá obter outro valor;
         * logo a linha 25 vai apresentar um erro de compilação
         * isso é considerado uma CONSTANTE na linguagem Java
         * ela deve ser escrita em MAIÚSCULA
         */
        final double VALOR_DE_PI = 3.14;

        //VALOR_DE_PI = 3.15; // Esta linha vai apresentar erro de compilação!

        System.out.println(VALOR_DE_PI);
    }

}
