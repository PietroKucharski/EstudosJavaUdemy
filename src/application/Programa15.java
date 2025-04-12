package application;

public class Programa15 {
    public static void main(String[] args) {
        String[] vetor = new String[] {"Pietro", "Bob", "Alex"};

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        /* Utilizando o laço foreach */

        for (String obj : vetor) { // Faz a mesma coisa que o for normal, porém sua sintaxe é mais simplificada
            System.out.println(obj);
        }
    }
}
