//Hierarquia das exceções
//A linguagem Java, dispõe de uma variedade de classes, que representam exceções e estas classes, são organizadas em uma hierarquia denominadas Checked and Unchecked Exceptions ou Exceções Checadas e Não Checadas.

//O que determina uma exceção ser classificada como checada ou não checada ?
//É o risco dela ser disparada, logo, você precisa tratá-la, exemplo:

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        // Vamos imaginar que precisamos realizar de duas maneiras, a conversão de uma
        // String para um número, porém o texto contém Alfanuméricos.
        // As linhas 20 e 21, apresentarão uma exceção ao serem executadas, e a linha 5
        // contém um método que pode disparar uma exceção checada, logo, nós
        // programadores que iremos usar este método, teremos que tratá-la
        // explicitamente com try \ catch.

        try {
            Number valor = Double.valueOf("a1.75");
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
