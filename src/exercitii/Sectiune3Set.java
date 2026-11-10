package exercitii;

import java.util.*;

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
        System.out.println(s.add("Ana"));
        System.out.println(s.add("Ion"));
        System.out.println(s.add("Ana"));
        System.out.println(s.add("Maria"));
    }

    private static void reuniuneCuIonSiEva() {
        Set<String> s = new LinkedHashSet<>(Arrays.asList("Ana", "Ion", "Maria"));
        s.addAll(Arrays.asList("Ion", "Eva"));
        System.out.println(s);
    }

    private static void intersectieCuIonMariaZoe() {
        Set<String> s = new LinkedHashSet<>(Arrays.asList("Ana", "Ion", "Maria"));
        s.retainAll(Arrays.asList("Ion", "Maria", "Zoe"));
        System.out.println(s);
    }

    private static void scoateIonSiNumara() {
        Set<String> s = new HashSet<>(Arrays.asList("Ana", "Ion", "Maria"));
        s.remove("Ion");
        System.out.println(s.contains("Ion"));
        System.out.println(s.size());
    }

    private static void deCeInterfataSet() {
        String[] v = { "Ana", "Maria", "Ana", "Dan" };

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        for (String element : v){

            hashSet.add(element);
            linkedSet.add(element);
            treeSet.add(element);
        }

        afiseazaMultime(hashSet);
        afiseazaMultime(linkedSet);
        afiseazaMultime(treeSet);


    }

    private static void afiseazaMultime(Set<String> s){

        System.out.println(s.size());

        String sirSet = "";

        for (String element:s){
            sirSet += element + " ";
        }
        System.out.println(sirSet);
    }
}
