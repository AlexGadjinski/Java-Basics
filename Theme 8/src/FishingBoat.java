import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        switch (season) {
            case "Spring":
                totalPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                totalPrice = 4200;
                break;
            case "Winter":
                totalPrice = 2600;
                break;
        }
        if (fishermenCount <= 6) {
            totalPrice = totalPrice * 0.9;
        } else if (fishermenCount >= 7 && fishermenCount <= 11) {
            totalPrice = totalPrice * 0.85;
        } else {
            totalPrice = totalPrice * 0.75;
        }
        if (fishermenCount % 2 == 0 && !season.equals("Autumn")) {
            totalPrice = totalPrice * 0.95;
        }
        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", (budget - totalPrice));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", (totalPrice - budget));
        }
    }
}
