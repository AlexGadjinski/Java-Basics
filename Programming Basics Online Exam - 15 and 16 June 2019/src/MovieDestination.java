import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int daysCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (season.equals("Winter")) {
            switch (destination) {
                case "Dubai":
                    totalPrice = daysCount * 45000;
                    break;
                case "Sofia":
                    totalPrice = daysCount * 17000;
                    break;
                case "London":
                    totalPrice = daysCount * 24000;
                    break;
            }
        } else if (season.equals("Summer")) {
            switch (destination) {
                case "Dubai":
                    totalPrice = daysCount * 40000;
                    break;
                case "Sofia":
                    totalPrice = daysCount * 12500;
                    break;
                case "London":
                    totalPrice = daysCount * 20250;
                    break;
            }
        }
        if (destination.equals("Dubai")) {
            totalPrice *= 0.70;
        }
        if (destination.equals("Sofia")) {
            totalPrice *= 1.25;
        }
        if (budget >= totalPrice) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalPrice);
        } else {
            System.out.printf("The director needs %.2f leva more!", totalPrice - budget);
        }
    }
}
