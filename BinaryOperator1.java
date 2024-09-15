/*Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T    */
/*É usada para realizar operações de redução em pares de elementos, como somar números ou
* combinar Objetos    */


import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperator1 {
    public static void main(String[] args) {
        //criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        // Usar o BinaryOperator com Lambda para somar dois números inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;


        // Usar o BinaryOperator para somar todos os números np Stream

        int resultado = numeros.stream().reduce(0, somar);

        //Imprimir o resultado da soma
        System.out.println(resultado);
    }
}
