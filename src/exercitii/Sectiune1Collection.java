package exercitii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Sectiune1Collection {
    public static void ruleaza() {
        System.out.println("--- 1.1");
        adaugaCuDuplicate();
        System.out.println("--- 1.2");
        verificaContine();
        System.out.println("--- 1.3");
        scoateIonSiZoe();
        System.out.println("--- 1.4");
        golesteColectia();
        System.out.println("--- 1.5");
        deCeInterfataCollection();
    }

    private static void adaugaCuDuplicate() {
        Collection<String> c = new ArrayList<>();
    }

    private static void verificaContine() {
        Collection<String> c = new ArrayList<>(Arrays.asList("Ana", "Ion", "Maria"));
    }

    private static void scoateIonSiZoe() {
        Collection<String> c = new ArrayList<>(Arrays.asList("Ana", "Ion", "Maria"));
    }

    private static void golesteColectia() {
        Collection<String> c = new ArrayList<>(Arrays.asList("Ana", "Ion", "Maria"));
    }

    private static void deCeInterfataCollection() {
        int[] v = { 3, 1, 3, 2 };
    }
}
