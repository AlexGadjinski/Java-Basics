import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesPerDay = Integer.parseInt(scanner.nextLine());
        int walkingPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());

        int burnedCalories = minutesPerDay * walkingPerDay * 5;

        if (burnedCalories >= caloriesPerDay / 2) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }
    }
}
