
/*É utilizada para transformar ou mapear os elementos Stream em outros valores ou tipos.  */
/*Representa uma função que aceita um tipo T e retorna um resultado tipo R.  */


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemple {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usar a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //Usar a função para dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();
        //Imprimir Lista de dos números agora dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
