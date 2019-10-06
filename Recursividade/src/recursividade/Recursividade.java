package recursividade;

public class Recursividade {

//Un - Recursividade N!
    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);
    }

//Deux - N da Fibonacci
    public static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

//Trois - Inversão de N
    public static int inversao(int num, int invertido) {
        if (num == 0) {
            return invertido;
        }
        return inversao(num / 10, invertido * 10 + num % 10);
    }

//Quatre - Soma de elementos
    public static int somaVetor(int[] a, int b) {
        if (b < a.length) {
            return (a[b] + somaVetor(a, b + 1));
        }
        return 0;
    }
    
//Cinq - Soma de 1 a N
    public static int somaZeroToN(int a) {
        if (a == 0) {
            return 0;
        }
        return somaZeroToN(a - 1) + a;
    }

//Neuf - 0 a N
    public static int ascToN(int num) {
        if (num > 0) {
            ascToN(num - 1);
            System.out.println(num);
        }
        return 0;
    }

//Dix - N a 0
    public static int descToN(int num) {
        if (num > 0) {
            System.out.println(num);
            return descToN(num - 1);
        }
        return 0;
    }
}
