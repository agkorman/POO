package Guias.Guia2.g2_e5;

import java.util.Locale;

public class Palindromo {
    public static void main(String[] args) {
        String frase = "";
        for (String s : args) {
            frase += s.toLowerCase();
        }
        if (esPalindromo(frase)) {
            System.out.println("ES PALINDROMO");
        } else {
            System.out.println("NO ES PALINDROMO");
        }
    }

    private static boolean esPalindromo(String palabra) {
        for (int i = 0; i < palabra.length()/2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
