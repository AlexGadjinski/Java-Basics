import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double priceWithoutDiscount = area * 7.61;
        double discount = 0.18 * priceWithoutDiscount;
        double finalPrice = priceWithoutDiscount - discount;

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
