import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int holidaysCount = Integer.parseInt(scanner.nextLine());
        int weekendsNotInSofiaVolleyball = Integer.parseInt(scanner.nextLine());

        int weekendsInSofia = 48 - weekendsNotInSofiaVolleyball;

        double weekendsInSofiaVolleyball = weekendsInSofia * 3.0/4;
        double holidaysVolleyball = holidaysCount * 2.0/3;

        double totalTimesVolleyball = weekendsNotInSofiaVolleyball + weekendsInSofiaVolleyball + holidaysVolleyball;

        if (year.equals("leap")) {
            totalTimesVolleyball *= 1.15;
            System.out.printf("%.0f", Math.floor(totalTimesVolleyball));
        } else if (year.equals("normal")) {
            System.out.printf("%.0f", Math.floor(totalTimesVolleyball));
        }
    }
}
