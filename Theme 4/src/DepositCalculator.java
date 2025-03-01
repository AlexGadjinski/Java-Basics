import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double depositSum = Double.parseDouble(scanner.nextLine());
        int timeDeposit = Integer.parseInt(scanner.nextLine());
        double interestPerYear = Double.parseDouble(scanner.nextLine());

        double interestPerMonth = depositSum * interestPerYear / 100 / 12;
        double totalSum = depositSum + timeDeposit * interestPerMonth;

        System.out.printf("%.2f", totalSum);
    }
}
