import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String typeHoliday = "";
        double totalPrice = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    totalPrice = budget * 0.30;
                    typeHoliday = "Camp";
                    break;
                case "winter":
                    totalPrice = budget * 0.70;
                    typeHoliday = "Hotel";
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    totalPrice = budget * 0.40;
                    typeHoliday = "Camp";
                    break;
                case "winter":
                    totalPrice = budget * 0.80;
                    typeHoliday = "Hotel";
                    break;
            }
        } else {
            destination = "Europe";
            typeHoliday = "Hotel";
            totalPrice = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeHoliday, totalPrice);
    }
}
