import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();

        int totalTicketsCount = 0;
        int studentTicketCount = 0;
        int standardTicketCount = 0;
        int kidTicketCount = 0;


        while (!movieName.equals("Finish")) {
            int freeSpace = Integer.parseInt(scanner.nextLine());
            String ticketType = scanner.nextLine();

            int neededSpace = 0;

            while (!ticketType.equals("End")) {

                if (ticketType.equals("student")) {
                    studentTicketCount++;

                } else if (ticketType.equals("standard")) {
                    standardTicketCount++;

                } else if (ticketType.equals("kid")) {
                    kidTicketCount++;
                }
                totalTicketsCount++;
                neededSpace++;
                if (neededSpace >= freeSpace) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movieName, neededSpace * 1.0 / freeSpace * 100);
            movieName = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTicketsCount);
        System.out.printf("%.2f%% student tickets.%n", studentTicketCount * 1.0 / totalTicketsCount * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTicketCount * 1.0 / totalTicketsCount * 100);
        System.out.printf("%.2f%% kids tickets.", kidTicketCount * 1.0 / totalTicketsCount * 100);
    }
}
