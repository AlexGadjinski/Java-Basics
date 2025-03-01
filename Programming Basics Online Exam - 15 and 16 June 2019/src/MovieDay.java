import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeForPhotos = Integer.parseInt(scanner.nextLine());
        int stagesCount = Integer.parseInt(scanner.nextLine());
        int stageDuration = Integer.parseInt(scanner.nextLine());

        double preparation = timeForPhotos * 0.15;

        double totalTime = stageDuration * stagesCount + preparation;

        if (timeForPhotos >= totalTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", timeForPhotos - totalTime);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", totalTime - timeForPhotos);
        }
    }
}
