import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakesCount = Integer.parseInt(scanner.nextLine());
        int eggshellsCount = Integer.parseInt(scanner.nextLine());
        int cookiesKilos = Integer.parseInt(scanner.nextLine());

        double easterCakesPrice = easterCakesCount * 3.20;
        double eggshellsPrice = eggshellsCount * 4.35;
        double cookiesPrice = cookiesKilos * 5.40;

        double totalPrice = easterCakesPrice + cookiesPrice + eggshellsPrice + (eggshellsCount * 12 * 0.15);

        System.out.printf("%.2f", totalPrice);
    }
}
