import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typePremises = scanner.nextLine();
        String evaluation = scanner.nextLine();

        int nightLodging = days - 1;
        double totalPrice = 0;

        if (days < 10) {
            switch (typePremises) {
                case "room for one person":
                    totalPrice = 18 * nightLodging;
                    break;
                case "apartment":
                    totalPrice = (25 * nightLodging) * 0.7;
                    break;
                case "president apartment":
                    totalPrice = (35 * nightLodging) * 0.9;
                    break;
            }
        } else if (days >= 10 && days <= 15) {
            switch (typePremises) {
                case "room for one person":
                    totalPrice = 18 * nightLodging;
                    break;
                case "apartment":
                    totalPrice = (25 * nightLodging) * 0.65;
                    break;
                case "president apartment":
                    totalPrice = (35 * nightLodging) * 0.85;
                    break;
            }
        } else {
            switch (typePremises) {
                case "room for one person":
                    totalPrice = 18 * nightLodging;
                    break;
                case "apartment":
                    totalPrice = (25 * nightLodging) * 0.5;
                    break;
                case "president apartment":
                    totalPrice = (35 * nightLodging) * 0.8;
                    break;
            }
        }
        switch (evaluation) {
            case "positive":
                totalPrice = 1.25 * totalPrice;
                break;
            case "negative":
                totalPrice = totalPrice * 0.9;
                break;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
