package exemple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1 Iterable   2 Collection   3 List   4 Set   5 Map   6 Queue si Deque   0 iesire");
            if (!scanner.hasNextLine()) {
                return;
            }
            String alegere = scanner.nextLine();
            if (alegere.equals("0")) {
                return;
            }
            System.out.println();
            switch (alegere) {
                case "1":
                    ExempluIterable.ruleaza();
                    break;
                case "2":
                    ExempluCollection.ruleaza();
                    break;
                case "3":
                    ExempluList.ruleaza();
                    break;
                case "4":
                    ExempluSet.ruleaza();
                    break;
                case "5":
                    ExempluMap.ruleaza();
                    break;
                case "6":
                    ExempluQueueDeque.ruleaza();
                    break;
                default:
                    System.out.println("Alege 1-6 sau 0.");
            }
        }
    }
}
