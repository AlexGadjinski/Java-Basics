import java.util.Scanner;

public class GraduationPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int counter = 1;
        int excluded = 0;
        double resultsSum = 0;

        while (counter <= 12) {
            double result = Double.parseDouble(scanner.nextLine());
            if (result < 4.00) {
                excluded++;
                if (excluded > 1) {
                    System.out.printf("%s has been excluded at %d grade", name, counter);
                    return;
                }
                continue;
            }
            resultsSum += result;
            counter++;
        }
        double averageResult = resultsSum / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, averageResult);
    }
}
