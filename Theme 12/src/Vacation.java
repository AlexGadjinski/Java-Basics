import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int daysCounter = 0;
        int spendMoneyDaysCounter = 0;

        while (excursionMoney > ownedMoney && spendMoneyDaysCounter < 5) {
            String typeOperation = scanner.nextLine();
            double savedOrSpentMoney = Double.parseDouble(scanner.nextLine());

            if (typeOperation.equals("spend")) {
                ownedMoney -= savedOrSpentMoney;
                spendMoneyDaysCounter++;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            } else {
                ownedMoney += savedOrSpentMoney;
                spendMoneyDaysCounter = 0;
            }
            daysCounter++;
        }
        if (spendMoneyDaysCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        } else {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}
