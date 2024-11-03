package src.main.java.beginer;

public class Exercise4 {

/*
4. Encontrar o maior número em uma lista
Exercício: Escreva um método que recebe um array de inteiros e retorna o maior número contido nele.
*/

    public static int returnBiggestInt(int[] numbers){

        int max= numbers[0];
        for(int num : numbers){

           if(num > max){
               max = num;
           }

        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println("Start: ");

        int[] a = {1,2,3,4,5};
        int[] b = {2,1,0,8,5};
        int[] c = {8,5,10,3,2};

        System.out.println(a + " o maior número  é? " + returnBiggestInt(a));
        System.out.println(b + " o maior número  é? " + returnBiggestInt(b));
        System.out.println(c + " o maior número  é? " + returnBiggestInt(c));

    }


}
