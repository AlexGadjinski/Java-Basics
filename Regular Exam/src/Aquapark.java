import java.util.Scanner;

public class Aquapark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();

        double totalPrice = 0;

        if (dayTime.equals("day")) {
            switch (month) {
                case "march":
                case "april":
                case "may":
                    totalPrice = peopleCount * hours * 10.50;
                    break;
                case "june":
                case "july":
                case "august":
                    totalPrice = peopleCount * hours * 12.60;
                    break;
            }
        } else if (dayTime.equals("night")) {
            switch (month) {
                case "march":
                case "april":
                case "may":
                    totalPrice = peopleCount * hours * 8.40;
                    break;
                case "june":
                case "july":
                case "august":
                    totalPrice = peopleCount * hours * 10.20;
                    break;
            }
        }
        if (peopleCount >= 4) {
            totalPrice *= 0.90;
        }
        if (hours >= 5) {
            totalPrice *= 0.50;
        }

        double pricePerPerson = totalPrice / peopleCount / hours;
        System.out.printf("Price per person for one hour: %.2f%n", pricePerPerson);
        System.out.printf("Total cost of the visit: %.2f", totalPrice);
    }
}
