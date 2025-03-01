import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakes = Integer.parseInt(scanner.nextLine());

        int totalSugar = 0;
        int totalFlour = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 1; i <= easterCakes; i++) {
            int currentSugar = Integer.parseInt(scanner.nextLine());
            int currentFlour = Integer.parseInt(scanner.nextLine());

            totalSugar += currentSugar;
            totalFlour += currentFlour;

            if (currentSugar > maxSugar) {
                maxSugar = currentSugar;
            }
            if (currentFlour > maxFlour) {
                maxFlour = currentFlour;
            }
        }
        System.out.printf("Sugar: %.0f%n", Math.ceil(totalSugar * 1.0 / 950));
        System.out.printf("Flour: %.0f%n", Math.ceil(totalFlour * 1.0 / 750));
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.", maxFlour, maxSugar);
    }
}
