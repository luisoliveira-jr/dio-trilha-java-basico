public class ResultadoEscolarRefatorado {
    public static void main(String[] args) {

        //CONDICIONAL ENCADEADA

        int nota = 6;

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");

        //CONDIÇÃO TERNÁRIA
        //int nota = 6;
		//String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		//System.out.println(resultado);
    }

}
