import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakesCount = Integer.parseInt(scanner.nextLine());

        int maxPoints = Integer.MIN_VALUE;
        String personMaxPoints = "";

        for (int i = 1; i <= easterCakesCount; i++) {
            String name = scanner.nextLine();
            String input = scanner.nextLine();
            int currentPointSum = 0;

            while (!input.equals("Stop")) {
                int currentPoints = Integer.parseInt(input);
                currentPointSum += currentPoints;

                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", name, currentPointSum);
            if (currentPointSum > maxPoints) {
                maxPoints = currentPointSum;
                personMaxPoints = name;
                System.out.printf("%s is the new number 1!%n", name);
            }
        }
        System.out.printf("%s won competition with %d points!", personMaxPoints, maxPoints);
    }
}
