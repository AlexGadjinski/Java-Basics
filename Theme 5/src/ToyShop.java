import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzlesNumber = Integer.parseInt(scanner.nextLine());
        int dollsNumber = Integer.parseInt(scanner.nextLine());
        int teddiesNumber = Integer.parseInt(scanner.nextLine());
        int minionsNumber = Integer.parseInt(scanner.nextLine());
        int trucksNumber = Integer.parseInt(scanner.nextLine());

        int totalNumber = puzzlesNumber + dollsNumber + teddiesNumber + minionsNumber + trucksNumber;

        double puzzlesPrice = puzzlesNumber * 2.60;
        double dollsPrice = dollsNumber * 3.00;
        double teddiesPrice = teddiesNumber * 4.10;
        double minionsPrice = minionsNumber * 8.20;
        double trucksPrice = trucksNumber * 2.00;

        double totalPrice = puzzlesPrice + dollsPrice + teddiesPrice + minionsPrice + trucksPrice;

        if (totalNumber >= 50) {
             totalPrice = totalPrice * 0.75;
        }
        totalPrice = totalPrice * 0.9;

        if (totalPrice >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(totalPrice - excursionPrice));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(excursionPrice - totalPrice));
        }
    }
}
