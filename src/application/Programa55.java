package application;

import entities.Client02;

public class Programa55 {
    public static void main(String[] args) {
        Client02 c = new Client02("Pietro", "teste");
        Client02 c2 = new Client02("Pietro", "teste2");

        System.out.println(c.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c.equals(c2));
    }
}
