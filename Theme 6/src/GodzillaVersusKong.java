import java.util.Scanner;

public class GodzillaVersusKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int supernumeraryNumber = Integer.parseInt(scanner.nextLine());
        double clothingPriceForOneSupernumerary = Double.parseDouble(scanner.nextLine());

        double clothingPrice = supernumeraryNumber * clothingPriceForOneSupernumerary;
        double scenery = filmBudget * 0.10;

        if (supernumeraryNumber > 150) {
            clothingPrice = clothingPrice * 0.90;
        }
        double totalPrice = scenery + clothingPrice;
        if (totalPrice > filmBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(totalPrice - filmBudget));
        }
        if (totalPrice <= filmBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(filmBudget - totalPrice));
        }
    }
}
