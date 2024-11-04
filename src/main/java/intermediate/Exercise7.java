package src.main.java.intermediate;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exercise7 {

/*
Filtrar números pares de uma lista e retornar a soma
Exercício: Dada uma lista de inteiros, crie um método que filtre todos os números pares e, em seguida, retorne a soma desses números.
Por exemplo, para a entrada [1, 2, 3, 4, 5, 6], o método deve retornar 12 (porque 2 + 4 + 6 = 12).
*/

    public static int filterAndSumEvenNumbers(List<Integer> numbers){

       int result = numbers.stream()
               .filter(i -> i % 2 == 0 )
               .mapToInt(i -> i.intValue())
               .sum();
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Start: ");

        List<Integer> numbers1 = Arrays.asList(3, 2, 4, 1, 5);
        List<Integer> numbers2 = Arrays.asList(3, 2, 2, 3, 4, 1, 6);

        System.out.println(numbers1 + " - a soma dos números pares é? " + filterAndSumEvenNumbers(numbers1));
        System.out.println(numbers2 + " - a soma dos números pares é? " + filterAndSumEvenNumbers(numbers2));

    }


}
