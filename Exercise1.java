public class Exercise1 {

/*
1. Verificar se um número é par
Exercício: Crie um método que verifique se um número inteiro é par.
*/

    public static boolean isEven(int number){
        return number % 2 == 0;
    }


    public static void main(String[] args) {
        System.out.println("Start: ");

        int number1 = 10;
        int number2 = 3;

        System.out.println(number1 + " é par? " + isEven(number1));
        System.out.println(number2 + " é par? " + isEven(number2));

    }


}
