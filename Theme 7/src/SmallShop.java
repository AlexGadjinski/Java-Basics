import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;

        if (product.equals("coffee")) {
            switch (city) {
                case "Sofia":
                    totalPrice = 0.50 * quantity;
                    break;
                case "Plovdiv":
                    totalPrice = 0.40 * quantity;
                    break;
                case "Varna":
                    totalPrice = 0.45 * quantity;
                    break;
            }
        } else if (product.equals("water")) {
            switch (city) {
                case "Sofia":
                    totalPrice = 0.80 * quantity;
                    break;
                case "Plovdiv":
                case "Varna":
                    totalPrice = 0.70 * quantity;
                    break;
            }
        } else if (product.equals("beer")) {
            switch (city) {
                case "Sofia":
                    totalPrice = 1.20 * quantity;
                    break;
                case "Plovdiv":
                    totalPrice = 1.15 * quantity;
                    break;
                case "Varna":
                    totalPrice = 1.10 * quantity;
                    break;
            }
        } else if (product.equals("sweets")) {
            switch (city) {
                case "Sofia":
                    totalPrice = 1.45 * quantity;
                    break;
                case "Plovdiv":
                    totalPrice = 1.30 * quantity;
                    break;
                case "Varna":
                    totalPrice = 1.35 * quantity;
                    break;
            }
        } else if (product.equals("peanuts")) {
            switch (city) {
                case "Sofia":
                    totalPrice = 1.60 * quantity;
                    break;
                case "Plovdiv":
                    totalPrice = 1.50 * quantity;
                    break;
                case "Varna":
                    totalPrice = 1.55 * quantity;
                    break;
            }
        }
        System.out.println(totalPrice);
    }
}
