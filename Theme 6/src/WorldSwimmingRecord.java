import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeForOneMetreDistance = Double.parseDouble(scanner.nextLine());

        double timesDelay = distanceInMetres / 15;
        timesDelay = Math.floor(timesDelay);
        double secondsDelay = timesDelay * 12.5;
        double totalTime = distanceInMetres * timeForOneMetreDistance + secondsDelay;

        if (totalTime < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - recordInSeconds);
        }
    }
}
