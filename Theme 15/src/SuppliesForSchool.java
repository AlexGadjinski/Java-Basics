import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penCount = Integer.parseInt(scanner.nextLine());
        int markerCount = Integer.parseInt(scanner.nextLine());
        double cleanerLiters = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double penPrice = penCount * 5.80;
        double markerPrice = markerCount * 7.20;
        double cleanerPrice = cleanerLiters * 1.20;

        double totalPrice = penPrice + markerPrice + cleanerPrice;
        double totalPriceWithDiscount = totalPrice - (totalPrice * discount / 100);

        System.out.printf("%.3f", totalPriceWithDiscount);
    }
}
