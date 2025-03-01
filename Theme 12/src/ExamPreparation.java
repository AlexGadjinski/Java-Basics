import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int failedThreshold = Integer.parseInt(scanner.nextLine());
        String exerciseName = scanner.nextLine();

        int failedTimes = 0;
        double resultsSum = 0;
        int numberOfProblems = 0;
        String lastProblem = "";

        while (!exerciseName.equals("Enough")) {
            int exerciseResult = Integer.parseInt(scanner.nextLine());

            if (exerciseResult <= 4.00) {
                failedTimes++;
                if (failedTimes == failedThreshold) {
                    System.out.printf("You need a break, %d poor grades.", failedTimes);
                    return;
                }
            }
            resultsSum += exerciseResult;
            numberOfProblems++;
            lastProblem = exerciseName;

            exerciseName = scanner.nextLine();
        }
        double average = resultsSum * 1.0 / numberOfProblems;
        System.out.printf("Average score: %.2f%n", average);
        System.out.printf("Number of problems: %d%n", numberOfProblems);
        System.out.printf("Last problem: %s%n", lastProblem);

    }
}
