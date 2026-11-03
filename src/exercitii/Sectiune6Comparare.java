package exercitii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sectiune6Comparare {
    public static void ruleaza() {
        System.out.println("--- 6.1");
        faElevulComparabil();
        System.out.println("--- 6.2");
        treeSetAreNevoieDeComparabil();
        System.out.println("--- 6.3");
        comparatorDupaNume();
        System.out.println("--- 6.4");
        comparatorDupaNotaDescrescator();
        System.out.println("--- 6.5");
        treeMapCuComparator();
        System.out.println("--- 6.6");
        compareToEgalInseamnaDuplicat();
    }

    private static void faElevulComparabil() {
        List<Elev> lista = new ArrayList<>(Arrays.asList(new Elev("Ana", 9), new Elev("Ion", 6), new Elev("Maria", 10), new Elev("Dan", 7)));
    }

    private static void treeSetAreNevoieDeComparabil() {
        List<Elev> elevi = new ArrayList<>(Arrays.asList(new Elev("Ana", 9), new Elev("Ion", 6), new Elev("Maria", 10), new Elev("Dan", 7)));
        Masina masina = new Masina("Dacia", 2020);
    }

    private static void comparatorDupaNume() {
        List<Elev> lista = new ArrayList<>(Arrays.asList(new Elev("Ana", 9), new Elev("Ion", 6), new Elev("Maria", 10), new Elev("Dan", 7)));
    }

    private static void comparatorDupaNotaDescrescator() {
        List<Elev> lista = new ArrayList<>(Arrays.asList(new Elev("Ana", 9), new Elev("Ion", 6), new Elev("Maria", 10), new Elev("Dan", 7)));
    }

    private static void treeMapCuComparator() {
        String[] chei = { "paine", "ou", "lapte", "unt" };
    }

    private static void compareToEgalInseamnaDuplicat() {
        Elev ana = new Elev("Ana", 9);
        Elev vlad = new Elev("Vlad", 9);
    }
}
