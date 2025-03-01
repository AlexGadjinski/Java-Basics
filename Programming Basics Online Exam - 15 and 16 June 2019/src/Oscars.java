import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academicPoints = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        double totalPoints = academicPoints;

        for (int i = 1; i <= judges; i++) {
            String judgeName = scanner.nextLine();
            double currentPoints = Double.parseDouble(scanner.nextLine());

            currentPoints = judgeName.length() * currentPoints / 2;

            totalPoints += currentPoints;

            if (totalPoints >= 1250.50) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.50 - totalPoints);
    }
}
