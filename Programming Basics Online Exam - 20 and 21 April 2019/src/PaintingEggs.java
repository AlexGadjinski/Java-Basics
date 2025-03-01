import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String colour = scanner.nextLine();
        int lotsCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (colour.equals("Red")) {
            switch (size) {
                case "Large":
                    totalPrice = lotsCount * 16;
                    break;
                case "Medium":
                    totalPrice = lotsCount * 13;
                    break;
                case "Small":
                    totalPrice = lotsCount * 9;
                    break;
            }
        } else if (colour.equals("Green")) {
            switch (size) {
                case "Large":
                    totalPrice = lotsCount * 12;
                    break;
                case "Medium":
                    totalPrice = lotsCount * 9;
                    break;
                case "Small":
                    totalPrice = lotsCount * 8;
                    break;
            }
        } else if (colour.equals("Yellow")) {
            switch (size) {
                case "Large":
                    totalPrice = lotsCount * 9;
                    break;
                case "Medium":
                    totalPrice = lotsCount * 7;
                    break;
                case "Small":
                    totalPrice = lotsCount * 5;
                    break;
            }
        }
        totalPrice *= 0.65;
        System.out.printf("%.2f leva.", totalPrice);
    }
}
