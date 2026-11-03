package exemple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class ExempluCollection {
    public static void ruleaza() {
        demo("ArrayList", new ArrayList<>());
        demo("HashSet", new HashSet<>());
        demo("LinkedList", new LinkedList<>());
    }

    private static void demo(String clasa, Collection<String> orase) {
        System.out.println("== " + clasa);
        System.out.println("add(Cluj): " + orase.add("Cluj"));
        System.out.println("add(Iasi): " + orase.add("Iasi"));
        System.out.println("add(Cluj): " + orase.add("Cluj"));
        System.out.println("size(): " + orase.size());
        System.out.println("Elemente: " + orase);
        System.out.println("join: " + String.join(", ", orase));
        System.out.println("contains(Iasi): " + orase.contains("Iasi"));
        System.out.println("remove(Oradea): " + orase.remove("Oradea"));
        System.out.println("remove(Cluj): " + orase.remove("Cluj"));
        System.out.println("Elemente: " + orase);
        orase.clear();
        System.out.println("Dupa clear(), size(): " + orase.size());
    }
}
