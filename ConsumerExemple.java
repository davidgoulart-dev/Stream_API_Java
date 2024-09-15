import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;






    /*Representa uma operação que aceita um argumento do tipo T e não retorna nunhum resultado    */
    /*É utilizada pricipalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou    */
    /* retornar um Valor*/

    public class ConsumerExemple{
        public static void main(String[] args) {
            //criar lista de números inteiros
            List<Integer> numeros = Arrays.asList(1,2,3,4,5);

            //Usar o consumer com expressão lambda para imprimir números pares
            Consumer<Integer> imprimirNumeroPar = numero -> {
                if (numero % 2 == 0){
                    System.out.println(numero);
                }
            };
            //Usar Consumer para imprimir números pares no Stream
            numeros.stream().forEach(imprimirNumeroPar);
        }
    }




