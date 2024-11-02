public class Exercise2 {

/*
Exercício: Escreva um método que receba um número inteiro positivo e retorne seu fatorial.
O fatorial de n é o produto de todos os inteiros positivos até n.
*/

    public static int factorial(int number){
        int result = 1;
        for (int i = 1; i<=number ; i++){
            result = result * i;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println("Start: ");

        int number1 = 3;
        int number2 = 5;

        System.out.println(number1 + " faturial é? " + factorial(number1));
        System.out.println(number2 + " faturial é?" + factorial(number2));

    }


}
