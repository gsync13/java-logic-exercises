package src.main.java.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise8 {

/*
Exercício: Ordenar uma Lista de Números Usando Bubble Sort
Objetivo: Dada uma lista de números inteiros, ordene-a em ordem crescente usando o algoritmo Bubble Sort.
*/

    public static List<Integer> orderBubbleSor(List<Integer> list){
        List<Integer> result = new ArrayList<>(list);
        int size = result.size();
        for(int i = 0; i < size - 1 ; i++){

            for(int j = 0; j < size -i -1; j++){

                if(result.get(j) > result.get(j+1)){
                    int temp = result.get(j);
                    result.set(j,result.get(j+1));
                    result.set(j+1,temp );

                }
            }

        }

    return result;
    }


    public static void main(String[] args) {
        System.out.println("Start: ");

        List<Integer> numbers1 = Arrays.asList(3, 2, 4, 1, 5);
        List<Integer> numbers2 = Arrays.asList(80, 2, 32, 11, 4, 99, 50,66);

        System.out.println(numbers1 + " - a lista ordenada ficou? " + orderBubbleSor(numbers1));
        System.out.println(numbers2 + " - a lista ordenada ficou? " + orderBubbleSor(numbers2));

    }


}
