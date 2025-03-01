import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int series = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        for (int i = 1; i <= series; i++) {
            String name = scanner.nextLine();
            double currentPrice = Double.parseDouble(scanner.nextLine());

            if (name.equals("Thrones")) {
                currentPrice *= 0.50;
            } else if (name.equals("Lucifer")) {
                currentPrice *= 0.60;
            } else if (name.equals("Protector")) {
                currentPrice *= 0.70;
            } else if (name.equals("TotalDrama")) {
                currentPrice *= 0.80;
            } else if (name.equals("Area")) {
                currentPrice *= 0.90;
            }

            totalPrice += currentPrice;
        }
        if (budget >= totalPrice) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - totalPrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", totalPrice - budget);
        }
    }
}
