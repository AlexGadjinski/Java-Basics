import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodeDurationWithoutAds = Double.parseDouble(scanner.nextLine());

        double episodeDurationWithAds = episodeDurationWithoutAds + episodeDurationWithoutAds / 5;

        double totalMinutes = episodeDurationWithAds * episodes * seasons + seasons * 10;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name, Math.floor(totalMinutes));
    }
}
