package org.example;

public class VerificadorPalindromo {

    public static String normalizar(String entrada) {
        if (entrada == null) {
            return "";
        }

        String minuscula = entrada.toLowerCase();
        String limpa = "";

        for (int i = 0; i < minuscula.length(); i++) {
            char c = removerAcento(minuscula.charAt(i));
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                limpa += c;
            }
        }
        return limpa;
    }

    private static char removerAcento(char c) {
        switch (c) {
            case 'á': case 'à': case 'ã': case 'â': case 'ä':
                return 'a';
            case 'é': case 'è': case 'ê': case 'ë':
                return 'e';
            case 'í': case 'ì': case 'î': case 'ï':
                return 'i';
            case 'ó': case 'ò': case 'õ': case 'ô': case 'ö':
                return 'o';
            case 'ú': case 'ù': case 'û': case 'ü':
                return 'u';
            case 'ç':
                return 'c';
            default:
                return c;
        }
    }

    public static boolean ehPalindromo(String entrada) {
        String textoTratado = normalizar(entrada);

        if (textoTratado.isEmpty()) {
            return false;
        }

        Deque deque = new Deque();
        for (int i = 0; i < textoTratado.length(); i++) {
            deque.inserirFim(textoTratado.charAt(i));
        }

        while (deque.tamanho() > 1) {
            char primeiro = deque.removerInicio();
            char ultimo = deque.removerFim();

            if (primeiro != ultimo) {
                return false;
            }
        }

        return true;
    }
}