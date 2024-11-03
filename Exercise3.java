public class Exercise3 {

/*
3. Verificar se uma palavra é um palíndromo
Exercício: Implemente um método que verifica se uma palavra é um palíndromo (lê-se da mesma forma de trás para frente).
*/

    public static boolean isPalindrome(String word){

        int left = 0;
        int right = word.length() -1;

        while (left < right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right --;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Start: ");

        String a = "hello";
        String b = "racecar";
        String c = "ana";

        System.out.println(a + " palíndromo  é? " + isPalindrome(a));
        System.out.println(b + " palíndromo  é? " + isPalindrome(b));
        System.out.println(c + " palíndromo  é? " + isPalindrome(c));

    }


}
