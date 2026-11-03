package exemple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1 Collection   2 List   3 Set   4 Map   5 Queue si Deque   0 iesire");
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
                    ExempluCollection.ruleaza();
                    break;
                case "2":
                    ExempluList.ruleaza();
                    break;
                case "3":
                    ExempluSet.ruleaza();
                    break;
                case "4":
                    ExempluMap.ruleaza();
                    break;
                case "5":
                    ExempluQueueDeque.ruleaza();
                    break;
                default:
                    System.out.println("Alege 1-5 sau 0.");
            }
        }
    }
}
