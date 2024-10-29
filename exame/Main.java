package exame;

public class Main {

    public static void main(String[] args) {
        // criar uma funcao dado um char devolve verdadeiro
        // se o char seja letra presente no alfabeto

        System.out.println(isAlphabetLetter('A'));
        System.out.println(isAlphabetLetter('2'));
        System.out.println(isAlphabetLetter('w'));
        System.out.println(isAlphabetLetter('*'));

        System.out.println("-----------");
        System.out.println(indexOfFirstNonAlphabetLetter(new char[]{'a', '1', 'c'}));
        System.out.println(indexOfFirstNonAlphabetLetter(new char[]{'?', 'B', '#'}));
        System.out.println(indexOfFirstNonAlphabetLetter(new char[]{'g', 'F', 'K'}));


        System.out.println("-----------");
        System.out.println(nonLetterPercentage(new char[]{'s', '1', '~'}));
        System.out.println(nonLetterPercentage(new char[]{'G', 'J', 'R', 'r', '%'}));

        System.out.println("-----------");
        System.out.println(numDigits(2));
        System.out.println(numDigits(2023));
        System.out.println(numDigits(0));

        System.out.println("-----------");
        System.out.println(sumDigits(123));
    }

    static int sumDigits(int numero){
        int soma = 0;
        while (numero > 0) {
            // resto da divisao por 10
            soma = soma + numero % 10;
            // divide o numero por 10
            numero /= 10;
        }
        return soma;
    }

    static boolean isAlphabetLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    static int indexOfFirstNonAlphabetLetter(char[] input) {
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (!isAlphabetLetter(c)) {
                return i;
            }
        }
        return -1;
    }

    static double nonLetterPercentage(char[] input) {

        int count = 0;
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (!isAlphabetLetter(c)) {
                count++;
            }
        }
        /* cast: É usado para transformar um tipo de dado em outro.
         Exemplo: double x = 10;
         int y = (int) x;
         int a = 50;
         double b = (double) a;

         class Math;
         Class MathFilha;

         MathFilha math = (Math) somar;
        */
        return (double) count / input.length;
    }

    static int numDigits(int n) {
        /*
         2 0 2 3
         n /= 10;
         n = n / 10;
         */

        int count = 0;

        if (n == 0) {
            return 1;
        }

        while (n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }
}
