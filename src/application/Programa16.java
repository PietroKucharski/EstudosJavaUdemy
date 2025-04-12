package application;

import java.util.ArrayList;
import java.util.List;

public class Programa16 {
    public static void main(String[] args) {
        /* Não aceita tipos primitivos dentro dos sinais de maior e menor da interface List */
        List<String> list = new ArrayList<>();

        list.add("Pietro");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");

        /* Irá adicionar um elemento na lista conforme o índice que for passado */
        list.add(2, "Marco");

        /* Mostra o tamanho da lista */
        System.out.println(list.size());

        for (String nomes : list) {
            System.out.println(nomes);
        }

        /* Faz a remoção do elemento passado. Pode ser tanto pelo valor dele, quanto pelo seu índice
        list.remove("Ana");
        list.remove(1);
        */


        /* Remove um elemento a partir de um predicado
        list.removeIf(x -> x.charAt(0) == 'P');
        */


        for (String nomes : list) {
            System.out.println(nomes);
        }

        /* Achar o índice de um determinado elemento a partir de seu valor, se encontrar irá passar o índice onde o
        elemento está, e caso não encontre irá retornar um índice negativo
        */
        System.out.println(list.indexOf("Bob"));

        System.out.println("------------");

        /* O metodo stream() é um fluxo de elementos que podem ser processados de forma declartiva e que nos da a
        permissão de utilizar outros métodos, nesse caso o filter() que aceita uma lambda dentro dos parênteses */
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for (String nomes : result) {
            System.out.println(nomes);
        }

        /* Aqui utilizamos o metodo findFirst() para achar o primerio elemento que atenda a condição dentro do filter,
        por fim utilizamos o metodo orElse() pra se caso ele não achar retornar um valor nulo*/
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);

    }
}
