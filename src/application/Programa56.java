package application;

import java.util.*;

public class Programa56 {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>(); // Sem ordenação
//        Set<String> set = new TreeSet<>(); // Com ordenação
//        Set<String> set = new LinkedHashSet<>(); // Ordem de inserção
//
//        set.add("TV");
//        set.add("Tablet");
//        set.add("Notebook");
//
//        set.remove("TV");
//        set.removeIf(x -> x.length() >= 3);
//
//        System.out.println(set.contains("Notebook"));
//
//        for (String s : set) {
//            System.out.println(s);
//        }
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
