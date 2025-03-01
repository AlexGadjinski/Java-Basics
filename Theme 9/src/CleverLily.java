import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int moneyPerToy = Integer.parseInt(scanner.nextLine());

        double toyMoney = 0;
        double moneyFromBirthdays = 0;
        double moneyForTheBrother = 0;

        double currentMoney = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                currentMoney = currentMoney + 10;
                moneyFromBirthdays += currentMoney;
                moneyForTheBrother += 1;
            } else {
                toyMoney += moneyPerToy;
            }
        }
        double totalMoney = moneyFromBirthdays - moneyForTheBrother + toyMoney;

        if (totalMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", totalMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - totalMoney);
        }
    }
}
