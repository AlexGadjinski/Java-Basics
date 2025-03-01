import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int daysCount = Integer.parseInt(scanner.nextLine());
        int ticketsCount = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percentForCinema = Integer.parseInt(scanner.nextLine());

        double totalIncome = (daysCount * ticketsCount * ticketPrice) - (daysCount * ticketsCount * ticketPrice) * percentForCinema / 100;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, totalIncome);
    }
}
