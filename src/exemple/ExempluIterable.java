package exemple;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ExempluIterable {
    public static void ruleaza() {
        demo("ArrayList", new ArrayList<>(Arrays.asList("Cluj", "Iasi", "Oradea")));
        demo("HashSet", new HashSet<>(Arrays.asList("Cluj", "Iasi", "Oradea")));
        demo("ArrayDeque", new ArrayDeque<>(Arrays.asList("Cluj", "Iasi", "Oradea")));
    }

    private static void demo(String clasa, Iterable<String> orase) {
        System.out.println("== " + clasa);
        System.out.print("for-each:");
        for (String oras : orase) {
            System.out.print(" " + oras);
        }
        System.out.println();
        Iterator<String> it = orase.iterator();
        System.out.println("hasNext(): " + it.hasNext());
        System.out.println("next(): " + it.next());
        while (it.hasNext()) {
            if (it.next().equals("Iasi")) {
                it.remove();
                System.out.println("it.remove() pe Iasi");
            }
        }
        System.out.println("hasNext() la final: " + it.hasNext());
        System.out.println("Elemente: " + orase);
    }
}
