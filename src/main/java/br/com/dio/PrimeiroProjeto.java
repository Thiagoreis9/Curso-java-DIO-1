package br.com.dio;

public class PrimeiroProjeto {
    public static void main(String[] args) {

        /*STRINGS some methods
        System.out.println("Hello World !!!");
        System.out.println("A B C D E F G".toCharArray());
        System.out.println("Aula de Java".split(""));
        System.out.println("Aula".concat(" de Java"));
        System.out.println("1234 asda qw".replaceAll("[0-9]" , "#"));*/

        final var condicao = false;

        if (condicao){
            System.out.println("Condicao e verdadeira! ");
        } else{
            System.out.println("Condicao é falsa! ");
        }

        if (condicao)
            System.out.println("Uma unica linha");

        final var ternario = condicao ? "é verdadeiro" : "é falso";
        System.out.println(ternario);


    }
}
