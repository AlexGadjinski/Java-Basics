import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int confectionersCount = Integer.parseInt(scanner.nextLine());
        int cakesPerDayCount = Integer.parseInt(scanner.nextLine());
        int wafflesPerDayCount = Integer.parseInt(scanner.nextLine());
        int pancakesPerDayCount = Integer.parseInt(scanner.nextLine());

        double cakesPerDayPrice = cakesPerDayCount * 45;
        double wafflesPerDayPrice = wafflesPerDayCount * 5.80;
        double pancakesPerDayPrice = pancakesPerDayCount * 3.20;

        double sumTotalWithoutExpenses = daysCount * confectionersCount * (cakesPerDayPrice + wafflesPerDayPrice + pancakesPerDayPrice);
        double sumTotalWithExpenses = sumTotalWithoutExpenses - sumTotalWithoutExpenses * 1 / 8;

        System.out.printf("%.2f", sumTotalWithExpenses);
    }
}
