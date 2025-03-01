import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();

        double allPresentationsAverageGradesSum = 0;
        int presentationsCount = 0;

        while (!presentation.equals("Finish")) {
            double currentPresentationGradesSum = 0;
            for (int i = 1; i <= juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                currentPresentationGradesSum += grade;
            }
            allPresentationsAverageGradesSum += currentPresentationGradesSum / juryCount;
            System.out.printf("%s - %.2f.%n", presentation, currentPresentationGradesSum / juryCount);
            presentationsCount++;
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allPresentationsAverageGradesSum / presentationsCount);
    }
}
