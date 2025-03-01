import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String pack = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (movie.equals("John Wick")) {
            switch (pack) {
                case "Drink":
                    totalPrice = ticketsCount * 12;
                    break;
                case "Popcorn":
                    totalPrice = ticketsCount * 15;
                    break;
                case "Menu":
                    totalPrice = ticketsCount * 19;
                    break;
            }
        } else if (movie.equals("Star Wars")) {
            switch (pack) {
                case "Drink":
                    totalPrice = ticketsCount * 18;
                    break;
                case "Popcorn":
                    totalPrice = ticketsCount * 25;
                    break;
                case "Menu":
                    totalPrice = ticketsCount * 30;
                    break;
            }
        } else if (movie.equals("Jumanji")) {
            switch (pack) {
                case "Drink":
                    totalPrice = ticketsCount * 9;
                    break;
                case "Popcorn":
                    totalPrice = ticketsCount * 11;
                    break;
                case "Menu":
                    totalPrice = ticketsCount * 14;
                    break;
            }
        }
        if (movie.equals("Star Wars") && ticketsCount >= 4) {
            totalPrice *= 0.70;
        }
        if (movie.equals("Jumanji") && ticketsCount == 2) {
            totalPrice *= 0.85;
        }
        System.out.printf("Your bill is %.2f leva.", totalPrice);
    }
}
