import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double reward = 0;

        while (!input.equals("ACTION")) {
            if (input.length() <= 15) {
                reward = Double.parseDouble(scanner.nextLine());
            } else {
                reward = budget * 0.20;
            }
            budget -= reward;
            if (budget < 0) {
                System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("We are left with %.2f leva.", budget);
    }
}
