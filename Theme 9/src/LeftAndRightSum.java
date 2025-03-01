import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int firstSum = 0;
        int secondSum = 0;

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            firstSum += num;
        }
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            secondSum += num;
        }
        if (firstSum == secondSum) {
            System.out.printf("Yes, sum = %d", firstSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(firstSum - secondSum));
        }
    }
}
