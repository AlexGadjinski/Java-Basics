import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (dates.equals("21-23")) {
            switch (destination) {
                case "France":
                    totalPrice = nights * 30;
                    break;
                case "Italy":
                    totalPrice = nights * 28;
                    break;
                case "Germany":
                    totalPrice = nights * 32;
                    break;
            }
        } else if (dates.equals("24-27")) {
            switch (destination) {
                case "France":
                    totalPrice = nights * 35;
                    break;
                case "Italy":
                    totalPrice = nights * 32;
                    break;
                case "Germany":
                    totalPrice = nights * 37;
                    break;
            }
        } else if (dates.equals("28-31")) {
            switch (destination) {
                case "France":
                    totalPrice = nights * 40;
                    break;
                case "Italy":
                    totalPrice = nights * 39;
                    break;
                case "Germany":
                    totalPrice = nights * 43;
                    break;
            }
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalPrice);
    }
}
