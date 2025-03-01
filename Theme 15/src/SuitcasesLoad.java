import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        int counter = 0;

        while (!input.equals("End")) {
            double suitcasesVolume = Double.parseDouble(input);
            counter++;

            if (counter % 3 == 0) {
                suitcasesVolume *= 1.1;
            }
            capacity -= suitcasesVolume;

            if (capacity < 0) {
                counter--;
                System.out.println("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.", counter);
                return;
            }

            input = scanner.nextLine();
        }
        System.out.println("Congratulations! All suitcases are loaded!");
        System.out.printf("Statistic: %d suitcases loaded.", counter);
    }
}
