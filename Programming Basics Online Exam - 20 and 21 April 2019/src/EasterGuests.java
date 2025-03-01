import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guestsCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterCakesCount = Math.ceil(guestsCount / 3.0);
        double totalPrice = (easterCakesCount * 4) + (guestsCount * 0.45 * 2);

        if (budget >= totalPrice) {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", easterCakesCount, guestsCount * 2.0);
            System.out.printf("He has %.2f lv. left.", budget - totalPrice);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", totalPrice - budget);
        }
    }
}
