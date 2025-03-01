import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timePerOneMeter = Double.parseDouble(scanner.nextLine());

        double hisTimeWithoutDelay = distanceInMeters * timePerOneMeter;
        double delayTimes = distanceInMeters / 50;
        delayTimes = Math.floor(delayTimes);

        double hisTimeWithDelay = hisTimeWithoutDelay + delayTimes * 30;

        if (hisTimeWithDelay >= currentRecord) {
            System.out.printf("No! He was %.2f seconds slower.", hisTimeWithDelay - currentRecord);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", hisTimeWithDelay);
        }
    }
}
