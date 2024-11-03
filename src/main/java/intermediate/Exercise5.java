package src.main.java.intermediate;

public class Exercise5 {

/*
5. Calcular a soma dos números de uma sequência de Fibonacci
Exercício: Escreva um método que retorna a soma dos primeiros n números da sequência de Fibonacci. A
 sequência começa com 0 e 1, e cada número subsequente é a soma dos dois anteriores.
*/

    public static int sumFibonacci(int n){

        if (n <= 0) return 0;

        int a = 0;
        int b = 1;
        int sum = a + b;

        for(int i = 3; i <= n; i++){
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Start: ");

        int a = 3;
        int b = 5;
        int c = 8;

        System.out.println(a + " - a soma dos números de uma sequência de Fibonacci? " + sumFibonacci(a));
        System.out.println(b + " - a soma dos números de uma sequência de Fibonacci? " + sumFibonacci(b));
        System.out.println(c + " - a soma dos números de uma sequência de Fibonacci? " + sumFibonacci(c));

    }


}
