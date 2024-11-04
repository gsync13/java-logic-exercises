package src.main.java.intermediate;

import java.util.*;

public class Exercise6 {

/*
Excluir duplicados em uma lista preservando a ordem
Exercício: Escreva um método que receba uma lista de inteiros e retorne uma nova lista sem duplicatas, preservando a ordem original dos elementos.
Se a entrada for [3, 1, 2, 3, 4, 1, 5], a saída deve ser [3, 1, 2, 4, 5].
*/

    public static List<Integer> removeDuplicates(List<Integer> numbers){

        Set<Integer> list = new LinkedHashSet<>(numbers);

        return list.stream().toList();
    }


    public static void main(String[] args) {
        System.out.println("Start: ");

        List<Integer> numbers1 = Arrays.asList(3, 1, 2, 3, 4, 1, 5);
        List<Integer> numbers2 = Arrays.asList(3, 1, 2, 3, 4, 1, 4);

        System.out.println(numbers1 + " - a lista sem duplicados é? " + removeDuplicates(numbers1));
        System.out.println(numbers2 + " - a lista sem duplicados é? " + removeDuplicates(numbers2));

    }


}
