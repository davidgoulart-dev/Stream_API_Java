import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemple {
    /*Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo t */
    /*É comunmente utilizada para criar ou fornecer novos objetos de um determinado tipo */

    public static void main(String[] args) {
        //utilaza expressao lambda para fornecer uma saudação personalizada.
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        //Usar sopplier para obter uma lista de 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao).limit(5).toList();
        //imprimir saudações geradas
        listaSaudacoes.forEach(System.out::println);

    }

}
