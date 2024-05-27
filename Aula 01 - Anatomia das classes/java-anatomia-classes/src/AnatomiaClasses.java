//Classe, deve ser criada dentro da pasta src
//O nome do arquivo deve sempre iniciar com cada palavra em maiúscula
//O nome da classe deve ser igual do do arquivo .java
public class AnatomiaClasses {

    // Método principal
    public static void main(String[] args) throws Exception {

        // Declarar métodos em Java segue uma estrutura bem simples:
        // Estrutura
        // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

        // Exemplo:
        // int somar (int numeroUm, int numero2)
        // String formatarCep (long cep)

        // Classe System com saida "out" que imprime "print" algo
        System.out.println("Hello, World! teste");
    }

    // Nome da variável deve seguir o padrão camelCase
    // Significa que deve ser escrito em letra minúscula, se for nome composto a
    // primeira letra da segunda palavra em diante deve ser maiúscula.
    // Exemplo:
    int ano = 1991;
    int anoFabricação = 1992;

    // Quando o nome da variável é escrito todo em maiúscula, pressupõe que o valor
    // da variável não poderá ser alterado, pois foi atribuída a palavra reservada
    // "final" que impede a sua alteração. Se nome composto deve ser seprado por
    // underline

    // Estrutura
    // tipo nomeBemDefinido = Atribuição (opcional em alguns casos)
    // Exemplo:
    final String BR = "Brasil";
    final double PI = 3.14;
    final int ESTADOS_BRASILEIROS = 27;

}
