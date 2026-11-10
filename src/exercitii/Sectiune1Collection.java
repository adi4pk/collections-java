package exercitii;

import java.util.*;

public class Sectiune1Collection {
    public static void ruleaza() {
//        System.out.println("--- 1.1");
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
        c.add("Ana");
        c.add("Ion");
        c.add("Maria");
        System.out.println(c.add("Ana"));
        System.out.println(c);
        System.out.println(c.size());

    }

    private static void verificaContine() {
        Collection<String> c = new ArrayList<>(Arrays.asList("Ana", "Ion", "Maria"));
        System.out.println(c.contains("Ion"));
        System.out.println(c.contains("Dan"));
    }

    private static void scoateIonSiZoe() {
        Collection<String> c = new ArrayList<>(Arrays.asList("Ana", "Ion", "Maria"));
        System.out.println(c.remove("Ion"));
        System.out.println(c.remove("Zoe"));
        System.out.println(c);
    }

    private static void golesteColectia() {
        Collection<String> c = new ArrayList<>(Arrays.asList("Ana", "Ion", "Maria"));
        c.clear();
        System.out.println(c);


    }

    private static void deCeInterfataCollection() {
        int[] v = { 3, 1, 3, 2 };

        Collection<Integer> colArr = new ArrayList<>();
        Collection<Integer> colHash = new HashSet<>();
        Collection<Integer> colLinkedList = new LinkedList<>();


        for (int numar : v){

            colArr.add(numar);
            colHash.add(numar);
            colLinkedList.add(numar);
        }


        afiseaza(colArr);
        afiseaza(colHash);
        afiseaza(colLinkedList);


    }

    private static void afiseaza(Collection<Integer> c){

        System.out.println();

        StringBuilder sir = new StringBuilder();

        for (Integer numar : c){
            sir.append(numar).append(" ");
        }

        System.out.println("C size: " + c.size() + " -- " + sir);
    }


}
