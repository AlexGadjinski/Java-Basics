import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPoints = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (firstPoints <= 100) {
            bonusPoints = 5;
        } else if (firstPoints <= 1000) {
            bonusPoints = firstPoints * 0.20;
        } else {
            bonusPoints = firstPoints * 0.10;
        }
        if (firstPoints % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        } else if (firstPoints % 10 == 5) {
            bonusPoints = bonusPoints + 2;
        }
        System.out.println(bonusPoints);
        System.out.println(firstPoints + bonusPoints);
    }
}
