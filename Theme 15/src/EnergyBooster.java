import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (size.equals("small")) {
            switch (fruit) {
                case "Watermelon":
                    price = count * 2 * 56;
                    break;
                case "Mango":
                    price = count * 2 * 36.66;
                    break;
                case "Pineapple":
                    price = count * 2 * 42.10;
                    break;
                case "Raspberry":
                    price = count * 2 * 20;
                    break;
            }
        } else if (size.equals("big")) {
            switch (fruit) {
                case "Watermelon":
                    price = count * 5 * 28.70;
                    break;
                case "Mango":
                    price = count * 5 * 19.60;
                    break;
                case "Pineapple":
                    price = count * 5 * 24.80;
                    break;
                case "Raspberry":
                    price = count * 5 * 20;
                    break;
            }
        }
        if (price >= 400 && price <= 1000) {
            price *= 0.85;
        } else if (price > 1000) {
            price *= 0.50;
        }
        System.out.printf("%.2f lv.", price);
    }
}
