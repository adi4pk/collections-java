package exercitii;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sectiune3Set {
    public static void ruleaza() {
        System.out.println("--- 3.1");
        adaugaAnaIonAnaMaria();
        System.out.println("--- 3.2");
        reuniuneCuIonSiEva();
        System.out.println("--- 3.3");
        intersectieCuIonMariaZoe();
        System.out.println("--- 3.4");
        scoateIonSiNumara();
        System.out.println("--- 3.5");
        deCeInterfataSet();
    }

    private static void adaugaAnaIonAnaMaria() {
        Set<String> s = new HashSet<>();
    }

    private static void reuniuneCuIonSiEva() {
        Set<String> s = new LinkedHashSet<>(Arrays.asList("Ana", "Ion", "Maria"));
    }

    private static void intersectieCuIonMariaZoe() {
        Set<String> s = new LinkedHashSet<>(Arrays.asList("Ana", "Ion", "Maria"));
    }

    private static void scoateIonSiNumara() {
        Set<String> s = new HashSet<>(Arrays.asList("Ana", "Ion", "Maria"));
    }

    private static void deCeInterfataSet() {
        String[] v = { "Ana", "Maria", "Ana", "Dan" };
    }
}
