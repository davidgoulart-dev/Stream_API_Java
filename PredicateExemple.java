/*Representa uma função que recebe um argumento do tipo T e retorna um valor booleano     */
//É comumente utilizada para filtrar os elementos do Stream com base em alguma condição.


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemple {
    public static void main(String[] args) {
        //Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go","ruby");

        //Cria um predicate que verifica se a palavra possuí mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;


        //Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        //imprimir cada palavra que passou no filtro

        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);



    }
}
