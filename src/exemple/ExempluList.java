package exemple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExempluList {
    public static void ruleaza() {
        List<String> culori = new ArrayList<>(Arrays.asList("rosu", "verde", "albastru"));
        System.out.println("culori.get(1): " + culori.get(1));
        culori.add(1, "galben");
        System.out.println("Dupa add(1, galben): " + culori);
        System.out.println("indexOf(albastru): " + culori.indexOf("albastru"));
        System.out.println("indexOf(negru): " + culori.indexOf("negru"));
        culori.remove(0);
        culori.set(0, "mov");
        System.out.println("Dupa remove(0) si set(0, mov): " + culori);
        try {
            System.out.println(culori.get(10));
        } catch (Exception e) {
            System.out.println("culori.get(10): " + e.getClass().getSimpleName());
        }

        List<Integer> numere = new ArrayList<>(Arrays.asList(10, 20, 30));
        numere.remove(1);
        System.out.println("Dupa remove(1) pe List<Integer>: " + numere);
        numere.remove(Integer.valueOf(30));
        System.out.println("Dupa remove(Integer.valueOf(30)): " + numere);

        List<String> zile = Arrays.asList("L", "Ma", "Mi");
        zile.set(0, "Luni");
        System.out.println("Arrays.asList dupa set(0, Luni): " + zile);
        try {
            zile.add("J");
        } catch (Exception e) {
            System.out.println("add pe Arrays.asList: " + e.getClass().getSimpleName());
        }
    }
}
