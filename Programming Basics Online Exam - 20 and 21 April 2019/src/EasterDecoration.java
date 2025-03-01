import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customersCount = Integer.parseInt(scanner.nextLine());

        double totalPurchasesSum = 0;

        for (int i = 1; i <= customersCount; i++) {
            String currentPurchase = scanner.nextLine();
            double purchasesSum = 0;
            int purchasesCount = 0;

            while (!currentPurchase.equals("Finish")) {

                if (currentPurchase.equals("basket")) {
                    purchasesSum += 1.50;
                } else if (currentPurchase.equals("wreath")) {
                    purchasesSum += 3.80;
                } else if (currentPurchase.equals("chocolate bunny")) {
                    purchasesSum += 7;
                }

                purchasesCount++;
                currentPurchase = scanner.nextLine();
            }
            if (purchasesCount % 2 == 0) {
                purchasesSum *= 0.80;
            }
            totalPurchasesSum += purchasesSum;
            System.out.printf("You purchased %d items for %.2f leva.%n", purchasesCount, purchasesSum);
        }
        double average = totalPurchasesSum / customersCount;
        System.out.printf("Average bill per client is: %.2f leva.", average);
    }
}
