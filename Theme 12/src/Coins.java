import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        int moneyCounter = 0;

        change = (int) (change * 100);


        while (change > 0) {

            if (change >= 200) {
                change -= 200;
                moneyCounter++;
            } else if (change >= 100) {
                change -= 100;
                moneyCounter++;
            } else if (change >= 50) {
                change -= 50;
                moneyCounter++;
            } else if (change >= 20) {
                change -= 20;
                moneyCounter++;
            } else if (change >= 10) {
                change -= 10;
                moneyCounter++;
            } else if (change >= 5) {
                change -= 5;
                moneyCounter++;
            } else if (change >= 2) {
                change -= 2;
                moneyCounter++;
            } else if (change >= 1) {
                change -= 1;
                moneyCounter++;
            }
        }
        System.out.println(moneyCounter);
    }
}
