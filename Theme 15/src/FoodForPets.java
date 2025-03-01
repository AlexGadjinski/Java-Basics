import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        int eatenFoodTotalSum = 0;
        int eatenFoodDogSum = 0;
        int eatenFoodCatSum = 0;
        double eatenBiscuits = 0;
        int counter = 0;

        for (int i = 1; i <= days; i++) {
            int foodEatenFromTheDog = Integer.parseInt(scanner.nextLine());
            int foodEatenFromTheCat = Integer.parseInt(scanner.nextLine());

            eatenFoodTotalSum += foodEatenFromTheDog + foodEatenFromTheCat;
            eatenFoodDogSum += foodEatenFromTheDog;
            eatenFoodCatSum += foodEatenFromTheCat;

            counter++;
            if (counter % 3 == 0) {
                eatenBiscuits += (foodEatenFromTheDog + foodEatenFromTheCat) * 0.10;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", eatenBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", eatenFoodTotalSum / totalFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", eatenFoodDogSum * 1.0 / eatenFoodTotalSum * 100);
        System.out.printf("%.2f%% eaten from the cat.", eatenFoodCatSum * 1.0 / eatenFoodTotalSum * 100);
    }
}
