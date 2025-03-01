import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsCount = Integer.parseInt(scanner.nextLine());
        double coverPerPersonPrice = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (guestsCount >= 10 && guestsCount <= 15) {
            coverPerPersonPrice *= 0.85;
        } else if (guestsCount >= 15 && guestsCount <= 20) {
            coverPerPersonPrice *= 0.80;
        } else if (guestsCount > 20) {
            coverPerPersonPrice *= 0.75;
        }
        double cakePrice = budget * 0.10;
        double totalPrice = cakePrice + (guestsCount * coverPerPersonPrice);

        if (budget >= totalPrice) {
            System.out.printf("It is party time! %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("No party! %.2f leva needed.", totalPrice - budget);
        }
    }
}
