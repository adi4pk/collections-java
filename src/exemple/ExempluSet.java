package exemple;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExempluSet {
    public static void ruleaza() {
        demo("HashSet", new HashSet<>());
        demo("LinkedHashSet", new LinkedHashSet<>());
        demo("TreeSet", new TreeSet<>());
    }

    private static void demo(String clasa, Set<Integer> numere) {
        System.out.println("== " + clasa);
        System.out.println("add(40): " + numere.add(40));
        System.out.println("add(10): " + numere.add(10));
        System.out.println("add(40): " + numere.add(40));
        System.out.println("add(25): " + numere.add(25));
        System.out.println("Elemente: " + numere);
        System.out.println("contains(25): " + numere.contains(25));
        System.out.println("remove(99): " + numere.remove(99));
        numere.addAll(Arrays.asList(5, 10));
        System.out.println("Dupa addAll(5, 10): " + numere);
        numere.retainAll(Arrays.asList(5, 25, 70));
        System.out.println("Dupa retainAll(5, 25, 70): " + numere);
        numere.removeAll(Arrays.asList(5));
        System.out.println("Dupa removeAll(5): " + numere);
    }
}
