import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(somaDeNumeros(5));

        System.out.println(fatorial(5));

        System.out.println(contagemDeDigitos(12345));

        System.out.println(isPrimo(29));

        System.out.println(inversaoDeNumeros(12345));

        System.out.println(potencia(2, 3));

        System.out.println(palindromo(1221));

        System.out.println(multiplosDeUmNumero(3, 15));

        System.out.println(binarioParaDecimal(1010));

        System.out.println(fibonacci(5));
    }

    public static int somaDeNumeros(int n) {
        int soma = 0;
        for(int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static int fatorial(int n) {
        int contador = n;
        int resultado = n;
        while (contador > 1) {
            resultado = resultado * (contador - 1);
            contador--;
        }
        return resultado;
    }

    public static int contagemDeDigitos(int n) {
        String numeroEmString = String.valueOf(n);
        int contador = numeroEmString.length();
        return contador;
    }

    public static boolean isPrimo(int n) {
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static int inversaoDeNumeros(int n) {
        String numeroEmString = String.valueOf(n);
        String numeroInvertido = "";
        for (int i = numeroEmString.length() - 1; i >= 0; i--) {
            numeroInvertido += numeroEmString.charAt(i);
        }
        Integer numeroInvertidoInt = Integer.parseInt(numeroInvertido);
        return numeroInvertidoInt;
    }

    public static int potencia(int base, int expoente) {
        int resultado = 1;
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static boolean palindromo(int n) {
        int numeroInvertido = inversaoDeNumeros(n);

        String nEmString = String.valueOf(n);
        String numeroInvertidoEmString = String.valueOf(numeroInvertido);
        return nEmString.equals(numeroInvertidoEmString);
    }

    public static List<Integer> multiplosDeUmNumero(int n, int m) {
        List<Integer> multiplos = new ArrayList<>();

        for (int i = n; i <= m; i++) {
            if (i % n == 0) {
                multiplos.add(i);;
            }
        }

        return multiplos;
    }

    public static int binarioParaDecimal(int n) {
        String numeroEmString = String.valueOf(n);
        int numeroDecimal = Integer.parseInt(numeroEmString,2);
        return numeroDecimal;
    }

    public static String fibonacci(int n) {
        StringBuilder fibonacci = new StringBuilder();

        int a = 0, b = 1;

        fibonacci.append(a);

        if (n > 1) {
            fibonacci.append(", ").append(b);
        }

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            fibonacci.append(", ").append(c);
            a = b;
            b = c;
        }

        return fibonacci.toString();
    }
}