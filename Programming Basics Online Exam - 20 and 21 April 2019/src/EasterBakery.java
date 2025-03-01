import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPricePerKilo = Double.parseDouble(scanner.nextLine());
        double flourKilos = Double.parseDouble(scanner.nextLine());
        double sugarKilos = Double.parseDouble(scanner.nextLine());
        int eggshellsCount = Integer.parseInt(scanner.nextLine());
        int bakersYeastPackages = Integer.parseInt(scanner.nextLine());

        double flourPrice = flourKilos * flourPricePerKilo;
        double sugarPrice = sugarKilos * flourPricePerKilo * 0.75;
        double eggshellsPrice = eggshellsCount * flourPricePerKilo * 1.10;
        double bakersYeastPrice = bakersYeastPackages * ((flourPricePerKilo * 0.75) * 0.20);

        double totalPrice = flourPrice + sugarPrice + eggshellsPrice + bakersYeastPrice;

        System.out.printf("%.2f", totalPrice);
    }
}
