import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int episodeDuration = Integer.parseInt(scanner.nextLine());
        int restDuration = Integer.parseInt(scanner.nextLine());

        double timeLeft = restDuration - ((restDuration / 8.0) + (restDuration / 4.0));

        if (timeLeft >= episodeDuration) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(timeLeft - episodeDuration));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(episodeDuration - timeLeft));
        }
    }
}
