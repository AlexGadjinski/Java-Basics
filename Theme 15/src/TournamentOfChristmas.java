import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        int totalWins = 0;
        int totalLosses = 0;
        double totalMoney = 0;

        for (int i = 1; i <= days; i++) {
            String input = scanner.nextLine();
            int winsPerDayCounter = 0;
            int lossesPerDayCounter = 0;
            double moneyPerDay = 0;

            while (!input.equals("Finish")) {
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    moneyPerDay += 20;
                    winsPerDayCounter++;
                    totalWins++;
                } else {
                    lossesPerDayCounter++;
                    totalLosses++;
                }
                input = scanner.nextLine();
            }
            if (winsPerDayCounter > lossesPerDayCounter) {
                moneyPerDay *= 1.10;
            }
            totalMoney += moneyPerDay;
        }
        if (totalWins > totalLosses) {
            totalMoney *= 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
