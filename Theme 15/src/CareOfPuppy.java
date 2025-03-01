import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodInKilos = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int foodSum = 0;

        while (!input.equals("Adopted")) {
            int currentFood = Integer.parseInt(input);
            foodSum += currentFood;


            input = scanner.nextLine();
        }
        if (foodSum <= foodInKilos * 1000) {
            System.out.printf("Food is enough! Leftovers: %d grams.", (foodInKilos * 1000) - foodSum);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", foodSum - (foodInKilos * 1000));
        }
    }
}
