import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());
            double totalSum = 0;

            while (minBudget > totalSum) {
                double money = Double.parseDouble(scanner.nextLine());
                totalSum += money;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
