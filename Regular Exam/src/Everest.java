import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int totalMetres = 5364;
        int daysCounter = 1;

        while (!input.equals("END")) {
            int currentMetres = Integer.parseInt(scanner.nextLine());

            if (input.equals("Yes")) {
                daysCounter++;
            }
            if (daysCounter > 5) {
                break;
            }
            totalMetres += currentMetres;
            if (totalMetres >= 8848) {
                break;
            }
            input = scanner.nextLine();
        }
        if (totalMetres >= 8848) {
            System.out.printf("Goal reached for %d days!", daysCounter);
        } else {
            System.out.println("Failed!");
            System.out.println(totalMetres);
        }
    }
}
